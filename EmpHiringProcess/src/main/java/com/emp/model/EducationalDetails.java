package com.emp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "educational_details")
public class EducationalDetails {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   
    private String edu10thInstitution;
    private Integer edu10thYear;
    private Double edu10thMarks;

   
    private String edu12thInstitution;
    private Integer edu12thYear;
    private Double edu12thMarks;

    
    private String eduGradInstitution;
    private Integer eduGradYear;
    private Double eduGradMarks;

    private String eduPostgradInstitution;
    private String eduPostgradYear;
    private String eduPostgradMarks;

    @OneToOne
    @JoinColumn(name = "personal_details_id")
    private PersonalDetails personalDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEdu10thInstitution() {
		return edu10thInstitution;
	}

	public void setEdu10thInstitution(String edu10thInstitution) {
		this.edu10thInstitution = edu10thInstitution;
	}

	public Integer getEdu10thYear() {
		return edu10thYear;
	}

	public void setEdu10thYear(Integer edu10thYear) {
		this.edu10thYear = edu10thYear;
	}

	public Double getEdu10thMarks() {
		return edu10thMarks;
	}

	public void setEdu10thMarks(Double edu10thMarks) {
		this.edu10thMarks = edu10thMarks;
	}

	public String getEdu12thInstitution() {
		return edu12thInstitution;
	}

	public void setEdu12thInstitution(String edu12thInstitution) {
		this.edu12thInstitution = edu12thInstitution;
	}

	public Integer getEdu12thYear() {
		return edu12thYear;
	}

	public void setEdu12thYear(Integer edu12thYear) {
		this.edu12thYear = edu12thYear;
	}

	public Double getEdu12thMarks() {
		return edu12thMarks;
	}

	public void setEdu12thMarks(Double edu12thMarks) {
		this.edu12thMarks = edu12thMarks;
	}

	public String getEduGradInstitution() {
		return eduGradInstitution;
	}

	public void setEduGradInstitution(String eduGradInstitution) {
		this.eduGradInstitution = eduGradInstitution;
	}

	public Integer getEduGradYear() {
		return eduGradYear;
	}

	public void setEduGradYear(Integer eduGradYear) {
		this.eduGradYear = eduGradYear;
	}

	public Double getEduGradMarks() {
		return eduGradMarks;
	}

	public void setEduGradMarks(Double eduGradMarks) {
		this.eduGradMarks = eduGradMarks;
	}

	public String getEduPostgradInstitution() {
		return eduPostgradInstitution;
	}

	public void setEduPostgradInstitution(String eduPostgradInstitution) {
		this.eduPostgradInstitution = eduPostgradInstitution;
	}

	public String getEduPostgradYear() {
		return eduPostgradYear;
	}

	public void setEduPostgradYear(String eduPostgradYear) {
		this.eduPostgradYear = eduPostgradYear;
	}

	public String getEduPostgradMarks() {
		return eduPostgradMarks;
	}

	public void setEduPostgradMarks(String eduPostgradMarks) {
		this.eduPostgradMarks = eduPostgradMarks;
	}

	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}
    
    
}
