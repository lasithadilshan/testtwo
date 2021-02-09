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
import org.springframework.web.bind.annotation.RestController;

import com.dilshan.testtwo.entity.LeaveType;
import com.dilshan.testtwo.service.LeaveTypeService;

@RestController
@RequestMapping("/leaveType")
public class LeaveTypeController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LeaveTypeController.class);

	@Autowired
	private LeaveTypeService leaveTypeService;
	
	@PostMapping("/")
	public LeaveType saveLeaveType(@RequestBody LeaveType leaveType) {
//		System.out.println("Leave Type Saving");
		
		LOGGER.error(":: saving LeaveType :::: LeaveTypeController - saveLeaveType ::");
		LOGGER.warn(":: saving LeaveType :::: LeaveTypeController - saveLeaveType ::");
		LOGGER.info(":: saving LeaveType :::: LeaveTypeController - saveLeaveType ::");
		LOGGER.debug(":: saving LeaveType :::: LeaveTypeController - saveLeaveType ::");
		
		return leaveTypeService.saveLeaveType(leaveType);
	}

	@GetMapping("/")
	public List<LeaveType> readLeaveType() {
		
		LOGGER.error(":: reading LeaveType :::: LeaveTypeController - readLeaveType ::");
		LOGGER.warn(":: reading LeaveType :::: LeaveTypeController - readLeaveType ::");
		LOGGER.info(":: reading LeaveType :::: LeaveTypeController - readLeaveType ::");
		LOGGER.debug(":: reading LeaveType :::: LeaveTypeController - readLeaveType ::");
		
		return leaveTypeService.getleaveTypesList();
	}
	
	@GetMapping("/leaveCount/{leaveCount}")
	public List<LeaveType> findByLeaveCount(@PathVariable("leaveCount") double leaveCount) {
//		System.out.println("leaveCount Saved");
		
		LOGGER.error(":: find By Leave Count :::: LeaveTypeController - findByLeaveCount ::");
		LOGGER.warn(":: find By Leave Count :::: LeaveTypeController - findByLeaveCount ::");
		LOGGER.info(":: find By Leave Count :::: LeaveTypeController - findByLeaveCount ::");
		LOGGER.debug(":: find By Leave Count :::: LeaveTypeController - findByLeaveCount ::");
		
		return findByLeaveCount(leaveCount);
	}
	
}
