package com.project.model;

import com.project.constant.Priority;
import com.project.constant.TaskStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Task {
	private Long id;
	private String task;
	private TaskStatus status;
	private Priority priority;
}	
