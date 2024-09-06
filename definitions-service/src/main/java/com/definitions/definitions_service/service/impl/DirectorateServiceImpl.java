package com.definitions.definitions_service.service.impl;

import com.definitions.definitions_service.model.entity.Directorate;
import com.definitions.definitions_service.repository.DiretorateRepository;
import com.definitions.definitions_service.service.DirectorateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorateServiceImpl implements DirectorateService {

    @Autowired
    private DiretorateRepository diretorateRepository;

    @Override
    public Directorate saveDirectorate(Directorate directorate) {
        return diretorateRepository.save(directorate);
    }

    @Override
    public List<Directorate> listDirectorates() {
        return diretorateRepository.findAll();
    }
}