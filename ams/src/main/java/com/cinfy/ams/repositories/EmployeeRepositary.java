package com.cinfy.ams.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.cinfy.ams.model.Employee;



public interface EmployeeRepositary extends JpaRepository<Employee, Long>,JpaSpecificationExecutor<Employee> {
	
	
	

}
