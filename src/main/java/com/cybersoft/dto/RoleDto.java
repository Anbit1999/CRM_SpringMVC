package com.cybersoft.dto;

import java.util.List;

import com.cybersoft.model.User;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Setter
@Getter
public class RoleDto {

	private int id;
	private String name;
	private String description;
	
	private List<User> users;

	public RoleDto(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public RoleDto() {
		super();
	}
	
	
}
