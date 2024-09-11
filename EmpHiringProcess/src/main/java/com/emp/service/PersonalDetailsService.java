package com.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.Repository.EducationalDetailRepository;
import com.emp.Repository.EmploymentDetailRepository;
import com.emp.Repository.PersonalDetailRepository;
import com.emp.Repository.ReferanceDetailRepository;
import com.emp.Repository.WorkExperienceDetailRepository;
import com.emp.model.EducationalDetails;
import com.emp.model.EmploymentDetails;
import com.emp.model.PersonalDetails;
import com.emp.model.ReferanceDetails;
import com.emp.model.WorkExperience;

@Service
public class PersonalDetailsService {

	@Autowired
	private PersonalDetailRepository personalDetailRepository;
	
	@Autowired
	private EducationalDetailRepository educationalDetailRepository;

	@Autowired
	private WorkExperienceDetailRepository workExperienceRepository;
	
	@Autowired
	private EmploymentDetailRepository employmentDetailRepository;
	
	@Autowired
	private ReferanceDetailRepository referanceDetailRepository; 
	
	public void saveAllDetails(PersonalDetails personalDetails,EducationalDetails educationalDetails,WorkExperience workExperienceDetails,EmploymentDetails employmentDetails,ReferanceDetails referanceDetails) 
	{
		PersonalDetails savePersonalDetail=personalDetailRepository.save(personalDetails);
		
		educationalDetails.setPersonalDetails(savePersonalDetail);
		workExperienceDetails.setPersonalDetails(savePersonalDetail);
		employmentDetails.setPersonalDetails(savePersonalDetail);
		referanceDetails.setPersonalDetails(savePersonalDetail);
		
		educationalDetailRepository.save(educationalDetails);
		workExperienceRepository.save(workExperienceDetails);
		employmentDetailRepository.save(employmentDetails);
		referanceDetailRepository.save(referanceDetails);
	}
}
