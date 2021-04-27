package com.cg.freelanceapp.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * 
 * @author sandeep
 * created date: 19 April  2021
 * Description : This is entity class for BookmarkedJob module.
 * 
 *
 */
@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
public class BookmarkedJob {

	@Id
	@Column(name="bkd_job_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "bkd_job_seq")
	@SequenceGenerator(name = "bkd_job_seq", sequenceName = "bkd_job_seq", allocationSize = 1)
	Long id;

	@OneToOne(targetEntity = Skill.class,cascade=CascadeType.PERSIST)
	@JoinColumn(name="skill_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	Skill skill;

	@ManyToOne(targetEntity = Job.class,cascade=CascadeType.PERSIST)
	@JoinColumn(name="job_id")
	@OnDelete(action = OnDeleteAction.CASCADE)

	Job job;

	@ManyToOne(targetEntity =Freelancer.class,cascade=CascadeType.PERSIST)
	@JoinColumn(name="freelancer_id")
	@OnDelete(action = OnDeleteAction.CASCADE)

	Freelancer freelancer;

	public BookmarkedJob() {
		super();
	}

	public BookmarkedJob(Long id, Skill skill, Job job, Freelancer freelancer) {
		super();
		this.id = id;
		this.skill = skill;
		this.job = job;
		this.freelancer = freelancer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Freelancer getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

}