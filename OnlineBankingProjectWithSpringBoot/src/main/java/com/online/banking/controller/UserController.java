package com.online.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.banking.entity.User;
import com.online.banking.service.UserService;

@CrossOrigin("*")
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	
	/*
	 * @RequestMapping("/user/userList")
	 * 
	 * public List<User> userList(){
	 * 
	 * return userService.userList(); }
	 */

	@RequestMapping("/user/save")
	public User createUser(@RequestBody User user) {
		User userDatal = userService.creatingUser(user);
		return userDatal;
	}

	@RequestMapping("/user/{userId}")
	public User getUser(@PathVariable int userId) {
		User user = userService.findUser(userId);
		return user;
	}

	@RequestMapping("/user/delet/{userId}")
	public void deleteUserById(@PathVariable int userId) {
		userService.deleteUser(userId);
	}
	
	@RequestMapping("/user/list/{fName}")
	public List<Object> collectListOfUserByFirstName(@PathVariable String fName) {
		return userService.getListOfUserByFistName(fName);
	}
	
	@RequestMapping("/user/email/{emailLik}")
	public List<User> findByEmailLike(@PathVariable("emailLik") String emil){
		return userService.findByEmailLikeEndWith(emil);
	}
	@RequestMapping("/user/firstName/{fName}")
	public List<User> findByFirstNameIsLike(@PathVariable("fName")String firstName){
		
		return userService.findByFirstNameIsLike(firstName);
	}

	
}
