package com.sardorbek.crudapp.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "users_checkin")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Length(max = 15)
	private String firstName;
	@Length(max = 15)
	private String lastName;
	@CreationTimestamp
	private Date createTimeStamp;
	@UpdateTimestamp
	private Date updateTimeStamp;
	private boolean checkedIn;

	public User() {
	}

	public User(String firstName, String lastName, boolean checkedIn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.checkedIn = checkedIn;
	}

	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDate() {
		return createTimeStamp;
	}

	public void setDate(Date date) {
		this.createTimeStamp = date;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
}
