package com.aryany9.portfoliobackend.service;

import com.aryany9.portfoliobackend.dto.SocialMediasDTO;
import com.aryany9.portfoliobackend.model.SocialMedias;
import com.aryany9.portfoliobackend.repository.SocialMediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SocialMediaService {
    @Autowired
    private SocialMediaRepository socialMediaRepository;

    public List<SocialMediasDTO> getAllSocialMedias() {
        List<SocialMedias> socialMedias = socialMediaRepository.findAll();
        return socialMedias.stream().map(s -> new SocialMediasDTO(s.getPlatformTitle(), s.getPlatformUrl(), s.getPlatformLogoUrl())).collect(Collectors.toList());
    }
}

