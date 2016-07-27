package com.rina.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import com.rina.model.UserAccount;


public interface UserAccountServices {
	public ArrayList<UserAccount> viewAccount();
	public boolean newAccount(UserAccount ua);
}
