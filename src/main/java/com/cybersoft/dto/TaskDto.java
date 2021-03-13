package com.cybersoft.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TaskDto {

	private int id;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	
	private ProjectDto projectDto;
	
	private UserDto userDto;
	
	private StatusDto statusDto;
}
