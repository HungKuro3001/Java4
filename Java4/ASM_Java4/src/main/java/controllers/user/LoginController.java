package controllers.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.UserDAO;
import Utils.enCryptUtil;
import entities.User;

/**
 * Servlet implementation class CheckLogin
 */
@WebServlet({ "/login", "/checklogin", "/logout" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDAO dao = new UserDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri = request.getRequestURI();
		if (uri.contains("login")) {
			this.index(request, response);
		} else if (uri.contains("logout")) {
			this.logout(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		if (uri.contains("checklogin")) {
			this.checklogin(request, response);
		}
	}
	protected void index(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/Views/login/login.jsp").forward(request, response);
	}

	protected void checklogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		try {
			String email = request.getParameter("email"); 
			String password = request.getParameter("password");
			User u = this.dao.checkLogin(email);
		
			if (u != null) {
				boolean check = enCryptUtil.check(password, u.getPassword());
				if (check) {
					session.setAttribute("taikhoan", u);
					if (u.getRole()) {
						response.sendRedirect("/ASM_Java4/admin/users/index");
					} else {
						response.sendRedirect("/ASM_Java4/users/index");
					}
				} else {
					session.setAttribute("message", "Password khÃ´ng chÃ­nh xÃ¡c");
					request.getRequestDispatcher("/Views/login/login.jsp").forward(request, response);
				}

			} else {
				session.setAttribute("message", "Email khÃ´ng tá»“n táº¡i");
				request.getRequestDispatcher("/Views/login/login.jsp").forward(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.setAttribute("message", "Email khÃ´ng tá»“n táº¡i");
			request.getRequestDispatcher("/Views/login/login.jsp").forward(request, response);
		}
	}

	protected void logout(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("taikhoan");
		response.sendRedirect("/ASM_Java4/users/index");
	}

}
