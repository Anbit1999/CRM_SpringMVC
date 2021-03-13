package com.cybersoft.service;

import java.util.List;

import com.cybersoft.dto.TaskDto;

public interface TaskService {
	List<TaskDto> getAll();
	int add(TaskDto dto);
	TaskDto getById(int id);
	int update(TaskDto dto);
	void delete(int id);
}
