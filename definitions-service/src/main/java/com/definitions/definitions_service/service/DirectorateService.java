package com.definitions.definitions_service.service;

import com.definitions.definitions_service.model.entities.DirectorateEntity;
import com.definitions.definitions_service.repository.DiretorateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorateService {

    @Autowired
    private DiretorateRepository diretorateRepository;

    public DirectorateEntity createDirectorate(DirectorateEntity directorate) {
        return diretorateRepository.save(directorate);
    }

    List<DirectorateEntity> getAllDirectorates() {
        return diretorateRepository.findAll();
    }
}
