package codes.drinky.di;

import codes.drinky.di.controllers.*;
import codes.drinky.di.examplebeans.FakeDataSource;
import codes.drinky.di.examplebeans.FakeJmsBroker;
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


		FakeDataSource fakeDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser() + " " + fakeDataSource.getUrl());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) context.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUser());
	}

}

