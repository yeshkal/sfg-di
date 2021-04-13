package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyController;
import guru.springframework.sfgdi.controllers.SetterController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.getGreetingService().sayHello());

		ConstructorController constructorController = (ConstructorController) ctx.getBean("constructorController");
		System.out.println(constructorController.getGreetingService().sayHello());

		SetterController setterController = (SetterController) ctx.getBean("setterController");
		System.out.println(setterController.getGreetingService().sayHello());

		PropertyController propertyController = (PropertyController) ctx.getBean("propertyController");
		System.out.println(propertyController.getGreetingService().sayHello());

	}

}
