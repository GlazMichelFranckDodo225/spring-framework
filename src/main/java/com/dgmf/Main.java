package com.dgmf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// Instanciation du conteneur IoC (basée sur une
		// configuration XML)
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring.xml");

		Nurse nurse = context.getBean(Nurse.class);
		nurse.assist();
	}

}
