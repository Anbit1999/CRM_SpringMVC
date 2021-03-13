package com.cybersoft.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cybersoft.dto.RoleDto;
import com.cybersoft.model.Role;
import com.cybersoft.repository.RoleRepository;
import com.cybersoft.service.RoleService;

@Service
@Scope("prototype")
public class RoleServiceImpl implements RoleService{

	
	private RoleRepository roleRepository;
	

	public RoleServiceImpl(RoleRepository roleRepository) {
		super();
		this.roleRepository = roleRepository;
	}
	public List<RoleDto> getAll() {
		List<RoleDto> dtos = new ArrayList<RoleDto>();
		try {
			List<Role> entities = roleRepository.findAll();
			for (Role entity : entities) {
				RoleDto dto = new RoleDto(entity.getId(), entity.getName(), entity.getDescription());
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return dtos;
	}

	public int add(RoleDto dto) {
		try {
			Role entity = new Role();
			entity.setName(dto.getName());
			entity.setDescription(dto.getDescription());
			roleRepository.save(entity);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public RoleDto getById(int id) {
		try {
			Role entity = roleRepository.findById(id);
			if (entity != null) {
				return new RoleDto(entity.getId(), entity.getName(), entity.getDescription());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new RoleDto();
	}

	public int update(RoleDto dto) {
		try {
			Role entity = roleRepository.findById(dto.getId());
			if (entity == null) return -1;
			entity.setName(dto.getName());
			entity.setDescription(dto.getDescription());
			roleRepository.save(entity);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public void delete(int id) {
		try {
			roleRepository.deleteById(id);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
