package com.bhat;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Dao1;
import com.model.Model1;

/**
 * Servlet implementation class ControlServlet
 */
@WebServlet("/control")
public class ControlServlet extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int experience = Integer.parseInt(request.getParameter("experience"));
		int age = Integer.parseInt(request.getParameter("age"));
		
		Dao1 da = new Dao1();
		int n = da.getObject(id, name, experience, age);
		
		//PrintWriter pt = response.getWriter();
		//pt.print("conrats! inserted data, check database");
		request.setAttribute("label", n);
		RequestDispatcher rd = request.getRequestDispatcher("View.jsp");
		rd.forward(request, response);
		
	}

}
