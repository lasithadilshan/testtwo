package com.dilshan.testtwo.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dilshan.testtwo.entity.Employee;
import com.dilshan.testtwo.entity.SalaryScale;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByContactNumber(int contactNumber);
	
	List<Employee> findByNameAndContactNumber(String name,int contactNumber);
	
	List<Employee> findByNameOrAge(String name,int age);
	
	List<Employee> findByNameOrEmail(String name,String email);
	
	List<Employee> findBySalaryScale(SalaryScale salaryScale);

	
}
