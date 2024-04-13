package com.emsProjects.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emsProjects.paylode.ApiResponse;
import com.emsProjects.paylode.UserDto;
import com.emsProjects.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserControll {
	
	@Autowired
	private UserService userService;
	
	//get create user
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto)
	{
		UserDto createUserDto =this.userService.createUser(userDto);
		return new ResponseEntity<>(createUserDto,HttpStatus.CREATED);
	}
	
	//put update user
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser( @RequestBody UserDto userDto,@PathVariable Integer userId){
		UserDto updateUser=this.userService.updateUser(userDto, userId);
		return ResponseEntity.ok(updateUser);
		
	}
	
	//delete delete user
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable Integer userId){
		this.userService.deteteUser(userId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("user delete successfullly",true),HttpStatus.OK);
		
	}
	
	
	//get user get
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUser(){
		return ResponseEntity.ok(this.userService.getAllUsers());
	}
	
	//get user get
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId){
		return ResponseEntity.ok(this.userService.getUserById(userId));
	}
	

}
