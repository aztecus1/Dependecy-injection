package com.springframework.Dependencyinjection;

import com.springframework.Dependencyinjection.controller.ContrurctorInjectedController;
import com.springframework.Dependencyinjection.controller.MyController;
import com.springframework.Dependencyinjection.controller.PropertyInjectedController;
import com.springframework.Dependencyinjection.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);
		System.out.println("----------- property");
		PropertyInjectedController propertyInjectedController= (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("----------- setter");
		SetterInjectedController setterInjectedController=(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		System.out.println("----------- constructor");
		ContrurctorInjectedController contrurctorInjectedController=(ContrurctorInjectedController) ctx.getBean("contrurctorInjectedController");
		System.out.println(contrurctorInjectedController.getGreeting());
	}

}