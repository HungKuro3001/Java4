package controllers.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import DAO.UserDAO;
import Utils.enCryptUtil;
import entities.User;

/**
 * Servlet implementation class UserManager
 */
@WebServlet({"/admin/users/index", "/admin/users/create", "/admin/users/store", "/admin/users/edit", "/admin/users/update",
    "/admin/users/delete",})
public class UserManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDAO dao = new UserDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserManager() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
        if (uri.contains("index")) {
            this.index(request, response);
        } else if (uri.contains("delete")) {
            this.delete(request, response);
        } else if (uri.contains("edit")) {
            this.edit(request, response);

        } else {
            // not found 404
            response.sendError(404);
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
        } else {
            // not found 404
            response.sendError(404);
        }
	}

	private void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name ="";
        if (request.getParameter("name") != null) {
            name = request.getParameter("name");

        }
        int page = 1;
        if (request.getParameter("page") != null) {
            page = Integer.parseInt(request.getParameter("page"));
        }
        List<User> list = this.dao.findUserByName(name, page,5);
        int pageCount  = (int) Math.ceil(this.dao.getCount(name)/5.0);
        request.setAttribute("name", name);
        request.setAttribute("pageCount", pageCount);
        request.setAttribute("users", list);
        request.setAttribute("view","/Views/admin/UserManager.jsp");
        request.getRequestDispatcher("/Views/admin/index.jsp").forward(request, response);

    }
	private void store (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        try {
            User user = new User();
            BeanUtils.populate(user, request.getParameterMap());
            String password = enCryptUtil.encrypt(user.getPassword());
            user.setPassword(password);
            this.dao.insertUser(user);
            session.setAttribute("message", "Thêm mới thành công");
            response.sendRedirect(request.getContextPath() + "/admin/users/index");

        } catch (Exception e) {
            e.printStackTrace();
            session.setAttribute("error", "Thêm mới thất bại");
            response.sendRedirect(request.getContextPath() + "/admin/users/index");
        }
    }
	private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        try {
            User user = new User();
            BeanUtils.populate(user, request.getParameterMap());
            User passOld = this.dao.findUserById(user.getId());
            user.setPassword(passOld.getPassword());
            this.dao.updateUser(user);
            session.setAttribute("message", "Cập nhật thành công");
        }catch (Exception e) {
            e.printStackTrace();
            session.setAttribute("error", "Cập nhật thất bại");
            response.sendRedirect(request.getContextPath() + "/admin/users/index");
        }
    }

	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            User user = this.dao.findUserById(id);
            this.dao.deleteUser(user);
            session.setAttribute("message", "Xóa thành công");
        } catch (Exception e) {
            e.printStackTrace();
            session.setAttribute("error", "Xóa thất bại");
        }
        response.sendRedirect(request.getContextPath() + "/admin/users/index");
    }
    private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = this.dao.findUserById(id);
        request.setAttribute("user", user);
        request.setAttribute("view", "/Views/admin/UserEdit.jsp");
        request.getRequestDispatcher("/Views/admin/index.jsp").forward(request, response);
    }
}
