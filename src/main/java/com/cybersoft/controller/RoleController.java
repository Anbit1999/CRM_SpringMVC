package com.cybersoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cybersoft.dto.RoleDto;
import com.cybersoft.service.RoleService;

@Controller
@Scope("prototype")
@RequestMapping("role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	
	@GetMapping("")
	public String index(ModelMap model) {
		List<RoleDto> dtos = roleService.getAll();
		model.addAttribute("listRole", dtos);
		return "role/index";
	}
	
	@GetMapping("add")
	public String add() {
		return "role/add";
	}
	
	@PostMapping("add")
	public String add(@RequestParam("name") String name, @RequestParam("desc") String desc, ModelMap model) {
		RoleDto dto = new RoleDto();
		dto.setName(name);
		dto.setDescription(desc);
		if (roleService.add(dto)==1) {
			return "redirect:/role";
		}
		model.addAttribute("message", "Cập nhật thất bại");
		return "role/add";
	}
	
	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, ModelMap model) {
		RoleDto dto = roleService.getById(id);
		model.addAttribute("role", dto);
		return "role/edit";
	}
	
	@PutMapping("edit")
	public String edit(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("desc") String desc, ModelMap model) {
		RoleDto dto = roleService.getById(id);
		dto.setName(name);
		dto.setDescription(desc);
		if (roleService.update(dto)==1) {
			return "redirect:/role";
		}
		model.addAttribute("message", "Cập nhật thất bại");
		return "role/edit";
	}
	
	
	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		roleService.delete(id);
		return "redirect:/role";
	}
	
}
