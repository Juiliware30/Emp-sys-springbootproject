package com.proj.empsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empsys")
public class emp {
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	public int id;
	public String name;
	private String address;
	private String email;
	private String phoneno;
	private int salary;

	
	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phoneno=" + phoneno
				+ ", salary=" + salary + "]";
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
		
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public emp(int id, String name, String address, String email, String phoneno, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phoneno = phoneno;
		this.salary = salary;
	}
	
		
	
}
