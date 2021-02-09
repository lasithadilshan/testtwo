package com.dilshan.testtwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dilshan.testtwo.repositary.EmployeeRepository;
import com.dilshan.testtwo.repositary.SalaryScaleRepository;
import com.dilshan.testtwo.service.EmployeeService;
import com.dilshan.testtwo.service.LeaveTypeService;
import com.dilshan.testtwo.service.SalaryScaleService;

@SpringBootApplication
public class TesttwoSpringBootApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	SalaryScaleRepository salaryScaleRepository;
	
	@Autowired
	SalaryScaleService salaryScaleService;
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	LeaveTypeService leaveTypeService;

	public static void main(String[] args) {
		SpringApplication.run(TesttwoSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		salaryScaleService.loadData();
		leaveTypeService.loadData();
		employeeService.loadData();
		employeeService.readEmpId();
		leaveTypeService.getleaveTypesList();
		salaryScaleService.getsalaryScale();
		employeeService.getEmployeesList();
		employeeService.findByContact_numbers();
		employeeService.findByNameAndContactNumber();
		employeeService.findByNameOrAge();
		employeeService.findByNameOrEmail();
//		employeeService.findBySalaryScale(salaryScaleId);
		
	}
}
