package com.aryany9.portfoliobackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialMediasDTO {
    private String platformTitle;
    private String platformUrl;
    private String platformLogoUrl;
}
