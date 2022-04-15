package controllers.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.OrderDAO;
import DAO.OrderDetailDAO;
import entities.Oder;
import entities.Orderdetail;

/**
 * Servlet implementation class OrderManager
 */
@WebServlet({"/admin/orders/dahuy","/admin/orders/xacnhan","/admin/orders/danggiao","/admin/orders/dagiao","/admin/orders/update","/admin/orders/chitiet"})
public class OrderManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
	OrderDAO orderDAO = new OrderDAO();
	OrderDetailDAO detailDAO = new OrderDetailDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		if(uri.contains("xacnhan")) {
			this.xacnhan(request,response);
		}else if(uri.contains("danggiao")) {
			this.danggiao(request, response);
		}
		else if(uri.contains("dagiao")) {
			this.dagiao(request, response);
		}
		else if(uri.contains("dahuy")) {
			this.dahuy(request, response);
		}
		else if(uri.contains("chitiet")) {
			this.chitiet(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri= request.getRequestURI();
		   if(uri.contains("update")) {
			   this.update(request,response);
		   }
	}
	protected void xacnhan(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Oder> list =  this.orderDAO.findHoaDonbystatus(0);
		request.setAttribute("list", list);
		request.setAttribute("view", "/Views/admin/OrderManager.jsp");
		request.getRequestDispatcher("/Views/admin/index.jsp").forward(request, response);
	}
	protected void danggiao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Oder> list =  this.orderDAO.findHoaDonbystatus(1);
		request.setAttribute("list", list);
		request.setAttribute("view", "/Views/admin/OrderManager.jsp");
		request.getRequestDispatcher("/Views/admin/index.jsp").forward(request, response);
	}
	protected void dahuy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Oder> list =  this.orderDAO.findHoaDonbystatus(2);
		request.setAttribute("list", list);
		request.setAttribute("view", "/Views/admin/OrderManager.jsp");
		request.getRequestDispatcher("/Views/admin/index.jsp").forward(request, response);
	}
	protected void dagiao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Oder> list =  this.orderDAO.findHoaDonbystatus(3);
		request.setAttribute("list", list);
		request.setAttribute("view", "/Views/admin/OrderManager.jsp");
		request.getRequestDispatcher("/Views/admin/index.jsp").forward(request, response);
	}
	protected void chitiet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		List<Orderdetail> list =  this.detailDAO.findHDCTbyHD(id);
		Oder h = this.orderDAO.find(id);
		request.setAttribute("hoadon", h);
		request.setAttribute("list", list);
		System.out.println(list.get(0).getId() +" "+list.get(0).getProduct().getId());
		request.setAttribute("view", "/Views/admin/Detail.jsp");
		request.getRequestDispatcher("/Views/admin/index.jsp").forward(request, response);
		
	}
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		int id =Integer.parseInt( request.getParameter("id"));
		Oder h = this.orderDAO.find(id);
		int status = Integer.parseInt(request.getParameter("status"));
		int redirect = h.getTinhTrang();
		h.setTinhTrang(status);
		this.orderDAO.update(h);
		if(redirect == 0) {
			response.sendRedirect("/ASM_Java4/admin/orders/xacnhan");
		}else if(redirect == 1) {
			response.sendRedirect("/ASM_Java4/admin/orders/danggiao");
		}
		else if(redirect == 2) {
			response.sendRedirect("/ASM_Java4/admin/orders/dahuy");
		}else if(redirect == 3) {
			response.sendRedirect("/ASM_Java4/admin/orders/dagiao");
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	}

}
