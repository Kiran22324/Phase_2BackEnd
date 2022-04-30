package com.simplilearn.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadTeacher
 */
@WebServlet("/read-teacher")
public class ReadTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadTeacher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><style> table,th,td{border:1px solid}");
		out.println("</style></head>");
		out.println("<body>");
		out.println("<h1>Teacher's Assign To Subjects<table>");
		out.println("<tr><th>Teacher</th>");
		out.println("<th>Subjects</th>");
		out.println("</tr>");
		out.println("<tr><td>Kiran</td>");
		out.println("<td>Physics</td>");
		out.println("</tr>");
		
		out.println("<tr><td>Shreedhar</td>");
		out.println("<td>Maths</td>");
		out.println("</tr>");
		
		out.println("<tr><td>Laxman</td>");
		out.println("<td>Chemistry</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
