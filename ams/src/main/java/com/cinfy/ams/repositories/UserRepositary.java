package com.cinfy.ams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.cinfy.ams.model.User;



public interface UserRepositary extends JpaRepository<User, Long>,JpaSpecificationExecutor<User> {

	User findByUsernameAndPassword(String username, String password);
//	public Boolean saveOrUpdate(User user);
//	public User findById(Integer id);
//	public User findByUsernameAndPassword(String username,String password);
//	
	

}
