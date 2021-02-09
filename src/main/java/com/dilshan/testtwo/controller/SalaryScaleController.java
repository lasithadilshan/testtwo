package com.dilshan.testtwo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dilshan.testtwo.entity.SalaryScale;
import com.dilshan.testtwo.service.SalaryScaleService;

@RestController
@RequestMapping("/salaryScale")
public class SalaryScaleController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SalaryScaleController.class);
	
	@Autowired
	private SalaryScaleService salaryScaleService;
	
	@PostMapping("/")
	public SalaryScale saveSalaryScale(@RequestBody SalaryScale salaryScale) {
//		System.out.println("Salary Scale Saving");
		
		LOGGER.error(":: saving SalaryScale :::: SalaryScaleController - saveSalaryScale ::");
		LOGGER.warn(":: saving SalaryScale :::: SalaryScaleController - saveSalaryScale ::");
		LOGGER.info(":: saving SalaryScale :::: SalaryScaleController - saveSalaryScale ::");
		LOGGER.debug(":: saving SalaryScale :::: SalaryScaleController - saveSalaryScale ::");
		
		return salaryScaleService.saveSalaryScale(salaryScale);
	}

	@GetMapping("/")
	public List<SalaryScale> readSalaryScale() {
		
		LOGGER.error(":: read SalaryScale :::: SalaryScaleController - readSalaryScale ::");
		LOGGER.warn(":: read SalaryScale :::: SalaryScaleController - readSalaryScale ::");
		LOGGER.info(":: read SalaryScale :::: SalaryScaleController - readSalaryScale ::");
		LOGGER.debug(":: read SalaryScale :::: SalaryScaleController - readSalaryScale ::");
		
		return salaryScaleService.getsalaryScale();
	}

}
