package com.cg.freelanceapp.service;

import com.cg.freelanceapp.dto.FreelancerDto;
import com.cg.freelanceapp.entities.Freelancer;

public interface IFreelancerService {

	Freelancer save(FreelancerDto freelancerDto);

	Freelancer update(Freelancer freelancer);

	Freelancer findById(Long id);
	Long getCurrentId();

}
