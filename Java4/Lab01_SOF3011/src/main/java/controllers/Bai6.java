package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bai6
 */
@WebServlet("/Bai6")
public class Bai6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bai6() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/views/param/Bai6_form.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double chieudai = Double.parseDouble(request.getParameter("chieudai"));
		double chieurong = Double.parseDouble(request.getParameter("chieurong"));
		double chuvi = (chieudai+chieurong)*2;
		double dientich = chieudai*chieurong;
		request.setAttribute("chuvi",chuvi);
		request.setAttribute("dientich",dientich);
		request.getRequestDispatcher("/views/param/Bai6_kq.jsp").forward(request, response);
		
	}

}
