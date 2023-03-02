package com.jsp.tmr.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.jsp.tmr.entities.UserEntity;



public interface UserRepository  extends JpaRepository<UserEntity, Integer> {

	@Query("SELECT u FROM UserEntity u WHERE u.userName=:query OR u.emailId=:query")
	UserEntity findUser(String query);

	
public	UserEntity findByemailId(String emailId);
}
 
