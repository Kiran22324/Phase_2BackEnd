package com.simplilearn.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.entity.Subject;

/**
 * Servlet implementation class Teacher
 */
@WebServlet("/add-teacher")
public class Teacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Teacher() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("add-teacher2.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Teacher teacher=new Teacher();
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		
		String subject1=request.getParameter("Subject_1");
		String type1=request.getParameter("type1");
		
		String subject2=request.getParameter("Subject_2");
		String type2=request.getParameter("type2");
		
		String subject3=request.getParameter("Subject_3");
		String type3=request.getParameter("type3");
		
		//creating Subject object
		Subject s1=new Subject();
		s1.setSubject1_Physics(subject1);
		
		
		
		
		
		
	}

}
