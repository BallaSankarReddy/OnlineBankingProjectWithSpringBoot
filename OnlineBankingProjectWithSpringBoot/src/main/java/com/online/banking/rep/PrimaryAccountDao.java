package com.online.banking.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.banking.entity.PrimaryAccount;

public interface PrimaryAccountDao extends JpaRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);
}
