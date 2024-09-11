package com.emp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.model.EducationalDetails;

@Repository
public interface EducationalDetailRepository extends JpaRepository<EducationalDetails, Long> {

}
