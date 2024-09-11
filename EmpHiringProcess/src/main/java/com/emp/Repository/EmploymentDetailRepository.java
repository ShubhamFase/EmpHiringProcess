package com.emp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.model.EmploymentDetails;

@Repository
public interface EmploymentDetailRepository extends JpaRepository<EmploymentDetails, Long> {

}
