package com.tatsam.priority.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tatsam.priority.entity.Priority;

public interface PriorityDao extends JpaRepository<Priority, Long>
{
	//Defining JpaRepository with a method similar to Query "Select * from table order by Priority DESC"
	
	List<Priority> findAllByOrderByPriorityDesc();
	
	
}
