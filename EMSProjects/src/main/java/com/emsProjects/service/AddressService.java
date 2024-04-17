package com.emsProjects.service;

import java.util.List;

import com.emsProjects.paylode.AddressDto;

public interface AddressService {
	AddressDto createAddress(AddressDto addressDto);
	AddressDto updateAddress(AddressDto addressDto,Integer addtressId);
	void deleteAddress(Integer addtressId);
	AddressDto getAddressById(Integer addtressId);
	List<AddressDto> getAllAddress();

}
