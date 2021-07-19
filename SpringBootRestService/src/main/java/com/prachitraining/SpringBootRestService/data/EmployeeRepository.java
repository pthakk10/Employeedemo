package com.prachitraining.SpringBootRestService.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prachitraining.SpringBootRestService.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee
, Long> {


}
