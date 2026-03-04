package CRUD_Operation.crud_OperationDemo;

import org.hibernate.Session;
import java.util.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App {
    public static void main(String[] args) {
        StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory sf = md.getSessionFactoryBuilder().build();
        Session s = sf.openSession();
        Transaction t;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the First name of Student: ");
        String Fname=sc.next();
        System.out.println("Enter the Last name of Student: ");
        String Lname= sc.next();
        System.out.println("Record Inserted Succussefully in the Database");
      //Insert Operation are doing 
        Student st = new Student();
        st.setFname(Fname);
        st.setLname(Lname);
        s.save(st);
        
        //Delete the record from the database
        System.out.println("Enter the regno where you have to delete the data: ");
        int regno = sc.nextInt();
        
        t= s.beginTransaction();
        t.commit();
        System.out.println("First name of student: " +st.getFname());
        System.out.println("Last name of Student: "+ st.getLname());
        System.out.println("Record inserted successfully");
        
    }
}
