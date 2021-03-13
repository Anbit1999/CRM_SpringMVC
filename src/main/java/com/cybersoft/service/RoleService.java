package com.cybersoft.service;

import java.util.List;

import com.cybersoft.dto.RoleDto;

public interface RoleService {
	List<RoleDto> getAll();
	int add(RoleDto dto);
	RoleDto getById(int id);
	int update(RoleDto dto);
	void delete(int id);
}
