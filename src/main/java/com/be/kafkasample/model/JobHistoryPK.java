package com.be.kafkasample.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the job_history database table.
 * 
 */
@Embeddable
public class JobHistoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="employee_id")
	private Integer employeeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_date")
	private java.util.Date startDate;

	public JobHistoryPK() {
	}
	public Integer getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public java.util.Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof JobHistoryPK)) {
			return false;
		}
		JobHistoryPK castOther = (JobHistoryPK)other;
		return 
			this.employeeId.equals(castOther.employeeId)
			&& this.startDate.equals(castOther.startDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.employeeId.hashCode();
		hash = hash * prime + this.startDate.hashCode();
		
		return hash;
	}
}