package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="empl")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String city;
	
	@OneToOne
	@JoinColumn(name="adhar_id")
	private Adhar ad;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Adhar getAd() {
		return ad;
	}

	public void setAd(Adhar ad) {
		this.ad = ad;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", ad=" + ad + "]";
	}

	public Employee(int id, String name, String city, Adhar ad) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.ad = ad;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
