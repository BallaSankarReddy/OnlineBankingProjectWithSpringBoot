package com.online.banking.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.banking.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
