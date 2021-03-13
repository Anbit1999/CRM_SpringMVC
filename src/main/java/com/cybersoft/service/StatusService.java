package com.cybersoft.service;

import java.util.List;

import com.cybersoft.dto.StatusDto;

public interface StatusService {
	List<StatusDto> getAll();
	int add(StatusDto dto);
	StatusDto getById(int id);
	int update(StatusDto dto);
	void delete(int id);
}
