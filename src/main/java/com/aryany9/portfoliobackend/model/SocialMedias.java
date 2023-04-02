package com.aryany9.portfoliobackend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "social_medias")
@Getter
@Setter
@NoArgsConstructor
public class SocialMedias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "platform_title", nullable = false)
    private String platformTitle;
    @Column(name = "platform_url", nullable = false)
    private String platformUrl;

    @Column(name = "platform_logo_url", nullable = false)
    private String platformLogoUrl;
}