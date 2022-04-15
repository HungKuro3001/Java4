package controllers.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CategoryDAO;
import DAO.ProductDAO;
import entities.Category;
import entities.Product;

/**
 * Servlet implementation class UserController
 */
@MultipartConfig
@WebServlet({"/users/index","/users/productDetail","/users/categories"})
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CategoryDAO cateDao = new CategoryDAO();
	ProductDAO productDao = new ProductDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		if(uri.contains("index")) {
			this.index(request,response);
		}else if(uri.contains("productDetail")) {
			this.productDetail(request,response);
		}else if(uri.contains("categories")) {
			this.categories(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	protected void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> list = this.productDao.getnewProduct();
		request.setAttribute("items", list);
		List<Category> categories= this.cateDao.findAll();
		request.setAttribute("categories", categories);
		  request.setAttribute("view", "/Views/user/TrangChu.jsp");
		request.getRequestDispatcher("/Views/user/index.jsp").forward(request, response);
	}
	protected void productDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Category> categories= this.cateDao.findAll();
		request.setAttribute("categories", categories);
		int id = Integer.parseInt(request.getParameter("id"));
	    Product p = this.productDao.find(id);
	  List<Product> list = this.productDao.findSanPhamlienquan(p.getCategory(),p.getId());
	  request.setAttribute("item", p);
		request.setAttribute("view", "/Views/user/productDetail.jsp");
		request.getRequestDispatcher("/Views/user/index.jsp").forward(request, response);
	}
	protected void  categories(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Category> categories= this.cateDao.findAll();
		request.setAttribute("categories", categories);
		int id = Integer.parseInt(request.getParameter("id"));
		Category c = this.cateDao.find(id);
		List<Product> list = this.productDao.findBycategori(id);
		System.out.println(list.size());
		request.setAttribute("products", list);
		request.setAttribute("c", c);
		request.setAttribute("view", "/Views/user/SanPhamTheLoai.jsp");
		request.getRequestDispatcher("/Views/user/index.jsp").forward(request, response);	
		System.out.println(list.toString());
	}

}
