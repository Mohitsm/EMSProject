package com.emsProjects.service;

import java.util.List;

import com.emsProjects.paylode.PermissionsDto;

public interface PermissionsService {
	
	PermissionsDto createPermissions(PermissionsDto permissionsDto);
	PermissionsDto updatePermissions(PermissionsDto permissionsDto,Integer permissionsId);
	void deletePermissions(Integer permissionsId);
	PermissionsDto getPermissionsById(Integer permissionsId);
	List<PermissionsDto> getAllPermissions();

}
