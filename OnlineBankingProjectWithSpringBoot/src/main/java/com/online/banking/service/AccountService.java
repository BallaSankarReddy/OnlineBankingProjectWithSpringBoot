package com.online.banking.service;

import java.security.Principal;

import com.online.banking.entity.PrimaryAccount;
import com.online.banking.entity.SavingsAccount;

public interface AccountService {

	PrimaryAccount createPrimaryAccount();
	SavingsAccount createSavingsAccount();
	
	void deposit(String accountType, double amount, Principal principal);
	void withdraw(String accountType, double amount, Principal principal);
}
