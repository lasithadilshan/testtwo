package com.dilshan.testtwo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.dilshan.testtwo.entity.SalaryScale;

@Repository
public interface SalaryScaleRepository extends JpaRepository<SalaryScale, Long>{
	
}
