package com.dcsb.jdbc.h2.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dcsb.jdbc.h2.example.student.Student;
import com.dcsb.jdbc.h2.example.student.StudentJdbcRepository;

@SpringBootApplication
public class SpringBoot2JdbcWithH2Application implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentJdbcRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2JdbcWithH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//findById(10001L));

		//insert(new Student(10010L, "dbsemp", "A1234657")));

		//update(new Student(10001L, "Name-Updated", "New-Passport")));

		//deleteById(10002L);

		//findAll());
	}
}
