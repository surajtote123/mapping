package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="adhars")
public class Adhar {
	
	
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int adharId;
	
	@Id
	private String adharNo;

	@OneToOne(mappedBy="ad")
	private Employee emp;

	public int getAdharId() {
		return adharId;
	}

	public void setAdharId(int adharId) {
		this.adharId = adharId;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Adhar [adharId=" + adharId + ", adharNo=" + adharNo + ", emp=" + emp + "]";
	}

	public Adhar(int adharId, String adharNo, Employee emp) {
		super();
		this.adharId = adharId;
		this.adharNo = adharNo;
		this.emp = emp;
	}

	public Adhar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
