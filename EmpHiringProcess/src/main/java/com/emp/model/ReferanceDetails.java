package com.emp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "referance_details")
public class ReferanceDetails {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String ref1Name;
	    private String ref1Designation;
	    private String ref1Company;
	    private String ref1Address;
	    private String ref1Contact;
	    private String ref1Notes;

	    private String ref2Name;
	    private String ref2Designation;
	    private String ref2Company;
	    private String ref2Address;
	    private String ref2Contact;
	    private String ref2Notes;
	    
	    @OneToOne
	    @JoinColumn(name = "personal_details_id")
	    private PersonalDetails personalDetails;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getRef1Name() {
			return ref1Name;
		}

		public void setRef1Name(String ref1Name) {
			this.ref1Name = ref1Name;
		}

		public String getRef1Designation() {
			return ref1Designation;
		}

		public void setRef1Designation(String ref1Designation) {
			this.ref1Designation = ref1Designation;
		}

		public String getRef1Company() {
			return ref1Company;
		}

		public void setRef1Company(String ref1Company) {
			this.ref1Company = ref1Company;
		}

		public String getRef1Address() {
			return ref1Address;
		}

		public void setRef1Address(String ref1Address) {
			this.ref1Address = ref1Address;
		}

		public String getRef1Contact() {
			return ref1Contact;
		}

		public void setRef1Contact(String ref1Contact) {
			this.ref1Contact = ref1Contact;
		}

		public String getRef1Notes() {
			return ref1Notes;
		}

		public void setRef1Notes(String ref1Notes) {
			this.ref1Notes = ref1Notes;
		}

		public String getRef2Name() {
			return ref2Name;
		}

		public void setRef2Name(String ref2Name) {
			this.ref2Name = ref2Name;
		}

		public String getRef2Designation() {
			return ref2Designation;
		}

		public void setRef2Designation(String ref2Designation) {
			this.ref2Designation = ref2Designation;
		}

		public String getRef2Company() {
			return ref2Company;
		}

		public void setRef2Company(String ref2Company) {
			this.ref2Company = ref2Company;
		}

		public String getRef2Address() {
			return ref2Address;
		}

		public void setRef2Address(String ref2Address) {
			this.ref2Address = ref2Address;
		}

		public String getRef2Contact() {
			return ref2Contact;
		}

		public void setRef2Contact(String ref2Contact) {
			this.ref2Contact = ref2Contact;
		}

		public String getRef2Notes() {
			return ref2Notes;
		}

		public void setRef2Notes(String ref2Notes) {
			this.ref2Notes = ref2Notes;
		}

		public PersonalDetails getPersonalDetails() {
			return personalDetails;
		}

		public void setPersonalDetails(PersonalDetails personalDetails) {
			this.personalDetails = personalDetails;
		}
	    
}
