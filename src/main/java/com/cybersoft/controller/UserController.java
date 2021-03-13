package com.cybersoft.controller;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cybersoft.dto.RoleDto;
import com.cybersoft.dto.UserDto;
import com.cybersoft.service.RoleService;
import com.cybersoft.service.UserService;


@Controller
@Scope("prototype")
@RequestMapping("user")
public class UserController {
	
	
	private UserService userService;
	
	private RoleService roleService;
	
	
	
	public UserController(UserService userService, RoleService roleService) {
		super();
		this.userService = userService;
		this.roleService = roleService;
	}

	@GetMapping("")
	public String index(ModelMap model) {
		List<UserDto> dtos = userService.getAll();
		model.addAttribute("listUser", dtos);
		return "user/index";
	}
	
	@GetMapping("add")
	public String add(ModelMap model) {
		List<RoleDto> roleDtos = roleService.getAll();
		model.addAttribute("listRole", roleDtos);
		return "user/add";
	}
	
	@PostMapping("add")
	public String add(@RequestParam("name") String name, @RequestParam("password") String password,@RequestParam("email") String email,
			@RequestParam("avatar") String avatar, @RequestParam("role_id") int role_id, ModelMap model) {
		RoleDto roleDto = roleService.getById(role_id);
		UserDto dto = new UserDto();
		dto.setFullname(name);
		dto.setEmail(email);
		dto.setPassword(password);
		dto.setAvatar(avatar);
		dto.setRoleDto(roleDto);
		if (userService.add(dto)==1) {
			return "redirect:/user";
		}
		model.addAttribute("message", "Thêm mới thất bại");
		return "user/add";
		
	}
	
	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, ModelMap model) {
		UserDto dto = userService.getById(id);
		List<RoleDto> roleDtos = roleService.getAll();
		
		model.addAttribute("user", dto);
		model.addAttribute("listRole", roleDtos);
		return "user/edit";
	}
	
	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public String edit(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("password") String password,@RequestParam("email") String email,
			@RequestParam("avatar") String avatar, @RequestParam("role_id") int role_id, ModelMap model) {
		RoleDto roleDto = roleService.getById(role_id);	
		UserDto dto = new UserDto();
		dto.setId(id);
		dto.setEmail(email);
		dto.setFullname(name);
		dto.setPassword(password);
		dto.setAvatar(avatar);
		dto.setRoleDto(roleDto);
		
		if (userService.update(dto)==1) {
			return "redirect:/user";
		}
		model.addAttribute("message", "Cập nhật thất bại");
		return "user/edit";
		
	}
	
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(@RequestParam("id") int id) {
		userService.delete(id);
		return "redirect:/user";
	}
}
