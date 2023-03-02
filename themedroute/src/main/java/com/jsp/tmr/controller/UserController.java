package com.jsp.tmr.controller;

import java.net.http.HttpConnectTimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.tmr.entities.UserEntity;
import com.jsp.tmr.service.UserService;

@RestController
@RequestMapping("/med")
public class UserController {

	
	@Autowired
	private     UserService uservice;
	
	
	
	public UserController() {
		System.out.println("controller objrct created");
	}
		
	@PostMapping("/save")  
	public ResponseEntity <UserEntity>  addUser(@RequestBody   UserEntity user){
		return new ResponseEntity<UserEntity>(uservice.addUser(user),HttpStatus.CREATED);
		}
	

		
		
		@PostMapping("/resetPwswd")
		public ResponseEntity<String> toChangepwd(@RequestHeader("Email-Id") String emailId, @RequestHeader("NewPassword") String password,@RequestHeader("ConfirmPassword") String confirm)
				 {
			
			String updated =uservice.changePwdService(emailId, password,confirm);
			if (updated=="updated") {
				return ResponseEntity.status(200).body(updated);
			} 
			return  ResponseEntity.status(400).body(updated);
			}
		
		
	}



