package DemoOnSpring.DemoOnSpringS7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

//        College c = (College)context.getBean("college1", College.class);
//        College c2 = (College)context.getBean("college2", College.class);
//
////        System.out.println("College Name: " + c.getCname());
//        System.out.println(c);
//        System.out.println(c2);
//       

        //Get Employee1 Bean
        Employee1 e1= (Employee1)context.getBean("emp1Bean");
        System.out.println(e1);
        System.out.println();
        //Get Employee2 Bean
        Employee1 e2 =(Employee1)context.getBean("emp2Bean");
        System.out.println(e2);
        context.close();
    }
}