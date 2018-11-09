package com.be.kafkasample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.be.kafkasample.model.JobHistory;
import com.be.kafkasample.model.JobHistoryPK;

@Repository
public interface JobHistoryRepository extends JpaRepository<JobHistory, JobHistoryPK> {

}
