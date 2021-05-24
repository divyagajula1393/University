package university.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import university.configuration.DbConfig;
import university.model.Additional_Information;
import university.model.Response;
import university.model.Student;

public class StudentDao {

	DbConfig config = new DbConfig();
	
	
	public Response saveStudent(Student student, Additional_Information ai) {
		
		Response response = new Response();
		try {
			SessionFactory factory = config.getSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(student);
			session.save(ai);
			response.setStudent(student);
			response.setStatus("success");
			transaction.commit();
			return response;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			response.setStudent(null);
			response.setStatus("failed");
			return response;
		}
	}
	
	
	
	public Response getStudent(int roll) {
		
		Response response = new Response();
		try(SessionFactory factory = config.getSessionFactory()){
			
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			Student student1 = session.get(Student.class, roll);
			response.setStudent(student1);
			response.setStatus("Sucess");
			transaction.commit();
			return response;
		}
		catch(Exception e) {
		
			System.out.println(e.getMessage());
			response.setStatus("Failed");
			return response;
		}
		
	}
}
