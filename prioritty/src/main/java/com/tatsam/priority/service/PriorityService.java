package com.tatsam.priority.service;
import com.tatsam.priority.entity.*;
import java.util.List;

public interface PriorityService {

	public List<Priority> getAllPriorities();

	public Priority getPriority(Long id);

	public Priority addPriority(Priority priority);

	public Priority updatePriority(Priority priority);

	public void deletePriority(Long id);
	
}
