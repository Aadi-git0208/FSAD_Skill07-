package DemoOnSpring.DemoOnSpringS7;

import org.springframework.beans.factory.annotation.Autowired;

public class College {
	
	
	String Cname;
//	@Autowired   //It is used to inject 
	Student stud;
	
	public College(){
		
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}
	@Override
	public String toString() {
		return "Collage name=" + Cname + "\n"+" Details of Student="+"\n" + stud ;
	}


}
