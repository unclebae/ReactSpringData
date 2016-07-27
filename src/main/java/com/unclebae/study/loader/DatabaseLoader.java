package com.unclebae.study.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.unclebae.study.entity.Employee;
import com.unclebae.study.repository.EmployeeRepository;

import lombok.extern.log4j.Log4j;

@Log4j
@Component
public class DatabaseLoader implements CommandLineRunner {

	private final EmployeeRepository repository;
	
	@Autowired
	public DatabaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		repository.save(new Employee("Kido", "Bae", "Computer Engineer"));
		repository.save(new Employee("Uncle", "Bae", "Computer Scientist"));
		
		Employee firstData = repository.findOne(1L);
		System.out.println("First Data : " + firstData);
	}

}
