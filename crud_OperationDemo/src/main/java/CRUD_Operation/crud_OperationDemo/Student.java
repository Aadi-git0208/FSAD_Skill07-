package CRUD_Operation.crud_OperationDemo;
import javax.persistence.*;
@Entity
@Table(name = "StudentTable")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int regno;
	String fname;
	String lname;
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
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
	
	

}
