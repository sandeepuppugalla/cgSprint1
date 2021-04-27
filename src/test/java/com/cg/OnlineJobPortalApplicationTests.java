package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.freelanceapp.dto.FreelancerDto;
import com.cg.freelanceapp.dto.JobDto;
import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.service.IBookmarkedJobService;
import com.cg.freelanceapp.service.IFreelancerService;
import com.cg.freelanceapp.service.IJobService;
import com.cg.freelanceapp.service.ISkillService;

@SpringBootTest
class OnlineJobPortalApplicationTests {

	@Autowired
	ISkillService skillService;

	@Autowired
	IBookmarkedJobService bookmarkedJobService;

	@Autowired
	IJobService jobService;

	@Autowired
	IFreelancerService freelancerService;

	@Test
	void testAddSkill() {
		Skill skill = new Skill("java123", "java skill");
		skillService.save(skill);
		Long id = skillService.getCurrentId();
		assertEquals("java skill", skillService.findById(id).getDescription());
	}

	
	

	@Test
	void testAddFreelancer() {
		FreelancerDto freelancer = new FreelancerDto("John", "Doe", "password123");
		freelancerService.save(freelancer);
		Long id = freelancerService.getCurrentId();
		assertEquals("password123", freelancerService.findById(id).getPassword());
	}
	
	

	
}