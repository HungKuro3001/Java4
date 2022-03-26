package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import Beans.Bai2_3data;

/**
 * Servlet implementation class Bai2_3
 */
@WebServlet("/Bai2_3")
public class Bai2_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bai2_3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/views/Bai2_3.jsp").forward(request,response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Bai2_3data bean = new Bai2_3data();
		try {
			BeanUtils.populate(bean,request.getParameterMap());
			request.setAttribute("bean",bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(bean.getTenDN());
		System.out.println(bean.getPass());
		System.out.println(bean.getGioiTinh());
		System.out.println(bean.getQuocTich());
		System.out.println(bean.getHobbies());
		System.out.println(bean.getGhiChu());
		request.getRequestDispatcher("/views/Bai2_3result.jsp").forward(request,response);
	}

}
