package com.cybersoft.dto;

import java.time.LocalDate;
import java.util.List;

import com.cybersoft.model.Task;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Setter
@Getter
public class ProjectDto {

	private int id;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	
	private List<Task> tasks;

	public ProjectDto(int id, String name, LocalDate startDate, LocalDate endDate) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public ProjectDto() {
		super();
	}
	
	
}
