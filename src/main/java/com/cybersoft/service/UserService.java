package com.cybersoft.service;

import java.util.List;

import com.cybersoft.dto.UserDto;

public interface UserService {
	List<UserDto> getAll();
	int add(UserDto dto);
	UserDto getById(int id);
	int update(UserDto dto);
	void delete(int id);
}
