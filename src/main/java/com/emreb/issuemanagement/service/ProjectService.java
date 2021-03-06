package com.emreb.issuemanagement.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.emreb.issuemanagement.entity.Project;

public interface ProjectService {

	Project save(Project project);

	Project getById(Long id);
	
	List<Project> getByProjectCode(String projectCode);
	
	List<Project> getByProjectCodeContains(String projectCode);

	Page<Project> getAllPageable(Pageable pageable);
	
	Boolean delete(Project project);
}
