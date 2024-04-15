package com.emsProjects.service;

import java.util.List;

import com.emsProjects.paylode.UserDto;

public interface UserService {
	UserDto createUser(UserDto userDto);
	UserDto updateUser(UserDto userDto,Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deteteUser(Integer userId);
	public Long countUser();

}
