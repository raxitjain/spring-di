package com.ernstyoung.udemydi;

import com.ernstyoung.udemydi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UdemyDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(UdemyDiApplication.class, args);

		I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
		System.out.println("------ Spring Profiles");
		System.out.println(i18nController.sayGreeting());

		MyController myController = (MyController) applicationContext.getBean("myController");
		System.out.println("------ Primary Bean dependency Injection");
		System.out.println(myController.sayHello());

		System.out.println("------ Property Based dependency Injection");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter Based dependency Injection");
		SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------ Constructor Based dependency Injection");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
