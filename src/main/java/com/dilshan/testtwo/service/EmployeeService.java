package com.dilshan.testtwo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dilshan.testtwo.entity.Employee;
import com.dilshan.testtwo.entity.LeaveType;
import com.dilshan.testtwo.entity.SalaryScale;
import com.dilshan.testtwo.repositary.EmployeeRepository;
import com.dilshan.testtwo.repositary.SalaryScaleRepository;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private SalaryScaleService salaryScaleService;
	
	@Autowired
	private LeaveTypeService leaveTypeService;

	@Autowired
	SalaryScaleRepository salaryScaleRepository;
	
	
	
	SalaryScale salaryScaleOne;
	
	LeaveType leaveTypeIdOne;
	
	
	//This is a rest API method of save employee
	public Employee saveEmployee(Employee employee){
		
		return employeeRepository.save(employee);
		
	}
	
	
	//This is a employee table all data saving method
	public void loadData() {
		
		salaryScaleOne = salaryScaleService.readData();
		leaveTypeIdOne = leaveTypeService.savefkId();
		
		Employee employee1 = new Employee();
		employee1.setnIC("960654188V");
		employee1.setName("Dilshan");
		employee1.setAge(24);
		employee1.setEmail("dilshantilakaratne29@gmail.com");
		employee1.setContactNumber(773130036);
		employee1.setLeaveType(leaveTypeIdOne);
		employee1.setSalaryScale(salaryScaleOne);
		employeeRepository.save(employee1);
		
		Employee employee2 = new Employee();
		employee2.setnIC("976543233V");
		employee2.setName("Namal");
		employee2.setAge(23);
		employee2.setEmail("namal@gmail.com");
		employee2.setContactNumber(775654432);
		employee2.setLeaveType(leaveTypeIdOne);
		employee2.setSalaryScale(salaryScaleOne);
		employeeRepository.save(employee2);
		
			
	}
	
	
	//This search query method of search by contact number
	public List<Employee> findByContact_numbers(){
		
		List<Employee> employeeList3 = employeeRepository.findByContactNumber(773130036);

		
		for (Iterator<Employee> iterator = employeeList3.iterator(); iterator.hasNext();) {
			
			System.out.println("Search by Employee Contact Number : "+iterator.next().getContactNumber());
		}
		
		return employeeList3;
		
	}
	
	//This search query method of search by name & contact number
	public List<Employee> findByNameAndContactNumber(){
		
		List<Employee> employeeList4 = employeeRepository.findByNameAndContactNumber("Dilshan",773130036);

		
		for (Employee employee : employeeList4) {
			
			System.out.println(" Search by Employee Name : "+employee.getName()+"  & Contact No : "+employee.getContactNumber());
		}
		
		return employeeList4;
		
	}
	
	
	//This search query method of search by name Or age
	public List<Employee> findByNameOrAge(){
		
		List<Employee> employeeList5 = employeeRepository.findByNameOrAge("Dilshan",24);

		
		for (Employee employee : employeeList5) {
			
			System.out.println(" Search by Employee Name : "+employee.getName()+" Or Age : "+employee.getAge());
		}
		
		return employeeList5;
		
	}
	
	

	
	
	//This search query method of search by name Or age
	public List<Employee> findByNameOrEmail(){
		
		List<Employee> employeeList6 = employeeRepository.findByNameOrEmail("Dilshan","dilshantilakaratne29@gmail.com");

		
		for (Employee employee : employeeList6) {
			
			System.out.println(" Search by Employee Name : "+employee.getName() + " Or Email : " +employee.getEmail());
			
		}
		
		return employeeList6;
		
	}
	
	
	
	
	
	
	
	
	//This search query method of search by SalaryScale id
	public List<Employee> findBySalaryScale(long salaryScaleId){
		
		SalaryScale salaryScale1 = salaryScaleRepository.findById(salaryScaleId).orElse(null);

		return employeeRepository.findBySalaryScale(salaryScale1);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//This is a foreign employee id reading method
	public List<Employee> readEmpId() {
		
		int employeefkId;
		List<Employee> employeeList2 = new ArrayList<>();
		employeeRepository.findAll().forEach(Employee -> employeeList2.add(Employee));

		for (Iterator<Employee> iterator = employeeList2.iterator(); iterator.hasNext();) {
			
			Employee employee = (Employee) iterator.next();
			
			employeefkId=employee.getEmpId();
			
			System.out.println("Employee Foreign Key : "+employeefkId);
			
		}

		return employeeList2;
		
	}
	
	

	// This is a employee table data displaying method 
	public List<Employee> getEmployeesList() {

		List<Employee> employeeList = new ArrayList<>();
		employeeRepository.findAll().forEach(Employee -> employeeList.add(Employee));

		for (Iterator<Employee> iterator = employeeList.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			
			System.out.println("Employee ID             : "+employee.getEmpId());
			System.out.println("Employee NIC            : "+employee.getnIC());
			System.out.println("Employee Name           : "+employee.getName());
			System.out.println("Employee Age            : "+employee.getAge());
			System.out.println("Employee Email          : "+employee.getEmail());
			System.out.println("Employee Contact Number : "+employee.getContactNumber());
			System.out.println("Employee Leave ID       : "+employee.getLeaveType().getLeaveId());
			System.out.println("Employee Salary ID      : "+employee.getSalaryScale().getSalaryId());
			
		}

		return employeeList;
	}



	
	

}
