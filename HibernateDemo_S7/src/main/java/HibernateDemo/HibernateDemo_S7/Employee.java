package HibernateDemo.HibernateDemo_S7;
import javax.persistence.*;
@Entity         //This Entity Annotation is used to change the Entity class
@Table(name="EmployeeS7") //This is Table annotation used to change the name of table name in the database
public class Employee {
	@Id    //This Annotation is used to indicate Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 Integer regno;
	String First_Name;
	String Last_Name;

	public Integer getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

}
