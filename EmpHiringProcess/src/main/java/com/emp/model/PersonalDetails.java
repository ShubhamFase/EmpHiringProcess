package com.emp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "personal_details")
public class PersonalDetails {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String dob;
	private String gender;
	private String maritalStatus;
	private String religion;
    private String mobile;
    private String email;
    private String permanentAddress;
    private String currentAddress;
    private boolean sameAsPermAddress;
    
    @OneToOne(mappedBy = "personalDetails", cascade = CascadeType.ALL)
    private EducationalDetails educationalDetails;
    
    @OneToOne(mappedBy = "personalDetails", cascade = CascadeType.ALL)
    private WorkExperience workExperience;
    
    @OneToOne(mappedBy = "personalDetails", cascade = CascadeType.ALL)
    private EmploymentDetails employmentDetails;
    
    @OneToOne(mappedBy = "personalDetails", cascade = CascadeType.ALL)
    private ReferanceDetails referanceDetails;

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

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public boolean isSameAsPermAddress() {
		return sameAsPermAddress;
	}

	public void setSameAsPermAddress(boolean sameAsPermAddress) {
		this.sameAsPermAddress = sameAsPermAddress;
	}

	public EducationalDetails getEducationalDetails() {
		return educationalDetails;
	}

	public void setEducationalDetails(EducationalDetails educationalDetails) {
		this.educationalDetails = educationalDetails;
	}

	public WorkExperience getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(WorkExperience workExperience) {
		this.workExperience = workExperience;
	}

	public EmploymentDetails getEmploymentDetails() {
		return employmentDetails;
	}

	public void setEmploymentDetails(EmploymentDetails employmentDetails) {
		this.employmentDetails = employmentDetails;
	}

	public ReferanceDetails getReferanceDetails() {
		return referanceDetails;
	}

	public void setReferanceDetails(ReferanceDetails referanceDetails) {
		this.referanceDetails = referanceDetails;
	}
	
    
}
