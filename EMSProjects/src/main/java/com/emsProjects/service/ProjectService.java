package com.emsProjects.service;

import java.util.List;

import com.emsProjects.paylode.ProjectDto;

public interface ProjectService {
	ProjectDto createProject(ProjectDto projectDto);
	ProjectDto updateProject(ProjectDto projectDto,Integer projectId);
	void deleteProject(Integer projectId);
	ProjectDto getProjectById(Integer projectId);
	List<ProjectDto> getAllProject();
}
