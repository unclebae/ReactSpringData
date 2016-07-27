package com.unclebae.study.repository;

import org.springframework.data.repository.CrudRepository;

import com.unclebae.study.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
