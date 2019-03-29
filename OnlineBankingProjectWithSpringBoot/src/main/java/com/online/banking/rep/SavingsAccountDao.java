package com.online.banking.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.banking.entity.SavingsAccount;


public interface SavingsAccountDao extends JpaRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber (int accountNumber);
}
