package com.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Task;

@Service
public class TodoAppService {
	
	@Autowired
	private TaskDTOService taskDTOService;
	
	public List<Task> getAllTask(){
		return taskDTOService.findAll();
	}
}
