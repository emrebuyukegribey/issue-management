package com.emreb.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emreb.issuemanagement.entity.IssueHistory;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long>{

}
