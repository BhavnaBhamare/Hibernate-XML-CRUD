package com.pojo;

// Generated Oct 2, 2019 10:38:22 AM by Hibernate Tools 3.4.0.CR1

/**
 * Emplyoee generated by hbm2java
 */
public class Emplyoee implements java.io.Serializable {

	private Integer id;
	private String name;
	private String email;
	private String mobile;
	private String dateofbirth;
	private String address;
	private String salary;

	public Emplyoee() {
	}

	public Emplyoee(String name, String email, String mobile, String dateofbirth, String address, String salary) {
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.dateofbirth = dateofbirth;
		this.address = address;
		this.salary = salary;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDateofbirth() {
		return this.dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSalary() {
		return this.salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
