package com.cybersoft.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cybersoft.dto.ProjectDto;
import com.cybersoft.model.Project;
import com.cybersoft.repository.ProjectRepository;
import com.cybersoft.service.ProjectService;

@Service
@Scope("prototype")
public class ProjectServiceImpl implements ProjectService{

	private ProjectRepository projectRepository;
	
	public ProjectServiceImpl(ProjectRepository projectRepository) {
		super();
		this.projectRepository = projectRepository;
	}

	public List<ProjectDto> getAll() {
		List<ProjectDto> dtos = new ArrayList<ProjectDto>();
		try {
			List<Project> entities = projectRepository.findAll();
			for (Project entity : entities) {
				ProjectDto dto = new ProjectDto(entity.getId(), entity.getName(), entity.getStartDate(), entity.getEndDate());
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return dtos;
	}

	public int add(ProjectDto dto) {
		try {
			Project entity = new Project();
			entity.setName(dto.getName());
			entity.setStartDate(dto.getStartDate());
			entity.setEndDate(dto.getEndDate());
			projectRepository.save(entity);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public ProjectDto getById(int id) {
		try {
			Project entity = projectRepository.findById(id);
			if (entity != null) {
				return new ProjectDto(entity.getId(),entity.getName(), entity.getStartDate(), entity.getEndDate());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ProjectDto();
	}

	public int update(ProjectDto dto) {
		try {
			Project entity = projectRepository.findById(dto.getId());
			if (entity == null) return -1;
			entity.setName(dto.getName());
			entity.setStartDate(dto.getStartDate());
			entity.setEndDate(dto.getEndDate());
			projectRepository.save(entity);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public void delete(int id) {
		try {
			projectRepository.deleteById(id);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
