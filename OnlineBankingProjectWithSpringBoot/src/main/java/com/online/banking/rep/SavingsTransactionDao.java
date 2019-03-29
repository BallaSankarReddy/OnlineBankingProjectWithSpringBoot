package com.online.banking.rep;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.banking.entity.SavingsTransaction;

public interface SavingsTransactionDao extends JpaRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

