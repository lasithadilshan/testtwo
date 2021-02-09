package com.dilshan.testtwo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LeaveType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long leaveId;
	private double leaveCount;
	
	@OneToMany
	private List<Employee> employee;

	public long getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(long leaveId) {
		this.leaveId = leaveId;
	}

	public double getLeaveCount() {
		return leaveCount;
	}

	public void setLeaveCount(double leaveCount) {
		this.leaveCount = leaveCount;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
}
