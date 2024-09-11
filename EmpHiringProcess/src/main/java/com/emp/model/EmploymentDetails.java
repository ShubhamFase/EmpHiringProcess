package com.emp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employment_details")
public class EmploymentDetails {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String reference;
	    private String positionApplied;
	    private String preferredWorkLocation;

	    private String interviewedByAFIML;
	    private String relativeInAFIML;
	    private String hasBike;
	    private String hasDrivingLicense;
	    private String relativeInLawEnforcement;
	    private String convicted;

	    @OneToOne
	    @JoinColumn(name = "personal_details_id")
	    private PersonalDetails personalDetails;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getReference() {
			return reference;
		}

		public void setReference(String reference) {
			this.reference = reference;
		}

		public String getPositionApplied() {
			return positionApplied;
		}

		public void setPositionApplied(String positionApplied) {
			this.positionApplied = positionApplied;
		}

		public String getPreferredWorkLocation() {
			return preferredWorkLocation;
		}

		public void setPreferredWorkLocation(String preferredWorkLocation) {
			this.preferredWorkLocation = preferredWorkLocation;
		}

		public String getInterviewedByAFIML() {
			return interviewedByAFIML;
		}

		public void setInterviewedByAFIML(String interviewedByAFIML) {
			this.interviewedByAFIML = interviewedByAFIML;
		}

		public String getRelativeInAFIML() {
			return relativeInAFIML;
		}

		public void setRelativeInAFIML(String relativeInAFIML) {
			this.relativeInAFIML = relativeInAFIML;
		}

		public String getHasBike() {
			return hasBike;
		}

		public void setHasBike(String hasBike) {
			this.hasBike = hasBike;
		}

		public String getHasDrivingLicense() {
			return hasDrivingLicense;
		}

		public void setHasDrivingLicense(String hasDrivingLicense) {
			this.hasDrivingLicense = hasDrivingLicense;
		}

		public String getRelativeInLawEnforcement() {
			return relativeInLawEnforcement;
		}

		public void setRelativeInLawEnforcement(String relativeInLawEnforcement) {
			this.relativeInLawEnforcement = relativeInLawEnforcement;
		}

		public String getConvicted() {
			return convicted;
		}

		public void setConvicted(String convicted) {
			this.convicted = convicted;
		}

		public PersonalDetails getPersonalDetails() {
			return personalDetails;
		}

		public void setPersonalDetails(PersonalDetails personalDetails) {
			this.personalDetails = personalDetails;
		}
	    
	    
}
