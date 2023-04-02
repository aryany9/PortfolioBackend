package com.aryany9.portfoliobackend.service;

import com.aryany9.portfoliobackend.dto.AboutMeDTO;
import com.aryany9.portfoliobackend.dto.SocialMediasDTO;
import com.aryany9.portfoliobackend.exception.ResourceNotFoundException;
import com.aryany9.portfoliobackend.model.AboutMe;
import com.aryany9.portfoliobackend.model.Designations;
import com.aryany9.portfoliobackend.model.SocialMedias;
import com.aryany9.portfoliobackend.repository.AboutMeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AboutMeService {

    @Autowired
    private AboutMeRepository aboutMeRepository;

    @Autowired
    private DesignationService designationService;

    @Autowired
    private SocialMediaService socialMediaService;

    public AboutMeDTO getAboutMe() {
        AboutMe aboutMe = aboutMeRepository.findById(1L)
                .orElseThrow(() -> new ResourceNotFoundException("AboutMe", "id", 1L));

        String firstName = aboutMe.getFirstName();
        String lastName = aboutMe.getLastName();
        String profilePic = aboutMe.getProfilePic();
        List<String> designationTitles = designationService.getAllDesignationTitles();
        List<SocialMediasDTO> socialMediasList = socialMediaService.getAllSocialMedias();

        AboutMeDTO aboutMeDTO = new AboutMeDTO(firstName, lastName, designationTitles, socialMediasList, profilePic); // passing the required arguments to constructor
        return aboutMeDTO;
    }


}