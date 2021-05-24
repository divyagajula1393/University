package university.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import university.model.Response;
import university.model.Student;
import university.service.StudentService;

public class ViewDetails implements Servlet{



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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		StudentService studentService = new StudentService();
		int roll = Integer.parseInt(req.getParameter("roll"));
		Response response = studentService.getStudentService(roll);
		Student student = response.getStudent();
		String html = 
				"<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>View patient</title>\r\n"
			    + "</head>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "<h1>Patient Details: </h1>\r\n"
				+ "\r\n" 	
				+"<h5>Patient ID : "+ student.getRoll() +"</h5>\r\n" 
				+"<h5>Patient Name : "+ student.getFname() + student.getLname() +"</h5>\r\n"
				+ "<h5>Patient Gender : " + student.getGender()+ "</h5>\r\n"
				+ "<h5>Patient Age : "+ student.getCollege()+"</h5>\r\n"
				+"<h5>Patient Category : "+ student.getDept()+"</h5>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		res.getWriter().write(html);
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
}
