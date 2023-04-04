package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"Student","StudentController","StudentService"})
public class SpringbootEx1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEx1Application.class, args);
	}

}
