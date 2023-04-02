package com.aryany9.portfoliobackend.controller;

import com.aryany9.portfoliobackend.dto.AboutMeDTO;
import com.aryany9.portfoliobackend.service.AboutMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/AboutMe")
public class AboutMeController {

    @Autowired
    private AboutMeService aboutMeService;

    @GetMapping
    public ResponseEntity<AboutMeDTO> getAboutMe() {
        AboutMeDTO aboutMeDTO = aboutMeService.getAboutMe();
        return new ResponseEntity<>(aboutMeDTO, HttpStatus.OK);
    }
}
