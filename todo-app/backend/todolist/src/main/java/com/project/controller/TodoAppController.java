package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Task;
import com.project.services.TodoAppService;

@RestController
@RequestMapping("/api/v1")
public class TodoAppController {
		
	@Autowired
	private TodoAppService todoApp;
	
	@GetMapping("/ping")
	String ping() {
		return "ping done";
	}
	
	@GetMapping("/alltask")
	ResponseEntity<List<Task>> getTasks(){
		return ResponseEntity.ok(todoApp.getAllTask());
	}
	
	@PostMapping("/task")
	ResponseEntity<Task> addTask(){
		return ResponseEntity.ok(null);
	}
	
}
