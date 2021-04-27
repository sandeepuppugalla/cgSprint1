package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.BookmarkedJobDTO;
import com.cg.freelanceapp.entities.BookmarkedJob;



@Service
public interface IBookmarkedJobService {

	BookmarkedJob bookmarkJob(BookmarkedJobDTO bjd);

	void remove(Long BId);

	BookmarkedJob findById(Long id);

	List<BookmarkedJob> findBookmarkedJobsBySkillName(String name);
	
	Long getCurrentId();

}
