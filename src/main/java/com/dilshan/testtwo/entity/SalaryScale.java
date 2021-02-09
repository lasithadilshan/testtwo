package com.dilshan.testtwo.entity;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class SalaryScale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long salaryId;
	
	private String salaryType;
	
	
	@OneToMany
	private List<Employee> employees;


	public long getSalaryId() {
		return salaryId;
	}


	public void setSalaryId(long salaryId) {
		this.salaryId = salaryId;
	}


	public String getSalaryType() {
		return salaryType;
	}


	public void setSalaryType(String salaryType) {
		this.salaryType = salaryType;
	}


	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
