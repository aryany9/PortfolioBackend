package com.aryany9.portfoliobackend.dto;
import com.aryany9.portfoliobackend.model.SocialMedias;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Set;

// The AboutMeDTO class is used to transfer data between the client and the server

@Data
@AllArgsConstructor
public class AboutMeDTO {
    private String firstName;
    private String lastName;
    private List<String> designations;

    private List<SocialMediasDTO> socialMedias;
    private String profilePic;
//    private Set<SocialMediasDTO> socialMediaUrls;
}
