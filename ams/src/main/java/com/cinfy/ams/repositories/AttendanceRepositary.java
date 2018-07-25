package com.cinfy.ams.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.cinfy.ams.model.Attendance;


public interface AttendanceRepositary extends JpaRepository<Attendance, Long> ,JpaSpecificationExecutor<Attendance>{

	
	
}
