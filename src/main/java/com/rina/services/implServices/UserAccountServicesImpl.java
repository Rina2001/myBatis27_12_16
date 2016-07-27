package com.rina.services.implServices;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rina.model.UserAccount;
import com.rina.repositorys.UserAccountRepository;
import com.rina.services.UserAccountServices;
@Service
public class UserAccountServicesImpl implements UserAccountServices {
	@Autowired public UserAccountRepository rep;

	@Override
	public ArrayList<UserAccount> viewAccount() {
		return rep.viewAccount();
	}

	@Override
	public boolean newAccount(UserAccount ua) {
		return rep.newAccount(ua);
	}
	
}
