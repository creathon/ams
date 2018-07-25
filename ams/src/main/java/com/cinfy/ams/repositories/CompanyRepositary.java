package com.cinfy.ams.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.cinfy.ams.model.Company;


public interface CompanyRepositary extends JpaRepository<Company, Long> ,JpaSpecificationExecutor<Company>{
//	public Boolean saveOrUpdate(Company company);
//	public Company findById(Integer id);

}
