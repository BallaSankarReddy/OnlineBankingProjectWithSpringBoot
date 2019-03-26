package com.online.banking.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.banking.entity.User;
import com.online.banking.exception.UserNotFoundException;
import com.online.banking.rep.AddressRepository;
import com.online.banking.rep.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AddressRepository addressRepository;

	public User creatingUser(User user) {

		User userSave = userRepository.save(user);
		return userSave;

	}

	public User findUser(int userId) {
		
		
		Optional.ofNullable(userRepository.getOne(userId)).filter(user -> user.getFirstName()==null).ifPresent(user ->{
			throw new UserNotFoundException("Couldn't find a User with id:"+userId);
		}
		);
		return null;
		  
		/*
		 * return ofNullable.orElseThrow(() -> new
		 * UserNotFoundException("Couldn't find a User with id:"+userId));
		 */
		 

		/*
		 * User userdata = userRepository.getOne(userId);
		 * if(userdata.getFirstName()==null) throw new
		 * UserNotFoundException("Couldn't find a User with id:"+userId); return
		 * userdata;
		 */
	}

	public void deleteUser(int userId) {
		Optional.ofNullable(userRepository.getOne(userId)).ifPresent(result -> {
			userRepository.delete(result);
		});

	}

	public List<Object> getListOfUserByFistName(String fName) {
		List<Object> userList = userRepository.findByFirstName(fName).stream()
				.filter(checkingFname -> checkingFname.getFirstName() != "Balla")
				.map(checkingFname -> checkingFname.getEmail()).collect(Collectors.toList());

		return userList;
	}

	public User updateUser(int userid) {

		User user = null;
		userRepository.saveAndFlush(user);
		return null;
	}

	/*
	 * public List<User> userList() { return userRepository.userId(); }
	 */
	
	
	public List<User> findByEmailLikeEndWith(String emailEndLink) {
		
			
		return userRepository.findByEmailContaining(emailEndLink)
				.stream()
				.filter(matchedEmail -> matchedEmail.getEmail().endsWith("@scb.com"))
				.collect(Collectors.toList());
		
	}
	public List<User> findByFirstNameIsLike(String fname) {
		return userRepository.findByFirstName(fname).stream().filter(emailNotTobe -> emailNotTobe.getEmail()!="@Scb")
				.collect(Collectors.toList());
	}
}
