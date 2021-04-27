package com.cg.freelanceapp.service;

import com.cg.freelanceapp.dto.RecruiterDto;
import com.cg.freelanceapp.entities.Recruiter;

public interface IRecruiterService {
	
	Recruiter save(RecruiterDto recruiterDto);

	Recruiter update(Recruiter recruiter);

	Recruiter findById(Long id);

}
