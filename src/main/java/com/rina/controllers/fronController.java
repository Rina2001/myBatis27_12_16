package com.rina.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rina.model.UserAccount;
import com.rina.services.implServices.UserAccountServicesImpl;


@Controller
public class fronController {
	@Autowired UserAccountServicesImpl user_service;
	
	@RequestMapping("")
	public String homes(){
		return "index";
	}
	
	@RequestMapping(value="/viewAccount")
	@ResponseBody
	public ArrayList<UserAccount> viewList(){
		return user_service.viewAccount();
	}
	
	@RequestMapping(value="/addNewAccount",method=RequestMethod.POST)
	@ResponseBody
	public boolean newAccount(@ModelAttribute UserAccount ua){
		return user_service.newAccount(ua);
	}
}
