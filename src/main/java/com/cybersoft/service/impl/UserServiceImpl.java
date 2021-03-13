package com.cybersoft.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cybersoft.dto.RoleDto;
import com.cybersoft.dto.UserDto;
import com.cybersoft.model.Role;
import com.cybersoft.model.User;
import com.cybersoft.repository.RoleRepository;
import com.cybersoft.repository.UserRepository;
import com.cybersoft.service.UserService;

@Service
@Scope("prototype")
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	private RoleRepository roleRepository;
	
	

	public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
		super();
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
	}

	public List<UserDto> getAll() {
		List<UserDto> dtos = new ArrayList<UserDto>();
		try {
			List<User> entities = userRepository.findAll();
			for (User entity : entities) {
				RoleDto roleDto = new RoleDto(entity.getRole().getId(), entity.getRole().getName(), entity.getRole().getName());
				UserDto dto = new UserDto(entity.getId(), entity.getEmail(),entity.getPassword(), entity.getFullname(), entity.getAvatar(), roleDto);
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return dtos;
	}

	public int add(UserDto dto) {
		try {
			Role role = roleRepository.findById(dto.getRoleDto().getId());
			User entity = new User();
			entity.setFullname(dto.getFullname());
			entity.setEmail(dto.getEmail());
			entity.setPassword(dto.getPassword());
			entity.setAvatar(dto.getAvatar());
			entity.setRole(role);
			userRepository.save(entity);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public UserDto getById(int id) {
		try {
			User entity = userRepository.findById(id);
			if (entity != null) {
				RoleDto roleDto = new RoleDto(entity.getRole().getId(), entity.getRole().getName(), entity.getRole().getName());
				UserDto dto = new UserDto(entity.getId(), entity.getFullname(), entity.getEmail(),entity.getPassword(),entity.getAvatar(), roleDto);
				return dto;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new UserDto();
	}

	public int update(UserDto dto) {
		try {
			User entity = userRepository.findById(dto.getId());
			Role role = roleRepository.findById(dto.getRoleDto().getId());
			if (entity == null) return -1;
			entity.setFullname(dto.getFullname());
			entity.setEmail(dto.getEmail());
			entity.setPassword(dto.getPassword());
			entity.setRole(role);
			userRepository.save(entity);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public void delete(int id) {
		try {
			userRepository.deleteById(id);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
