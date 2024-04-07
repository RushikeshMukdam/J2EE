package com.jspiders.springREST.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springREST.pojo.User;
import com.jspiders.springREST.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User addUser(User user) {
		return userRepository.addUser(user);
	}  
	
	public List<User> findAllUser(){
		  List<User> users =  userRepository.findAllUser();
		  if (users != null && users.size() > 0) {
			return users;
		}else {
			return null;
		}
	}
	
	public User updateUser(User user) {
		return userRepository.updateUser(user);
	}

	public User deleteUser(int id) {
		return userRepository.deleteUser(id);
	}
	public User updatedCarListForUser(int userId,int carId) {
		return userRepository.updateCarListForUser(userId, carId);
	}
}
