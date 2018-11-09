package com.be.kafkasample.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the job_history database table.
 */
@Entity
@Table(name = "job_history")
@NamedQuery(name = "JobHistory.findAll", query = "SELECT j FROM JobHistory j")
public class JobHistory implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private JobHistoryPK id;

    @Column(name = "department_id")
    private Integer departmentId;

    @Column(name = "end_date")
    private Timestamp endDate;

    @Column(name = "start_date", insertable = false, updatable = false)
    private Timestamp startDate;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Job.class)
    @JoinColumn(name = "job_id")
    private Job job;

    public JobHistory() {
    }

    public JobHistoryPK getId() {
        return this.id;
    }

    public void setId(JobHistoryPK id) {
        this.id = id;
    }

    public Integer getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Timestamp getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

}
