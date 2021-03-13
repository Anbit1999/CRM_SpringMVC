package com.cybersoft.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cybersoft.dto.StatusDto;
import com.cybersoft.model.Status;
import com.cybersoft.repository.StatusRepository;
import com.cybersoft.service.StatusService;

@Service
@Scope("prototype")
public class StatusServiceImpl implements StatusService {

	private StatusRepository statusRepository;

	public StatusServiceImpl(StatusRepository statusRepository) {
		super();
		this.statusRepository = statusRepository;
	}

	public List<StatusDto> getAll() {
		List<StatusDto> dtos = new ArrayList<StatusDto>();
		try {
			List<Status> entities = statusRepository.findAll();
			for (Status entity : entities) {
				StatusDto dto = new StatusDto(entity.getId(), entity.getName());
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dtos;
	}

	public int add(StatusDto dto) {
		try {
			Status entity = new Status();
			entity.setName(dto.getName());
			statusRepository.save(entity);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public StatusDto getById(int id) {
		try {
			Status entity = statusRepository.findById(id);
			if (entity != null) {
				return new StatusDto(entity.getId(), entity.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new StatusDto();
	}

	public int update(StatusDto dto) {
		try {
			Status entity = statusRepository.findById(dto.getId());
			if (entity == null)
				return -1;
			entity.setName(dto.getName());
			statusRepository.save(entity);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public void delete(int id) {
		try {
			statusRepository.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
