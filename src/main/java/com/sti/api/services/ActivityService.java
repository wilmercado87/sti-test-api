package com.sti.api.services;

import java.util.List;

import com.sti.api.model.Activity;

public interface ActivityService {
	
	List<Activity> getActivities();
	
	Activity findActivity(Long id);
	
	Activity saveActivity(Activity activity);
	
	void deleteActivity(Activity activity);

}
