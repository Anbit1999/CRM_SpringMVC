package com.cybersoft.service;

import java.util.List;

import com.cybersoft.dto.ProjectDto;



public interface ProjectService {
	List<ProjectDto> getAll();
	int add(ProjectDto dto);
	ProjectDto getById(int id);
	int update(ProjectDto dto);
	void delete(int id);
}
