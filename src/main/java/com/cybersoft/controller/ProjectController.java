package com.cybersoft.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cybersoft.dto.ProjectDto;
import com.cybersoft.service.ProjectService;

@Controller
@Scope("prototype")
@RequestMapping("project")
public class ProjectController {
	
	
	private ProjectService projectService;
	
	
	
	public ProjectController(ProjectService projectService) {
		super();
		this.projectService = projectService;
	}

	@GetMapping("")
	public String index(ModelMap model) {
		List<ProjectDto> dtos = projectService.getAll();
		model.addAttribute("listProject", dtos);
		return "project/index";
	}
	
	@GetMapping("add")
	public String add() {
		return "project/add";
	}
	
	@PostMapping("add")
	public String add(@RequestParam("name") String name, @RequestParam("startDate") String startDate,
			@RequestParam("endDate") String endDate) {
		LocalDate start = LocalDate.parse(startDate);
		LocalDate end = LocalDate.parse(endDate);
		ProjectDto dto = new ProjectDto();
		dto.setName(name);
		dto.setStartDate(start);
		dto.setEndDate(end);
		projectService.add(dto);
		return "redirect:/project";
	}
	
	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, ModelMap model) {
		ProjectDto dto = projectService.getById(id);
		model.addAttribute("project", dto);
		return "project/edit";
	}
	
	@PutMapping("edit")
	public String edit(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("startDate") String startDate,
			@RequestParam("endDate") String endDate) {
		LocalDate start = LocalDate.parse(startDate);
		LocalDate end = LocalDate.parse(endDate);
		ProjectDto dto = new ProjectDto();
		dto.setId(id);
		dto.setName(name);
		dto.setStartDate(start);
		dto.setEndDate(end);
		projectService.update(dto);
		return "redirect:/project";
	}
	
	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		projectService.delete(id);
		return "redirect:/project";
	}
}
