package com.emp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.model.PersonalDetails;

@Repository
public interface PersonalDetailRepository extends JpaRepository<PersonalDetails, Long> {

}
