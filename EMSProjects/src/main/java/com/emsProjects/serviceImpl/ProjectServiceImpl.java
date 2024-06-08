//package com.emsProjects.serviceImpl;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.emsProjects.entity.Attendance;
//import com.emsProjects.entity.Project;
//import com.emsProjects.exception.ResourceNotFoundException;
//import com.emsProjects.paylode.AttendanceDto;
//import com.emsProjects.paylode.ProjectDto;
//import com.emsProjects.repositry.ProjectRepo;
//import com.emsProjects.service.ProjectService;
//
//@Service
//public class ProjectServiceImpl implements ProjectService {
//	
//	@Autowired
//	private ProjectRepo projectRepo;
//	
//	@Autowired
//	private ModelMapper modelMapper;
//
//	@Override
//	public ProjectDto createProject(ProjectDto projectDto) {
//		// TODO Auto-generated method stub
//		Project project=this.modelMapper.map(projectDto, Project.class);
//		Project createProject=this.projectRepo.save(project);
//		
//		return this.modelMapper.map(createProject, ProjectDto.class);
//	}
//
//	@Override
//	public ProjectDto updateProject(ProjectDto projectDto, Integer projectId) {
//		// TODO Auto-generated method stub
//		Project project =this.projectRepo.findById(projectId).orElseThrow(()-> new ResourceNotFoundException("Attendance", "Id", projectId));
//
//		return null;
//	}
//
//	@Override
//	public void deleteProject(Integer projectId) {
//		// TODO Auto-generated method stub
//		Project project =this.projectRepo.findById(projectId).orElseThrow(()-> new ResourceNotFoundException("Attendance", "Id", projectId));
//
//		this.projectRepo.delete(project);
//
//	}
//
//	@Override
//	public ProjectDto getProjectById(Integer projectId) {
//		// TODO Auto-generated method stub
//		Project project =this.projectRepo.findById(projectId).orElseThrow(()-> new ResourceNotFoundException("Attendance", "Id", projectId));
//
//		return this.modelMapper.map(project, ProjectDto.class);
//	}
//
//	@Override
//	public List<ProjectDto> getAllProject() {
//		// TODO Auto-generated method stub
//		List<Project> attendances=this.projectRepo.findAll();
//		List<ProjectDto> getAllAttendance=attendances.stream().map((at)->this.modelMapper.map(at, ProjectDto.class)).collect(Collectors.toList());
//		return getAllAttendance;
//	}
//
//}
