package com.sti.api.services;

import java.util.Date;
import java.util.List;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sti.api.model.Activity;
import com.sti.api.repositories.ActivityRepository;

@Service
public class ActivityServiceImpl implements ActivityService {
	
	@Autowired
	ActivityRepository repository;
	
	@Override
	public List<Activity> getActivities() {
		List<Activity> activities = repository.findAll();
		if (!activities.isEmpty()) {
			activities.stream().forEach((Activity data) -> {
				Date dateEstimated = data.getDateEstimated();
				LocalDate endDate = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				LocalDate startDate = dateEstimated.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				long noOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);
				if (noOfDaysBetween > 0) {
					data.setDateLate(noOfDaysBetween);
					repository.save(data);
				}
			});
				
		}
		return activities;
	}

	@Override
	public Activity findActivity(Long id) {
		return repository.findById(id);
	}

	@Override
	public Activity saveActivity(Activity activity) {
		return repository.save(activity);
	}

	@Override
	public void deleteActivity(Activity activity) {
		repository.delete(activity);

	}

}
