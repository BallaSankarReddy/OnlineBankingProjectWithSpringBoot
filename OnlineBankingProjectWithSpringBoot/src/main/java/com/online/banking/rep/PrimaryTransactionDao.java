package com.online.banking.rep;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.banking.entity.PrimaryTransaction;

public interface PrimaryTransactionDao extends JpaRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
