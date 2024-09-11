package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.emp.model.EducationalDetails;
import com.emp.model.EmploymentDetails;
import com.emp.model.PersonalDetails;
import com.emp.model.ReferanceDetails;
import com.emp.model.WorkExperience;
import com.emp.service.PersonalDetailsService;

@Controller
@RequestMapping("/form")
public class FormController {

	@Autowired
	private PersonalDetailsService personalDetailsService;

	@PostMapping("/submit")
	public String submitForm(@RequestParam String name, @RequestParam String dob, @RequestParam String gender,
			@RequestParam String maritalStatus, @RequestParam String religion, @RequestParam String mobile,
			@RequestParam String email, @RequestParam String permanentAddress, @RequestParam String currentAddress,
			@RequestParam(name = "sameAsPermAddress", defaultValue = "false") boolean sameAsPermAddress,
			@RequestParam String edu10thInstitution, @RequestParam Integer edu10thYear,
			@RequestParam Double edu10thMarks, @RequestParam String edu12thInstitution,
			@RequestParam Integer edu12thYear, @RequestParam Double edu12thMarks,
			@RequestParam String eduGradInstitution, @RequestParam Integer eduGradYear,
			@RequestParam Double eduGradMarks, @RequestParam String eduPostgradInstitution,
			@RequestParam String eduPostgradYear, @RequestParam String eduPostgradMarks, @RequestParam String company,
			@RequestParam String designation, @RequestParam String fromDate, @RequestParam String toDate,
			@RequestParam String experience, @RequestParam String reference, @RequestParam String positionApplied,
			@RequestParam String preferredWorkLocation, @RequestParam String interviewedByAFIML,
			@RequestParam String relativeInAFIML, @RequestParam String hasBike, @RequestParam String hasDrivingLicense,
			@RequestParam String relativeInLawEnforcement, @RequestParam String convicted,
			@RequestParam String ref1Name, @RequestParam String ref1Designation, @RequestParam String ref1Company,
			@RequestParam String ref1Address, @RequestParam String ref1Contact, @RequestParam String ref1Notes,
			@RequestParam String ref2Name, @RequestParam String ref2Designation, @RequestParam String ref2Company,
			@RequestParam String ref2Address, @RequestParam String ref2Contact, @RequestParam String ref2Notes,
			RedirectAttributes redirectAttributes) {

		PersonalDetails personalDetails = new PersonalDetails();
		personalDetails.setName(name);
		personalDetails.setDob(dob);
		personalDetails.setGender(gender);
		personalDetails.setMaritalStatus(maritalStatus);
		personalDetails.setReligion(religion);
		personalDetails.setMobile(mobile);
		personalDetails.setMobile(mobile);
		personalDetails.setEmail(email);
		personalDetails.setPermanentAddress(permanentAddress);
		personalDetails.setCurrentAddress(currentAddress);
		personalDetails.setSameAsPermAddress(sameAsPermAddress);

		EducationalDetails educationalDetails = new EducationalDetails();
		educationalDetails.setEdu10thInstitution(edu10thInstitution);
		educationalDetails.setEdu10thYear(edu10thYear);
		educationalDetails.setEdu10thMarks(edu10thMarks);
		educationalDetails.setEdu12thInstitution(edu12thInstitution);
		educationalDetails.setEdu12thYear(edu12thYear);
		educationalDetails.setEdu12thMarks(edu12thMarks);
		educationalDetails.setEduGradInstitution(eduGradInstitution);
		educationalDetails.setEduGradYear(eduGradYear);
		educationalDetails.setEduGradMarks(eduGradMarks);
		educationalDetails.setEduPostgradInstitution(eduPostgradInstitution);
		educationalDetails.setEduPostgradYear(eduPostgradYear);
		educationalDetails.setEduPostgradMarks(eduPostgradMarks);

		WorkExperience workExperienceDetails = new WorkExperience();
		workExperienceDetails.setCompany(company);
		workExperienceDetails.setDesignation(designation);
		workExperienceDetails.setFromDate(fromDate);
		workExperienceDetails.setToDate(toDate);
		workExperienceDetails.setExperience(experience);

		EmploymentDetails employmentDetails = new EmploymentDetails();
		employmentDetails.setReference(reference);
		employmentDetails.setPositionApplied(positionApplied);
		employmentDetails.setPreferredWorkLocation(preferredWorkLocation);
		employmentDetails.setInterviewedByAFIML(interviewedByAFIML);
		employmentDetails.setRelativeInAFIML(relativeInAFIML);
		employmentDetails.setHasBike(hasBike);
		employmentDetails.setHasDrivingLicense(hasDrivingLicense);
		employmentDetails.setRelativeInLawEnforcement(relativeInLawEnforcement);
		employmentDetails.setConvicted(convicted);

		ReferanceDetails referanceDetails = new ReferanceDetails();
		referanceDetails.setRef1Name(ref1Name);
		referanceDetails.setRef1Designation(ref1Designation);
		referanceDetails.setRef1Company(ref1Company);
		referanceDetails.setRef1Address(ref1Address);
		referanceDetails.setRef1Contact(ref1Contact);
		referanceDetails.setRef1Notes(ref1Notes);
		referanceDetails.setRef2Name(ref2Name);
		referanceDetails.setRef2Designation(ref2Designation);
		referanceDetails.setRef2Company(ref2Company);
		referanceDetails.setRef2Address(ref2Address);
		referanceDetails.setRef2Contact(ref2Contact);
		referanceDetails.setRef2Notes(ref2Notes);
		personalDetailsService.saveAllDetails(personalDetails, educationalDetails, workExperienceDetails,
				employmentDetails, referanceDetails);

		return "redirect:/form/success";
	}

	@GetMapping("/success")
	public String successPage() {
		return "success";
	}

	@GetMapping("/fillform")
	public String fillForm() {
		return "form";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/hrform")
	public String showHrForm() 
	{
		return "hrform";
	}
	
	@GetMapping("/logout")
	public String logout() 
	{
		return "redirect:/form/login";
	}
}
