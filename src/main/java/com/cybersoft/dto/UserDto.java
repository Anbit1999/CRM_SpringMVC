package com.cybersoft.dto;

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
public class UserDto {
	private int id;
	private String email;
	private String password;
	private String fullname;
	private String avatar;
	
	private RoleDto roleDto;

	
	
	
}
