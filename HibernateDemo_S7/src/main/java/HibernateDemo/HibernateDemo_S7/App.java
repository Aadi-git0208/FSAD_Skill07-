package HibernateDemo.HibernateDemo_S7;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class App {
    public static void main(String[] args) {
    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	//creating a object of Sta   ndardService
    	Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();
    	SessionFactory sf = md.getSessionFactoryBuilder().build();
    	Session s = sf.openSession();
    	Transaction t;// it is used to rollback and commit
//    	//Update record to in the table Employee
//    	Employee e1 = new Employee();
//    	Employee e = s.find(Employee.class,7 ); //find() is used to find the class . Find() method is one of the CRUD Operation
    	//here e find to second record and Update it
//    	System.out.println("First Name Before Update: " +e.First_Name);
//    	System.out.println("Second Name Before Update: " +e.Last_Name);
//    	System.out.println("Updating Record in a Table");
    	
    	//To delete record in the table Employee
//    	Employee e = s.find(Employee.class,5);
//    	System.out.println("First Name Before Delete: " +e.First_Name);
//    	System.out.println("second Name Before Delete: " +e.Last_Name);
//    	System.out.println("Deleting the record in the table");
//    	s.delete(e);// here the object is deleted , where e points to record 2
    	
    	//Insert the value into employee class	
//    	e1.setFirst_Name("Sonu");
//    	e1.setLast_Name("Shrivastava");
//    	s.save(e1); //s is use for Session and s.save() that is used to save the employee table
    	
    	// Read all Record 
//    	Query q = s.createQuery( "FROM Employee");
//    	List<Employee> list = q.list();
//    	for(Employee e: list) {
//    		System.out.println(e.getRegno()+" "+e.getFirst_Name()+ " " + e.getLast_Name());
//    	}
    	
    
    	//Read with WHERE Condition
//    	Query q = s.createQuery("FROM Employee WHERE First_Name='Aditya'");
//    	List <Employee> list = q.list();
//    	for(Employee e: list) {
//    		System.out.println(e.getRegno()+" "+e.getFirst_Name()+ " " + e.getLast_Name());
//    	}
    	
    	//Read Using Parameter(Best Practice)
//    	Query q = s.createQuery("FROM Employee WHERE First_Name=:fn"); //createQuery is belong to session class 
//    	q.setParameter("fn","Priyanshu"); //setParameter belong to query class
//    	List <Employee> list = q.list();
//    	for(Employee e: list) {
//    		System.out.println(e.getRegno()+" "+e.getFirst_Name()+ " " + e.getLast_Name());
//    	}
    	
    	//Read Single Record
//    	Query q = s.createQuery("FROM Employee WHERE regno=15");
//    	List <Employee> list = q.list();
//    	for(Employee e: list) {
//    		System.out.println(e.getRegno()+" "+e.getFirst_Name()+ " " + e.getLast_Name());
//    	}
    	
    	//using Named Parameter
//    	Query q = s.createQuery("From Employee where regno=:rno");
//    	q.setParameter("rno", 15);
//    	List <Employee> list = q.list();
//    	for(Employee e: list) {
//    		System.out.println(e.getRegno()+" "+e.getFirst_Name()+ " " + e.getLast_Name());
//    	}
    	
    	//Using Aggrigation Funtion(Count)
//    	Query q = s.createQuery("SELECT COUNT(e) FROM Employee e");
//    	Long count = (Long)q.uniqueResult();
//    	System.out.println("Employee count = "+count);
    	
    	//Using Aggrigation Funtion(Sum)
//    	Query<Long> q = s.createQuery("SELECT SUM(e.regno) FROM Employee e",Long.class);
//    	Long total = q.uniqueResult();
//    	System.out.println("Total number of employee sum is : " +total);
    	
    	//Using Aggrigation Funtion(average)
//    	Query q = s.createQuery("SELECT avg(e.regno) FROM Employee e");
//    	Double total = (Double)q.uniqueResult();
//    	System.out.println("Total number of employee average is : " +total);
//    	
    	
    	//Sorting the data in the table
    	//using ORDER BY(sorting)
    	Query q = s.createQuery("FROM Employee e ORDER BY e.Last_Name ASC");//for Acending Order is ASC and for Decending order is DESC
    	List<Employee>list=q.list();
    	for(Employee e: list) {
    		System.out.println(e.getRegno()+" "+e.getFirst_Name()+ " " + e.getLast_Name());
    	}
    	t = s.beginTransaction(); //Object of Transaction t and s.beginTransaction() is use to begin the transaction
    	t.commit();  //To commit the database operation
    	
//    	System.out.println("First Name After Update: " +e.getFirst_Name());
//    	System.out.println("Last Name After Update : " +e.getLast_Name());
//    	System.out.println("Record Inserted Successfully");
//    	System.out.println("Record is deleted");
    	
    }
}
