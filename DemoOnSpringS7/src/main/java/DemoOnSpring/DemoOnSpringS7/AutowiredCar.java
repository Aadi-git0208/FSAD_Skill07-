package DemoOnSpring.DemoOnSpringS7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //Spring creates the object(Create the Bean for the class).
public class AutowiredCar {
	@Autowired //Dependency Injection(Injecting dependency class)
	AutowiredEngine engine;
	public void drive() {
		engine.start();
		System.out.println("Car is Moving");
	}
	public void displayEngineType(String type) {
		engine.engineType(type);
		System.out.println("Type of Engine is " +engine.engineType);
	}

}
