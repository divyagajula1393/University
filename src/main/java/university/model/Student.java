package university.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name= "ROLL_NUMBER")
	int roll;

	@Column(name= "FIRST_NAME")
	String fname;

	@Column(name= "LAST_NAME")
	String lname;

	@Column(name= "GENDER")
	String gender;
	
	@Column(name = "COLLEGE")
	String college;
	
	@Column(name = "DEPARTMENT")
	String department;
	
	@Transient
	@Column(name= "Department_Id")
	int d_id;

	
	@OneToOne
	Additional_Information ai;
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getDept() {
		return department;
	}

	public void setDept(String department) {
		this.department = department;
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	
	public Additional_Information getAi() {
		return ai;
	}

	public void setAi(Additional_Information ai) {
		this.ai = ai;
	}

	public Student() {
		
	}
	


	public Student( String fname, String lname, String gender, String college, String department, int d_id) {
		
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.college = college;
		this.department = department;
		this.d_id = d_id;
		
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", college="
				+ college + ", dept=" + department + ", d_id=" + d_id + ", ai=" + ai + "]";
	}




}
