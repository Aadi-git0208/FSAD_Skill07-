package RestfulCURD.Model;

public class Student {
	private int id;
	private String name;
	private double cgpa;
	private boolean dropout;
	public Student(){  //This is default constructor
		
	}
	/*/{Student is a POJO (Plain old Java Object).*/
	//It represent student data.
	//it contains:
	//id->student id
	//name->student name
	//Getter and setters are used to read and update values.}**/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public boolean isDropout() {
		return dropout;
	}
	public void setDropout(boolean dropout) {
		this.dropout = dropout;
	}
	
	
	
}
