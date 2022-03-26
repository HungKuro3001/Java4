package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;

import beans.StudentServlet;

/**
 * Servlet implementation class StuController
 */
@WebServlet("/StuController")
public class StuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<StudentServlet> ds = new ArrayList<StudentServlet>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StuController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("view","/views/Tabel.jsp");
		request.getRequestDispatcher("/views/Student.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/Student.jsp");
		DateTimeConverter dtc = new DateConverter( new Date());
		dtc.setPattern("MM/dd/yyyy");
		ConvertUtils.register(dtc, Date.class);
		StudentServlet stu = new StudentServlet();
		ds.add(stu);
		request.setAttribute("view","/views/Tabel.jsp");
	
		try {
			BeanUtils.populate(stu, request.getParameterMap());
			request.setAttribute("ds",ds);
			System.out.println(stu.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		dispatcher.forward(request,response);
	}
}


