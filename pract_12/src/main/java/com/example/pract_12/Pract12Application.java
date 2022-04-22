package com.example.pract_12;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Pract12Application {

	public static void main(String[] args) {
		ApplicationContext context = new
				AnnotationConfigApplicationContext(BeanConfig.class);

		Student student = context.getBean(Student.class);
		Hashing hashing = context.getBean(Hashing.class);

	}

}
