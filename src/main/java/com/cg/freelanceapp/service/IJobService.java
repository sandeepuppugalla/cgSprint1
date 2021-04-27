package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.JobDto;
import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.entities.Skill;

@Service
public interface IJobService {

	Job postJob(JobDto jobDto);

	Job findById(Long id);

	List<Job> findJobsBySkill(Skill skill);


	void closeJob(Job job);
	
	Long getCurrentId();

}
