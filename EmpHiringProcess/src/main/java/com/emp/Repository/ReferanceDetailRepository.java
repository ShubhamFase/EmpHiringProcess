package com.emp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.model.ReferanceDetails;

@Repository
public interface ReferanceDetailRepository extends JpaRepository<ReferanceDetails, Long> {

}
