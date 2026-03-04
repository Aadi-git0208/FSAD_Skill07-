package DemoOnSpring.DemoOnSpringS7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredXMLMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("AutowiredXML.xml");
		
		//get Bean for Car dependent class
		AutowiredXMLCarClass c1 = context.getBean("car",AutowiredXMLCarClass.class);
		c1.drive();
	}


}
