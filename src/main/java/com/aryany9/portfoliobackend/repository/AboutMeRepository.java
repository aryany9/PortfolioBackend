package com.aryany9.portfoliobackend.repository;

import com.aryany9.portfoliobackend.model.AboutMe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutMeRepository extends JpaRepository<AboutMe, Long> {
}
