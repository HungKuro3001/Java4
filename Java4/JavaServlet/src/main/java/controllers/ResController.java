package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import beans.form_data.ResData;

/**
 * Servlet implementation class ResController
 */
@WebServlet("/ResController")
public class ResController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = "/views/Res.jsp";
		request.setAttribute("view", view);
		request.getRequestDispatcher("/views/layout.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ResData bean = new ResData();
		try {
			BeanUtils.populate(bean, request.getParameterMap());
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(bean.getHoten());
		System.out.println(bean.getDiachi());
		System.out.println(bean.getEmail());
		System.out.println(bean.getPassword());
		System.out.println(bean.getSdt());
		System.out.println(bean.getGioitinh());
		System.out.println(bean.getLoaiKH());
		
		
		
	}

}
