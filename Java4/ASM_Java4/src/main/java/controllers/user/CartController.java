package controllers.user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.OrderDAO;
import DAO.OrderDetailDAO;
import DAO.ProductDAO;
import entities.Cart;
import entities.ListCart;
import entities.Oder;
import entities.Orderdetail;
import entities.Product;
import entities.User;

import javax.servlet.annotation.MultipartConfig;


/**
 * Servlet implementation class CartController
 */
@MultipartConfig
@WebServlet({"/users/cart","/users/formcart","/users/xoaitem","/users/thanhtoan"})
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductDAO productDAO = new ProductDAO();
	OrderDAO  orderDAO = new OrderDAO();
	OrderDetailDAO orderDetailDAO = new OrderDetailDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		 if(uri.contains("xoaitem")) {
			 HttpSession session = request.getSession();
				ListCart listcart = (ListCart) session.getAttribute("cart");
				int id = Integer.parseInt(request.getParameter("id"));
				List<Cart> list = listcart.getOrder();
				for (int i = 0; i < list.size(); i++) {
					if(list.get(i).getProduct().getId() ==id) {
						list.remove(i);
					}
				}
				listcart.setOrder(list);
				session.setAttribute("cart", listcart);
				response.sendRedirect("/ASM_Java4/users/formcart");
		 }else if(uri.contains("formcart")) {
			 this.formcart(request,response);
		 }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		if(uri.contains("thanhtoan")) {
			this.thanhtoan(request,response);
		}else if(uri.contains("cart")) {
			this.create(request, response);
		}
	}
	protected void formcart(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	request.setAttribute("view", "/Views/user/orderDetail.jsp");
	request.getRequestDispatcher("/Views/user/index.jsp").forward(request, response);
	}
	protected void create(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("taikhoan");
			int id;
			int quantity = 1;
				id = Integer.parseInt(request.getParameter("id"));
				if ( request.getParameter("quantity") != null) {
					quantity = Integer.parseInt(request.getParameter("quantity"));
				}
				Product p = this.productDAO.find(id);

				if (session.getAttribute("cart") == null) {
					ListCart listcarr = new ListCart();
					List<Cart> list = new ArrayList<Cart>();
					Cart c = new Cart();
					c.setId(u.getId());
					c.setPrice(p.getDonGia());
					c.setProduct(p);
					c.setQuantity(quantity);
					list.add(c);
					listcarr.setOrder(list);
					session.setAttribute("cart", listcarr);
				} else {
					ListCart listcart = (ListCart) session.getAttribute("cart");
					List<Cart> list = listcart.getOrder();
					boolean check = false;
					for (Cart cart : list) {
						if (cart.getProduct().getId() == p.getId()) {
							check = true;
							cart.setQuantity(cart.getQuantity() + quantity);
						}
					}
					if (check == false) {
						Cart cart = new Cart();
						cart.setId(u.getId());
						cart.setPrice(p.getDonGia());
						cart.setProduct(p);
						cart.setQuantity(quantity);
						list.add(cart);
						listcart.setOrder(list);

					}
					session.setAttribute("cart", listcart);
				}
			int total = 0;
			if(session.getAttribute("cart") != null) {
				ListCart listcart = (ListCart) session.getAttribute("cart");
				for (Cart cart : listcart.getOrder()) {
					if(u.getId() == cart.getId()) {
						total += (cart.getPrice() * cart.getQuantity());
					}
				}
			}
			System.out.println(total);
			session.setAttribute("price", total);
			
			response.sendRedirect("/ASM_Java4/users/formcart");
		
		
	}
	protected void thanhtoan(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		ListCart listcart = (ListCart) session.getAttribute("cart");
		if(listcart == null) {
			session.setAttribute("message", "Không có sản phẩm nào trong giỏ hàng");
			response.sendRedirect("/ASM_Java4/users/formcart");
		}else {
		try {
			Oder o = new Oder();
			User u = (User) session.getAttribute("taikhoan");
			o.setUser(u);
			o.setMoTa("khong");
			o.setTinhTrang(0);
			o.setPhuongThuc(0);
			o.setTongTien((int)session.getAttribute("price"));
			this.orderDAO.insert(o);
			List<Cart> list = listcart.getOrder();
			System.out.println(o.getId());
			for (Cart cart : list) {
				Orderdetail od = new Orderdetail();
				od.setOder(o);
				od.setPrice(cart.getProduct().getDonGia());
				od.setProduct(cart.getProduct());
				od.setQuantity(cart.getQuantity());
				this.orderDetailDAO.insert(od);
			}
			session.setAttribute("message", "Thanh toán thành công");
			session.removeAttribute("cart");
			session.removeAttribute("price");
			response.sendRedirect("/ASM_Java4/users/formcart");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		}
	}
}
