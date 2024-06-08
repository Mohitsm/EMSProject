//package com.emsProjects.serviceImpl;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.emsProjects.entity.Permissions;
//import com.emsProjects.exception.ResourceNotFoundException;
//import com.emsProjects.paylode.PermissionsDto;
//import com.emsProjects.repositry.PermissionsRepo;
//import com.emsProjects.service.PermissionsService;
//
//@Service
//public class PermissionsServiceimpl implements PermissionsService {
//
//	@Autowired
//	private PermissionsRepo permissionsRepo;
//	
//	@Autowired
//	private ModelMapper modelMapper;
//	
//	@Override
//	public PermissionsDto createPermissions(PermissionsDto permissionsDto) {
//		// TODO Auto-generated method stub
//		Permissions permissions=this.modelMapper.map(permissionsDto, Permissions.class);
//		Permissions createPermissions=this.permissionsRepo.save(permissions);
//		return this.modelMapper.map(createPermissions, PermissionsDto.class);
//	}
//
//	@Override
//	public PermissionsDto updatePermissions(PermissionsDto permissionsDto, Integer permissionsId) {
//		// TODO Auto-generated method stub
//		Permissions permissions=this.permissionsRepo.findById(permissionsId).orElseThrow(()-> new ResourceNotFoundException("Permissions", "Id", permissionsId));
//		return null;
//	}
//
//	@Override
//	public void deletePermissions(Integer permissionsId) {
//		// TODO Auto-generated method stub
//		Permissions permissions=this.permissionsRepo.findById(permissionsId).orElseThrow(()-> new ResourceNotFoundException("Permissions", "Id", permissionsId));
//
//		this.permissionsRepo.delete(permissions);
//
//	}
//
//	@Override
//	public PermissionsDto getPermissionsById(Integer permissionsId) {
//		// TODO Auto-generated method stub
//		Permissions permissions=this.permissionsRepo.findById(permissionsId).orElseThrow(()-> new ResourceNotFoundException("Permissions", "Id", permissionsId));
//
//		return this.modelMapper.map(permissions, PermissionsDto.class);
//	}
//
//	@Override
//	public List<PermissionsDto> getAllPermissions() {
//		// TODO Auto-generated method stub
//		List<Permissions> permissions=this.permissionsRepo.findAll();
//		List<PermissionsDto> getAllPermissions=permissions.stream().map((per)->this.modelMapper.map(per, PermissionsDto.class)).collect(Collectors.toList());
//		return getAllPermissions;
//	}
//
//}
