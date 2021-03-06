package controllers.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import DAO.CategoryDAO;
import entities.Category;

/**
 * Servlet implementation class CategoryManager
 */
@WebServlet({ "/admin/categories/index", "/admin/categories/store", "/admin/categories/update", "/admin/categories/delete"})
public class CategoryManager extends HttpServlet {
	private  final Logger logger = Logger.getLogger(CategoryManager.class);
	private static final long serialVersionUID = 1L;
	CategoryDAO dao = new CategoryDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		if (uri.contains("index")) {
			this.index(request, response);
		}else if(uri.contains("delete")) {
			this.delete(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		if (uri.contains("store")) {
			this.store(request, response);
		} else if (uri.contains("update")) {
			this.update(request, response);
		}
	}
	protected void index(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name= "";
		if(request.getParameter("name") !=null) {
			name = request.getParameter("name");
		}
		List<Category> list = this.dao.getCategorybyName(name);
		request.setAttribute("categories", list);
		request.setAttribute("view", "/Views/admin/CategoryManager.jsp");
		request.getRequestDispatcher("/Views/admin/index.jsp").forward(request, response);
	}
	protected void store(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  BasicConfigurator.configure();  
		 HttpSession session = request.getSession();
		try {
			Category c = new Category();
			String ten = request.getParameter("ten");
			c.setTen(ten);
		     this.dao.insert(c);
		     session.setAttribute("message", "Th??m th??nh c??ng");
		     logger.info("Th??m th??? lo???i : ID = "+c.getId() +"   T??n : "+c.getTen());
		     response.sendRedirect("/ASM_Java4/admin/categories/index");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			  session.setAttribute("error", "Th??m th???t b???i");
			     response.sendRedirect("/ASM_Java4/admin/categories/index");
		}
	}
	protected void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 BasicConfigurator.configure();  
		 HttpSession session = request.getSession();
			try {
				Category c = new Category();
				String ten = request.getParameter("ten");
				int id =Integer.parseInt( request.getParameter("id"));
				c.setTen(ten);
				c.setId(id);
			     this.dao.update(c);
			     session.setAttribute("message", "C???p nh???t th??nh c??ng");  
			     response.sendRedirect("/ASM_Java4/admin/categories/index");
			     logger.info("C???p nh???t th??? lo???i : ID = "+c.getId() +"   T??n : "+c.getTen());
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				  session.setAttribute("error", "C???p nh???t th???t b???i");
				     response.sendRedirect("/ASM_Java4/admin/categories/index");
			}
	}

	protected void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 BasicConfigurator.configure();
		 HttpSession session = request.getSession();
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			Category c = this.dao.find(id);
			this.dao.delete(c);
			 session.setAttribute("message", "X??a th??nh c??ng");
		     response.sendRedirect("/ASM_Java4/admin/categories/index");
		     logger.info("X??a th??? lo???i : ID = "+c.getId() +"   T??n : "+c.getTen());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			 session.setAttribute("error", "X??a th???t b???i");
		     response.sendRedirect("/ASM_Java4/admin/categories/index");
		}
	}
}
