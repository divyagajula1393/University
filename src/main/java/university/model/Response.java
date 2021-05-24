package university.model;

public class Response {
	Student student;
	String status;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Response() {
		
	}
	public Response(Student student, String status) {
	
		this.student = student;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Response [student=" + student + ", status=" + status + "]";
	}
	

	
	
}
