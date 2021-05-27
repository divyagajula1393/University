package university.controller;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import university.dao.StudentDao;
import university.model.Additional_Information;
import university.model.Response;
import university.model.Student;
import university.service.StudentService;

public class SelectCollege extends HttpServlet{


	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("SERVLET INITIALIZED ***********************");

	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Response responseEntity;
		StudentService stdserve = new StudentService();
		String fName = req.getParameter("fname"); 
		String lName = req.getParameter("lname");
		String gender = req.getParameter("gender");
		
		String college = req.getParameter("college");
		String department = req.getParameter("department");
		
		//Additional student information 
		String father_name = req.getParameter("father_name");
		String mother_name = req.getParameter("mother_name");
		String email = req.getParameter("email");
	
		Additional_Information ai = new Additional_Information(father_name, mother_name, email);
		Student student = new Student(fName, lName, gender, college, department, 123);
		student.setAi(ai);
		
		responseEntity = stdserve.saveStudentService(student, ai);
		
		
		  HttpSession session = req.getSession();
		  session.setAttribute("responseEntity", responseEntity);
		  
		  //req.setAttribute("responseEntity", responseEntity); 
		  RequestDispatcher dispatcher = req.getRequestDispatcher("view_student.jsp");
		  dispatcher.forward(req, res);
		 
		
	}

	@Override
	public void destroy() {
		System.out.println("SERVLET DESTROYED ***********************");

	}

}
