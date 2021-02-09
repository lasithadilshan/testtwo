package com.dilshan.testtwo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dilshan.testtwo.entity.Employee;
import com.dilshan.testtwo.entity.SalaryScale;
import com.dilshan.testtwo.repositary.SalaryScaleRepository;

@Service
public class SalaryScaleService {

	@Autowired
	private SalaryScaleRepository salaryScaleRepository;
	
	@Autowired
	private EmployeeService employeeService;
	
	List<Employee> employeeList2;
	
	
	//This is a rest API method of save employee
	public SalaryScale saveSalaryScale(SalaryScale salaryScale){
		
		return salaryScaleRepository.save(salaryScale);
		
	}
	
	//This is a Salary Scale Data Saving Method
	public void loadData() {
		
		employeeList2 = employeeService.readEmpId();

		SalaryScale salaryScale1 = new SalaryScale();
		salaryScale1.setSalaryType("Highest Salary Rate");
		salaryScale1.setEmployees(employeeList2);
		salaryScaleRepository.save(salaryScale1);

		SalaryScale salaryScale2 = new SalaryScale();
		salaryScale2.setSalaryType("Medium Salary Rate");
		salaryScale2.setEmployees(employeeList2);
		salaryScaleRepository.save(salaryScale2);

		SalaryScale salaryScale3 = new SalaryScale();
		salaryScale3.setSalaryType("Lowest Salary Rate");
		salaryScale3.setEmployees(employeeList2);
		salaryScaleRepository.save(salaryScale3);
	
	}
		
	
	//This is a foreign salary scale id reading method
	public SalaryScale readData() {
		
		SalaryScale salaryScaleOne;
		long salaryId = 1;
		salaryScaleOne = salaryScaleRepository.findById(salaryId).get();
		return salaryScaleOne;
		
	}
	

	//This is a salary scale table data displaying method
	public List<SalaryScale> getsalaryScale() {

		List<SalaryScale> salaryScaleList = new ArrayList<>();
		salaryScaleRepository.findAll().forEach(SalaryScale -> salaryScaleList.add(SalaryScale));

		for (Iterator<SalaryScale> iterator = salaryScaleList.iterator(); iterator.hasNext();) {
			SalaryScale salaryScale = (SalaryScale) iterator.next();

			System.out.println("Salary ID   : "+salaryScale.getSalaryId());
			System.out.println("Salary Type : "+salaryScale.getSalaryType());

		}

		return salaryScaleList;
	}

}
