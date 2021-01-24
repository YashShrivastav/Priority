package com.tatsam.priority.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tatsam.priority.dao.PriorityDao;
import com.tatsam.priority.entity.Priority;

@Service
public class PriorityServiceImpl implements PriorityService {

	@Autowired
	private PriorityDao priorityDao;
	
	@Override
	public List<Priority> getAllPriorities() {
		// TODO Auto-generated method stub
		return priorityDao.findAllByOrderByPriorityDesc();
	}

	@Override
	public Priority getPriority(Long id) {
		// TODO Auto-generated method stub
		
		return priorityDao.getOne(id);
	}

	@Override
	public Priority addPriority(Priority priority) {
		// TODO Auto-generated method stub
		
		return priorityDao.save(priority);
	}

	@Override
	public Priority updatePriority(Priority priority) {
		// TODO Auto-generated method stub
		return priorityDao.save(priority);
	}

	@Override
	public void deletePriority(Long id) {
		// TODO Auto-generated method stub
		Priority entity = priorityDao.getOne(id);
		priorityDao.delete(entity);
		
	}


}
