package com.online.banking.rep;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.online.banking.entity.User;

//@Repository

//@RepositoryRestResource
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends JpaRepository<User, Integer> {

	void deleteByFirstName(String firstName);

	void deleteByUserId(int id);

	public List<User> findByFirstName(String fName);

	User findByFirstNameAndUserId(String fNamd,int userid);

	List<User> findByEmailContaining(String email);
	
	List<User> findByFirstNameIsLike(String fname);
	List<User> findByLastNameIsLike(@Param("lname")String lname);
	
	
}
