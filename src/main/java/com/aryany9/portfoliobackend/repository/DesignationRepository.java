package com.aryany9.portfoliobackend.repository;

import com.aryany9.portfoliobackend.model.Designations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository extends JpaRepository<Designations, Long> {
}
