package DemoOnSpring.DemoOnSpringS7;

import java.util.List;

public class Employee1 {
	int empId;
	String empName;
	double empSalary;
	boolean empActive;
	List<String> empSkills;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId ;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public boolean isEmpActive() {
		return empActive;
	}
	public void setEmpActive(boolean empActive) {
		this.empActive = empActive;
	}
	public List<String> getEmpSkills() {
		return empSkills;
	}
	public void setEmpSkills(List<String> empSkills) {
		this.empSkills = empSkills;
	}
	//Create toString() method to display the output 
	@Override
	public String toString() {
		return "Details of Employee: "+" \nEmployeeId=" + empId + ",\nEmployeeName=" + empName + ", \nEmployeeSalary=" + empSalary + ", \nEmployeeActive="
				+ empActive + ", \nEmployeeSkills=" + empSkills + "";
	}
	

}
