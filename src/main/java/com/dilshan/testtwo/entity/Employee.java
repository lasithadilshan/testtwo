package com.dilshan.testtwo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String nIC;
	private String name;
	private int age;
	private String email;
	private int contactNumber;
	
	@ManyToOne
	private SalaryScale salaryScale;
	
	@ManyToOne
	private LeaveType leaveType;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getnIC() {
		return nIC;
	}

	public void setnIC(String nIC) {
		this.nIC = nIC;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public SalaryScale getSalaryScale() {
		return salaryScale;
	}

	public void setSalaryScale(SalaryScale salaryScale) {
		this.salaryScale = salaryScale;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}
	
}
