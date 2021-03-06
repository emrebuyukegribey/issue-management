package com.emreb.issuemanagement.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.emreb.issuemanagement.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{

	List<Project> getByProjectCode(String projectCode);
	
	List<Project> getByProjectCodeContains(String projectCode);
	
	Page<Project> findAll(Pageable pageable);
	
	List<Project> findAll(Sort sort);
}
