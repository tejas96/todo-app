package com.project.services.contract;

import java.util.List;

public interface TodoAppCrudContract<T>{
	T findById(Long id);
	List<T> findAll();
	T save(T t);
}