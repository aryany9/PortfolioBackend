package com.aryany9.portfoliobackend.service;

import com.aryany9.portfoliobackend.model.Designations;
import com.aryany9.portfoliobackend.repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DesignationService {
    @Autowired
    private DesignationRepository designationRepository;

    public List<String> getAllDesignationTitles(){
        List<Designations> designations = designationRepository.findAll();
        return designations.stream().map(Designations::getDesignationTitle).collect(Collectors.toList());
    }
}
