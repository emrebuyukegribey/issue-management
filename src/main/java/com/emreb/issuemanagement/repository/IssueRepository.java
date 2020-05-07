package com.emreb.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emreb.issuemanagement.entity.Issue;

public interface IssueRepository extends JpaRepository<Issue, Long> {

}
