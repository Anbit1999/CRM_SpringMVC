package com.cybersoft.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cybersoft.dto.ProjectDto;
import com.cybersoft.dto.StatusDto;
import com.cybersoft.dto.TaskDto;
import com.cybersoft.dto.UserDto;
import com.cybersoft.service.ProjectService;
import com.cybersoft.service.StatusService;
import com.cybersoft.service.TaskService;
import com.cybersoft.service.UserService;

@Controller
@Scope("prototype")
@RequestMapping("task")
public class TaskController {

	private TaskService taskService;
	
	private UserService userService;
	
	private ProjectService projectService;
	
	private StatusService statusService;
	
	

	public TaskController(TaskService taskService, UserService userService, ProjectService projectService,
			StatusService statusService) {
		super();
		this.taskService = taskService;
		this.userService = userService;
		this.projectService = projectService;
		this.statusService = statusService;
	}

	@GetMapping("")
	public String index(ModelMap model) {
		List<TaskDto> dtos = taskService.getAll();
		model.addAttribute("listTask", dtos);
		return "task/index";
	}
	
	@GetMapping("add")
	public String add(ModelMap model) {
		List<UserDto> userDtos = userService.getAll();
		List<ProjectDto> projectDtos = projectService.getAll();
		List<StatusDto> statusDtos = statusService.getAll();
		
		model.addAttribute("listProject", projectDtos);
		model.addAttribute("listUser", userDtos);
		model.addAttribute("listStatus", statusDtos);
		return "task/add";
	}
	
	@PostMapping("add")
	public String add(@RequestParam("name") String name, @RequestParam("startDate") String startDate,
			@RequestParam("endDate") String endDate, @RequestParam("project_id") int project_id,
			@RequestParam("user_id") int user_id, @RequestParam("status_id") int status_id, ModelMap model) {
		LocalDate start = LocalDate.parse(startDate);
		LocalDate end = LocalDate.parse(endDate);
		ProjectDto projectDto = projectService.getById(project_id);
		UserDto userDto = userService.getById(user_id);
		StatusDto statusDto = statusService.getById(status_id);
		TaskDto dto = new TaskDto();
		dto.setName(name);
		dto.setStartDate(start);
		dto.setEndDate(end);
		dto.setProjectDto(projectDto);
		dto.setUserDto(userDto);
		dto.setStatusDto(statusDto);
		if (taskService.add(dto)==1) {
			return "redirect:/task";
		}
		model.addAttribute("message", "Thêm mới thất bại");
		return "task/add";
		
		
	}
	
	@GetMapping("edit")
	public String edit(@RequestParam("id") int id, ModelMap model) {
		TaskDto dto = taskService.getById(id);
		List<ProjectDto> projectDtos = projectService.getAll();
		List<StatusDto> statusDtos = statusService.getAll();
		List<UserDto> userDtos = userService.getAll();
		
		model.addAttribute("task", dto);
		model.addAttribute("listProject", projectDtos);
		model.addAttribute("listStatus", statusDtos);
		model.addAttribute("listUser", userDtos);
		return "task/edit";
	}
	
	@PostMapping("edit")
	public String edit(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("startDate") String startDate,
			@RequestParam("endDate") String endDate, @RequestParam("project_id") int project_id,
			@RequestParam("user_id") int user_id, @RequestParam("status_id") int status_id, ModelMap model) {
		
		ProjectDto projectDto = projectService.getById(project_id);
		UserDto userDto = userService.getById(user_id);
		StatusDto statusDto = statusService.getById(status_id);
		TaskDto dto = taskService.getById(id);
		dto.setName(name);
		dto.setStartDate(LocalDate.parse(startDate));
		dto.setEndDate(LocalDate.parse(endDate));
		dto.setProjectDto(projectDto);
		dto.setUserDto(userDto);
		dto.setStatusDto(statusDto);
		
		if (taskService.update(dto)==1) {
			return "redirect:/task";
		}
		model.addAttribute("message", "Cập nhật thất bại");
		return "task/edit";
		
	}
	
	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		taskService.delete(id);
		return "redirect:/task";
	}
}
