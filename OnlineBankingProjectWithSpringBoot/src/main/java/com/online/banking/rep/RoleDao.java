package com.online.banking.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.banking.security.Role;

public interface RoleDao extends JpaRepository<Role, Integer> {

	Role findByRoleName(String name);
}
