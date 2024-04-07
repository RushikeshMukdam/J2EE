package com.jspiders.springREST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.springREST.pojo.User;
import com.jspiders.springREST.response.ResponseStructure;
import com.jspiders.springREST.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/user")
	public ResponseEntity<ResponseStructure<User>> addUser(@RequestBody User user){
		     User addedUser = userService.addUser(user);
		     ResponseStructure<User> responseStructure = new ResponseStructure<>();
		     if (addedUser != null) {
				responseStructure.setMessage("user added");
				responseStructure.setData(addedUser);
				responseStructure.setStatus(HttpStatus.OK.value());
				return  new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.OK);
			}else {
				responseStructure.setMessage("User already exist");
				responseStructure.setData(addedUser);
				responseStructure.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
				return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.NOT_ACCEPTABLE);
			}
		     
	}
	
	@GetMapping("/users")
	public ResponseEntity<ResponseStructure<List<User>>> findAllUser(){
		    List<User> users = userService.findAllUser();
		    ResponseStructure<List<User>> responseStructure = new ResponseStructure<>();
		    if (users != null) {
				responseStructure.setMessage("Users Found");
				responseStructure.setData(users);
				responseStructure.setStatus(HttpStatus.FOUND.value());
				return new ResponseEntity<ResponseStructure<List<User>>>(responseStructure,HttpStatus.FOUND);	
			}else {
				responseStructure.setMessage("User Not Found");
				responseStructure.setData(users);
				responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
				return new ResponseEntity<ResponseStructure<List<User>>>(responseStructure,HttpStatus.NOT_FOUND);
			}
	}
	
	@PutMapping("/user")
	public ResponseEntity<ResponseStructure<User>> updateUser(@RequestBody User user){
		User updatedUser = userService.updateUser(user);
		ResponseStructure<User> responseStructure = new ResponseStructure<>();
		if (updatedUser != null) {
			responseStructure.setMessage("User Updated");
			responseStructure.setData(updatedUser);
			responseStructure.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.OK);
		}else {
			responseStructure.setMessage("User Not Found");
			responseStructure.setData(updatedUser);
			responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
			return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping(path = "user")
	public ResponseEntity<ResponseStructure<User>> deleteUser(@RequestParam(name = "id") int id){
		User deledteUser = userService.deleteUser(id);
		ResponseStructure<User> responseStructure = new ResponseStructure<>();
		if (deledteUser != null) {
			responseStructure.setMessage("User Deleted");
			responseStructure.setData(deledteUser);
			responseStructure.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.OK);
		}else {
			responseStructure.setMessage("User Not Found");
			responseStructure.setData(deledteUser);
			responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
			return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.NOT_FOUND);
		}
	}
	
	@PatchMapping("/user")
	public ResponseEntity<ResponseStructure<User>>  updateCarListForUser(@RequestParam(name = "userId") int userId,@RequestParam(name="carID") int carId){
		     User updatedUser = userService.updatedCarListForUser(userId, carId);
		     ResponseStructure<User> responseStructure  = new ResponseStructure<>();
		     if (updatedUser != null) {
				responseStructure.setMessage("Car List For The User is Updated");
				responseStructure.setData(updatedUser);
				responseStructure.setStatus(HttpStatus.OK.value());
				
				return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.OK);
			}else {
				responseStructure.setMessage("Invalid UserId or Car Id");
				responseStructure.setData(updatedUser);
				responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
				return  new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.NOT_FOUND);
			}
		
	}
}	

