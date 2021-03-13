package com.cybersoft.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cybersoft.dto.ProjectDto;
import com.cybersoft.dto.RoleDto;
import com.cybersoft.dto.StatusDto;
import com.cybersoft.dto.TaskDto;
import com.cybersoft.dto.UserDto;
import com.cybersoft.model.Project;
import com.cybersoft.model.Status;
import com.cybersoft.model.Task;
import com.cybersoft.model.User;
import com.cybersoft.repository.ProjectRepository;
import com.cybersoft.repository.StatusRepository;
import com.cybersoft.repository.TaskRepository;
import com.cybersoft.repository.UserRepository;
import com.cybersoft.service.TaskService;

@Service
@Scope("prototype")
public class TaskServiceImpl implements TaskService{

	private TaskRepository taskRepository;
	
	private UserRepository userRepository;
	
	private ProjectRepository projectRepository;
	
	private StatusRepository statusRepository;
	
	
	public TaskServiceImpl(TaskRepository taskRepository, UserRepository userRepository,
			ProjectRepository projectRepository, StatusRepository statusRepository) {
		super();
		this.taskRepository = taskRepository;
		this.userRepository = userRepository;
		this.projectRepository = projectRepository;
		this.statusRepository = statusRepository;
	}

	public List<TaskDto> getAll() {
		List<TaskDto> dtos = new ArrayList<TaskDto>();
		try {
			List<Task> entities = taskRepository.findAll();
			for (Task entity : entities) {
				ProjectDto projectDto = new ProjectDto(entity.getProject().getId(), entity.getProject().getName(), entity.getProject().getStartDate(), entity.getProject().getEndDate());
				
				RoleDto roleDto = new RoleDto(entity.getUser().getRole().getId(), entity.getUser().getRole().getName(), entity.getUser().getRole().getDescription());
				
				UserDto userDto = new UserDto(entity.getUser().getId(),entity.getUser().getEmail(), entity.getUser().getPassword(), entity.getUser().getFullname(), entity.getUser().getAvatar(), roleDto);
				StatusDto statusDto = new StatusDto(entity.getStatus().getId(), entity.getStatus().getName());
				
				TaskDto dto = new TaskDto(entity.getId(), entity.getName(), entity.getStartDate(), entity.getEndDate(),
						projectDto, userDto, statusDto);
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return dtos;
	}

	public int add(TaskDto dto) {
		try {
			Project project = projectRepository.findById(dto.getProjectDto().getId());
			User user = userRepository.findById(dto.getUserDto().getId());
			Status status = statusRepository.findById(dto.getStatusDto().getId());
			Task entity = new Task();
			entity.setName(dto.getName());
			entity.setStartDate(dto.getStartDate());
			entity.setEndDate(dto.getEndDate());
			entity.setProject(project);
			entity.setUser(user);
			entity.setStatus(status);
			taskRepository.save(entity);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public TaskDto getById(int id) {
		try {
			Task entity = taskRepository.findById(id);
			if (entity != null) {
				ProjectDto projectDto = new ProjectDto(entity.getProject().getId(), entity.getProject().getName(), entity.getProject().getStartDate(), entity.getProject().getEndDate());
				
				RoleDto roleDto = new RoleDto(entity.getUser().getRole().getId(), entity.getUser().getRole().getName(), entity.getUser().getRole().getDescription());
				UserDto userDto = new UserDto(entity.getUser().getId(),entity.getUser().getFullname(),
						entity.getUser().getEmail(), entity.getUser().getPassword(), entity.getUser().getAvatar(), roleDto);
				StatusDto statusDto = new StatusDto(entity.getStatus().getId(), entity.getStatus().getName());
				return new TaskDto(entity.getId(),entity.getName(), entity.getStartDate(), entity.getEndDate(),
						projectDto, userDto, statusDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new TaskDto();
	}

	public int update(TaskDto dto) {
		try {
			Task entity = taskRepository.findById(dto.getId());
			Project project = projectRepository.findById(dto.getProjectDto().getId());
			User user = userRepository.findById(dto.getUserDto().getId());
			Status status = statusRepository.findById(dto.getStatusDto().getId());
			if (entity == null) return -1;
			entity.setName(dto.getName());
			entity.setStartDate(dto.getStartDate());
			entity.setEndDate(dto.getEndDate());
			entity.setProject(project);
			entity.setUser(user);
			entity.setStatus(status);
			taskRepository.save(entity);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public void delete(int id) {
		try {
			taskRepository.deleteById(id);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
