package com.example.user;

import org.springframework.data.annotation.Id;

public class Guest {
	@Id
 	private String membercode;
    public String getMembercode() {
		return membercode;
	}
	public void setMembercode(String membercode) {
		this.membercode = membercode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String name;
    private String email;
    private String mobileNo;
    private String dob;
    private String gender;
    private String company;
    private String address;
	public Guest(String membercode, String name, String email, String mobileNo, String dob, String gender,
			String company, String address) {
		super();
		this.membercode = membercode;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.gender = gender;
		this.company = company;
		this.address = address;
	}
    

}
