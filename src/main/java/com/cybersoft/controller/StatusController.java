package com.cybersoft.controller;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cybersoft.dto.StatusDto;
import com.cybersoft.service.StatusService;

@Controller
@Scope("prototype")
@RequestMapping("status")
public class StatusController {

	private StatusService statusService;

	public StatusController(StatusService statusService) {
		super();
		this.statusService = statusService;
	}

	@GetMapping("")
	public String index(ModelMap model) {
		List<StatusDto> dtos = statusService.getAll();
		model.addAttribute("listStatus", dtos);
		return "status/index";
	}

	@GetMapping("add")
	public String add() {
		return "status/add";
	}

	@PostMapping("add")
	public String add(@RequestParam("name") String name, ModelMap model) {
		StatusDto dto = new StatusDto();
		dto.setName(name);
		if (statusService.add(dto)==1) {
			return "redirect:/status";
		}
		model.addAttribute("message", "Thêm mới thất bại");
		return "status/edit";
		
		
	}

	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, ModelMap model) {
		StatusDto dto = statusService.getById(id);
		model.addAttribute("status", dto);
		return "status/edit";
	}

	@PostMapping("edit")
	public String edit(@RequestParam("id") int id, @RequestParam("name") String name, ModelMap model) {
		StatusDto dto = statusService.getById(id);
		dto.setName(name);
		if (statusService.update(dto)==1) {
			return "redirect:/status";
		}
		model.addAttribute("message", "Cập nhật thất bại");
		return "status/edit";
	}
	
	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		statusService.delete(id);
		return "redirect:/status";
	}
}
