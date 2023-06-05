package com.record.entity;

import javax.persistence.Entity;

@Entity
public class Record {
	
	private Long cId;
	private String CompanyName;
	private Long eId;
	
	
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public Long geteId() {
		return eId;
	}
	public void seteId(Long eId) {
		this.eId = eId;
	}
	
	public Record(Long cId, String companyName, Long eId) {
		super();
		this.cId = cId;
		CompanyName = companyName;
		this.eId = eId;
	}
	
	public Record() {
		super();
	}
	
	
	
}
