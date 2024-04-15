package com.emsProjects.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emsProjects.entity.User;
import com.emsProjects.exception.ResourceNotFoundException;
import com.emsProjects.paylode.UserDto;
import com.emsProjects.repositry.UserRepo;
import com.emsProjects.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	


	@Override
	public UserDto createUser(UserDto userDto) {
		// TODO Auto-generated method stub
		User user=this.modelMapper.map(userDto, User.class);
		User saveUser=this.userRepo.save(user);
		
		return this.modelMapper.map(saveUser, UserDto.class);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Integer userId) {
		// TODO Auto-generated method stub
		User user=this.userRepo.findById(userId)
				.orElseThrow(()-> new ResourceNotFoundException("User","Id",userId));
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setBranches(userDto.getBranches());
		user.setDepartment(userDto.getDepartment());
		
		User updateUser=this.userRepo.save(user);
		
		return this.modelMapper.map(updateUser, UserDto.class);
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		User user=this.userRepo.findById(userId)
				.orElseThrow(()-> new ResourceNotFoundException("User","Id",userId));
		return this.modelMapper.map(user, UserDto.class);
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> user=this.userRepo.findAll();
		List<UserDto> getAllUser=user.stream().map((ue)->this.modelMapper.map(ue, UserDto.class)).collect(Collectors.toList());
		return getAllUser;
	}

	@Override
	public void deteteUser(Integer userId) {
		// TODO Auto-generated method stub
		User user=this.userRepo.findById(userId)
				.orElseThrow(()-> new ResourceNotFoundException("User","Id",userId));
		
		this.userRepo.delete(user);
	}

	@Override
	public Long countUser() {
		// TODO Auto-generated method stub
		return userRepo.count();
	}

}
