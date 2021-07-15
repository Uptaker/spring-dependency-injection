package codes.drinky.di;

import codes.drinky.di.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiApplication.class, args);

		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());

		System.out.println("--------- primary bean ---------");

		MyController myController = (MyController) context.getBean("myController");

		System.out.println(myController.sayHello());

		System.out.println("--------- property ---------");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)  context.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- setter ---------");

		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------- constructor ---------");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}

}
