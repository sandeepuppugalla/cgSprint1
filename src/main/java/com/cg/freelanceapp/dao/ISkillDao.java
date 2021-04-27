package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Skill;
@Repository
public interface ISkillDao extends JpaRepository<Skill, Long> {

	boolean existsByName(String name);

	Skill findByName(String name);
	
	/*******************************************************************************************
	 * Method:      getCurrentSeriesId
	 * @param       none
	 * @return      Long
	 * Description: This method returns the current value of primary key from the sequence.
	 *******************************************************************************************/
	@Query(value = "select skill_seq.currval from dual", nativeQuery = true)
	Long getCurrentSeriesId();

}
