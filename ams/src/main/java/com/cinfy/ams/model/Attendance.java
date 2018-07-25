package com.cinfy.ams.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "attendance")
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	@ManyToOne
	private Employee employee;
	
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	@ManyToOne
	private Company company;
	
	@Column(name = "sign_in_time")
	private Date signInTime;
	
	@Column(name = "sign_out_time")
	private Date signOutTime;
	
	@Column(name = "longitude")
	private Integer longitude;
	
	@Column(name = "latitude")
	private Integer latitude;
	
	@Column(name = "location_name")
	private String locationName;
	
	@Column(name = "photo")
	private String photo;

	@Column(name = "attendance_date")
	private Date date;
	
	

}
