package com.aryany9.portfoliobackend.repository;

import com.aryany9.portfoliobackend.model.SocialMedias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialMediaRepository extends JpaRepository<SocialMedias, Long> {
}
