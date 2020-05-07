package com.emreb.issuemanagement.service;

import org.springframework.data.domain.Pageable;

import com.emreb.issuemanagement.dto.IssueDto;
import com.emreb.issuemanagement.util.TPage;

public interface IssueService {

	IssueDto save(IssueDto issue);
	
	IssueDto getById(Long id);
	
	TPage<IssueDto> getAllPageable(Pageable pageable);
	
	Boolean delete(IssueDto Issue);
}
