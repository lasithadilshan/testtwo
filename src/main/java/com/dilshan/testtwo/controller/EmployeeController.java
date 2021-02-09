package com.dilshan.testtwo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dilshan.testtwo.entity.Employee;
import com.dilshan.testtwo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/")
	public Employee saveEmployee(@RequestBody Employee employee) {
//		System.out.println("Employee Saving");
		
		LOGGER.error(":: saving employee :::: EmployeeController - saveEmployee ::");
		LOGGER.warn(":: saving employee :::: EmployeeController - saveEmployee ::");
		LOGGER.info(":: saving employee :::: EmployeeController - saveEmployee ::");
		LOGGER.debug(":: saving employee :::: EmployeeController - saveEmployee ::");
		
		return employeeService.saveEmployee(employee);
	}
	
	
	
	
	

	@GetMapping("/")
	public List<Employee> readEmployee() {
		LOGGER.info(":: read employee :::: EmployeeController - readEmployee ::");
		return employeeService.getEmployeesList();
	}
	
	
	
	
	@GetMapping("/salaryScale/{salaryId}")
	public List<Employee> findBySalaryScale(@PathVariable("salaryId") long salaryScaleId) {
		
		try {
			
			LOGGER.info(":: find By SalaryScale :::: EmployeeController - findBySalaryScale ::");
			
			return employeeService.findBySalaryScale(salaryScaleId);
			
		} catch (Exception e) {
			e.getMessage();
			LOGGER.error(":: find By Salary Scale Catch :::: EmployeeController - findBySalaryScale ::");
			return null;
		}
			
	}
	
	
	
	
	
	
	
	
	@GetMapping("/contactNumber/{contactNumber}")
	public Employee findByContactNumber(@PathVariable("contactNumber") int contactNumber) {
//		System.out.println("contactNumber Saved");
		LOGGER.info(":: findByContactNumber :::: EmployeeController - findByContactNumber ::");
		return new Employee();
	}
	
	@GetMapping("/contactNumber")
	public Employee findByContactNum(@RequestParam("contactNum") int contactNumber) {
//		System.out.println("contactNum Saved");

		LOGGER.info(":: findByContactNum :::: EmployeeController - findByContactNum ::");
		
		return new Employee();
	}
	
	
	@GetMapping("/empdetails")
	public List<Employee> getEmployeesList(@PathVariable Employee employee) {
//		System.out.println("Employee Details Saving");
		LOGGER.info(":: getEmployeesList :::: EmployeeController - getEmployeesList ::");
		return employeeService.getEmployeesList();
	}
	
	
	
	@GetMapping("/name/{name}/contactNumber/{contactNumber}")
	public Employee findByNameAndContactNumber(@PathVariable("name") String name,@PathVariable("contactNumber") int contactNumber) {
//		System.out.println("findByNameAndContactNumber Saved");
		LOGGER.info(":: findByNameAndContactNumber :::: EmployeeController - findByNameAndContactNumber ::");
		return new Employee();
	}
	
	@GetMapping("/name/{name}/email/{email}")
	public Employee findByNameOrEmail(@PathVariable("name") String name,@PathVariable("email") String email) {
//		System.out.println("findByNameOrEmail Saved");
		LOGGER.info(":: findByNameOrEmail :::: EmployeeController - findByNameOrEmail ::");
		return new Employee();
	}
}
