package com.sti.api.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.sti.api.model.Activity;

public interface ActivityRepository extends Repository<Activity, Long>{
	
	List<Activity> findAll();
	
	Activity findById(Long id);
	
	
	Activity save(Activity activity);
	
	void delete(Activity activity);
	
}
