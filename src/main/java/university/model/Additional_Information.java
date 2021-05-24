package university.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Additional_Information")
public class Additional_Information {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int a_id;
	String father_name;
	String mother_name;
	String email;

	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Additional_Information() {

	}

	public Additional_Information(String father_name, String mother_name, String email) {

		this.father_name = father_name;
		this.mother_name = mother_name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Additional_Information [a_id=" + a_id + ", father_name=" + father_name + ", mother_name=" + mother_name
				+ ", email=" + email + "]";
	}


}
