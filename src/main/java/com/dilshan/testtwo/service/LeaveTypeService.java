package com.dilshan.testtwo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dilshan.testtwo.entity.LeaveType;
import com.dilshan.testtwo.repositary.LeaveTypeRepository;

@Service
public class LeaveTypeService {

	@Autowired
	private LeaveTypeRepository leaveTypeRepository;
	
	//This is a rest API method of save leaveType
	public LeaveType saveLeaveType(LeaveType leaveType){
		
		return leaveTypeRepository.save(leaveType);
		
	}
	
	
	
	public LeaveType findByLeaveCount(LeaveType leaveType) {
		
		return leaveTypeRepository.save(leaveType);
	}
	

	public void loadData() {
		LeaveType leaveType1 = new LeaveType();
		leaveType1.setLeaveCount(3);
		leaveTypeRepository.save(leaveType1);

		LeaveType leaveType2 = new LeaveType();
		leaveType2.setLeaveCount(4);
		leaveTypeRepository.save(leaveType2);
		
		LeaveType leaveType3 = new LeaveType();
		leaveType3.setLeaveCount(6);
		leaveTypeRepository.save(leaveType3);
		
		LeaveType leaveType4 = new LeaveType();
		leaveType4.setLeaveCount(4);
		leaveTypeRepository.save(leaveType4);
		
	}
	

	// This is a foreign leave id saving method
	public LeaveType savefkId() {

		LeaveType leaveTypeIdOne;
		long leaveId = 4;
		leaveTypeIdOne = leaveTypeRepository.findById(leaveId).get();

		return leaveTypeIdOne;
	}

	// This is a save data method of Leave Types table
	public List<LeaveType> getleaveTypesList() {
		
		List<LeaveType> leaveTypesList = new ArrayList<>();
		leaveTypeRepository.findAll().forEach(LeaveType -> leaveTypesList.add(LeaveType));

		for (Iterator<LeaveType> iterator = leaveTypesList.iterator(); iterator.hasNext();) {
			LeaveType leaveType = (LeaveType) iterator.next();

			System.out.println("Leave ID     : "+leaveType.getLeaveId());
			System.out.println("Leave Count  : "+leaveType.getLeaveCount());

		}

		return leaveTypesList;
		
	}

}
