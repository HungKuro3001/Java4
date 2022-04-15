package controllers.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.OrderDAO;
import DAO.OrderDetailDAO;
import entities.Oder;
import entities.Orderdetail;
import entities.User;

/**
 * Servlet implementation class HistoryController
 */
@WebServlet({"/users/history","/users/chitiet","/users/huy"})
public class HistoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      OrderDAO orderDAO = new OrderDAO();
      OrderDetailDAO orderDetailDAO = new OrderDetailDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HistoryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri = request.getRequestURI();
		if(uri.contains("history")) {
			this.history(request,response);
		}else if(uri.contains("chitiet")) {
			this.chitiet(request, response);
		}else if(uri.contains("huy")) {
			this.huy(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	protected void history(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       HttpSession session = request.getSession();
	       User u = (User) session.getAttribute("taikhoan");
			List<Oder> list  =this.orderDAO.findHoaDonByUser(u.getId());
			System.out.println(list.size());
			request.setAttribute("list", list);
			request.setAttribute("view", "/Views/user/history.jsp");
			request.getRequestDispatcher("/Views/user/index.jsp").forward(request, response);
		}
		protected void chitiet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      int id=  Integer.parseInt(request.getParameter("id"));
				List<Orderdetail> list  =this.orderDetailDAO.findHDCTbyHD(id);
				request.setAttribute("list", list);
				request.setAttribute("view", "/Views/user/chitiet.jsp");
				request.getRequestDispatcher("/Views/user/index.jsp").forward(request, response);
			}
		protected void huy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      try {
		    	    int id=  Integer.parseInt(request.getParameter("id"));
		    		Oder o = this.orderDAO.find(id);
		    		o.setTinhTrang(2);
		    		this.orderDAO.update(o);
		    		response.sendRedirect("/ASM_Java4/users/history");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			}
}
