package com.sti.api.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public @Data class Activity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
    private String name;
    private Date dateEstimated;
    private String status;
    private long dateLate;
    
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="employee_id", referencedColumnName = "id")
    private Employee employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateEstimated() {
		return dateEstimated;
	}

	public void setDateEstimated(Date dateEstimated) {
		this.dateEstimated = dateEstimated;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getDateLate() {
		return dateLate;
	}

	public void setDateLate(long dateLate) {
		this.dateLate = dateLate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
    
}
