package RestfulJPA2.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Student {
	int studentid;
	String studentname;
	String studentbranch;
	double Cgpa;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentbranch() {
		return studentbranch;
	}
	public void setStudentbranch(String studentbranch) {
		this.studentbranch = studentbranch;
	}
	public double getCgpa() {
		return Cgpa;
	}
	public void setCgpa(double cgpa) {
		Cgpa = cgpa;
	}
	
	

}
