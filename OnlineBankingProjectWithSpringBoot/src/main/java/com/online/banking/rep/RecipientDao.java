package com.online.banking.rep;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.banking.entity.Recipient;

public interface RecipientDao extends JpaRepository<Recipient, Long> {
    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}
