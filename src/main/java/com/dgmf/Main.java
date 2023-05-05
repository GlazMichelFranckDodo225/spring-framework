package com.dgmf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// Instanciation du conteneur IoC (basée sur une
		// configuration XML)
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring.xml");

		Staff doctor = context.getBean(Doctor.class);
		Staff staff1 = context.getBean(Doctor.class);
		doctor.assist();
		staff1.assist();

		Staff nurse = context.getBean(Nurse.class);
		Staff staff2 = context.getBean(Nurse.class);
		nurse.assist();
		staff2.assist();


		System.out.println(doctor); // com.dgmf.Doctor@5fdcaa40
		System.out.println(staff1); // com.dgmf.Doctor@5fdcaa40
		System.out.println(nurse); // com.dgmf.Nurse@6dc17b83
		System.out.println(staff2); // com.dgmf.Nurse@6dc17b83
	}

}
