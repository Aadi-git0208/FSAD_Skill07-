package RestfulCURD.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestfulCURD.Model.Student;

@RestController
@RequestMapping("/students")  //base url for this class
public class StudentController { //This is a POJO class a plain class is called POJO class
	@GetMapping("/{id}")
	//Read Operation
	public Student getData(@PathVariable int id) {
		Student s= new Student();
		s.setId(id);
		s.setName("Aditya");
		s.setCgpa(9.6);
		s.setDropout(false);
		return s;
	}
	//Create Operation
	@PostMapping("/insert")
	public String insertStudent(@RequestBody Student s) { //Student data need to be inserted from browser(web)
		return  "Student Data added\n" +
			    "Student Id="+s.getId()+"\n" +
		        "Student Name=" +s.getName()+"\n"+
		        "Student CGPA= "+s.getCgpa()+"\n"+
		        "Student Dropout Status"+s.isDropout();
	}
	//Update Operation
	@PutMapping("/update/{id}")
	public String updateStudent(@PathVariable int id,@RequestBody Student s) {
		return "Student Data Updated\n "+
	            "Student Id updated: " +id+"\n"+
				"Student Name=" +s.getName()+"\n"+
				"Student CGPA= "+s.getCgpa()+"\n"+
				"Student Dropout Status: "+s.isDropout();
	}
	
	//Delete Operation
	@DeleteMapping("/del/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable int id) {
		return ResponseEntity.ok("Student Data deleted"+id);
	}

}
