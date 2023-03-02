package com.jsp.tmr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.tmr.dao.UserRepository;
import com.jsp.tmr.entities.UserEntity;
import com.jsp.tmr.service.UserService;

import java.util.*;



@Service
public class UserServiceimpl   implements UserService{

	
	
	
	@Autowired
	private  UserRepository  userrpoRepository;
	@Autowired
	UserEntity  user;

	
	public UserServiceimpl() {
         System.out.println("service object creted");	}
	@Override
	public UserEntity addUser(UserEntity user) {
		 return userrpoRepository.save(user);
	}
	
	
	
	@Override
	public String changePwdService(String emailId, String password,String confirm) {
	{

		UserEntity  user =  userrpoRepository.findByemailId(emailId);

		if(user==null)
		{
			return "Account doesn't exists";
		}
		if (password.equals(confirm )) {
			user.setPassword(password);
			userrpoRepository.save(user);
			return "password successfully  updated ";
		}
		return "Password not match";
	}
		
	}
}

