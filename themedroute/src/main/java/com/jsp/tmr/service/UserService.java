package com.jsp.tmr.service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import com.jsp.tmr.entities.UserEntity;

@Service
public interface UserService {

	public UserEntity  addUser(@RequestBody   UserEntity user);
	
	public String changePwdService(String emailId, String password,String confirm);
	
		
}
 