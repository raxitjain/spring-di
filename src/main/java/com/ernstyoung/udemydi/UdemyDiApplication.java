package com.ernstyoung.udemydi;

import com.ernstyoung.udemydi.controllers.*;
import com.ernstyoung.udemydi.models.FakeDataSource;
import com.ernstyoung.udemydi.models.FakeJMSBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UdemyDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(UdemyDiApplication.class, args);

		FakeDataSource fakeDataSource = (FakeDataSource) applicationContext.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername() + " " + fakeDataSource.getPassword() + " " + fakeDataSource.getUrl());
		FakeJMSBroker fakeJMSBroker = (FakeJMSBroker) applicationContext.getBean(FakeJMSBroker.class);
		System.out.println(fakeJMSBroker.getUsername() + " " + fakeJMSBroker.getPassword() + " " + fakeJMSBroker.getUrl());
//		MyController controller = (MyController) applicationContext.getBean("myController");
//		System.out.println(controller.sayHello());
//		System.out.println(applicationContext.getBean(PropertyInjectedController.class).getGreeting());
//		System.out.println(applicationContext.getBean(SetterInjectedController.class).getGreeting());
//		System.out.println(applicationContext.getBean(ConstructorInjectedController.class).getGreeting());
	}

}
