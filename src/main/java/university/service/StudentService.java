package university.service;

import university.dao.StudentDao;
import university.model.Additional_Information;
import university.model.Response;
import university.model.Student;

public class StudentService {
	StudentDao stdao = new StudentDao();

	public Response saveStudentService(Student student, Additional_Information ai) {
		Student departmentCategorization = StudentService.dept_Categorization(student);
		return stdao.saveStudent(departmentCategorization, ai);

	}

	public static Student dept_Categorization(Student student) {

	String dept = student.getDept();
	
		switch(dept) {
		case "cse": 
			student.setD_id(1);
			break;
		case "mech":
			student.setD_id(2);
			break;
		case "civil":
			student.setD_id(3);
			break;
		case "ece":
			student.setD_id(4);
			break;
		}

		return student;

	}

	public Response getStudentService(int roll) {
		return stdao.getStudent(roll) ;
		
	}

}
