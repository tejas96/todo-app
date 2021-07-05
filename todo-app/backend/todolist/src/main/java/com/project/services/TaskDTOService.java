package com.project.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.constant.Priority;
import com.project.constant.TaskStatus;
import com.project.model.Task;
import com.project.repo.TodoAppRepository;

@Service
public class TaskDTOService implements  TodoAppRepository{

	List<Task> allTask = new ArrayList<>(Arrays.asList(
			Task.builder().id(1L).task("crud app").priority(Priority.HIGH).status(TaskStatus.OPEN).build(),
			Task.builder().id(2L).task("xyz app").priority(Priority.HIGH).status(TaskStatus.OPEN).build(),
			Task.builder().id(3L).task("abc app").priority(Priority.HIGH).status(TaskStatus.OPEN).build(),
			Task.builder().id(4L).task("rty app").priority(Priority.HIGH).status(TaskStatus.OPEN).build()
		));

	@Override
	public Task findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> findAll() {
		return allTask;
	}

	@Override
	public Task save(Task t) {
		// TODO Auto-generated method stub
		return null;
	}

}
