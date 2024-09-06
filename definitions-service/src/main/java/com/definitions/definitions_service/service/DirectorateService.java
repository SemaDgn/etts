package com.definitions.definitions_service.service;

import com.definitions.definitions_service.model.Directorate;
import com.definitions.definitions_service.repository.DiretorateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorateService {

    @Autowired
    private DiretorateRepository diretorateRepository;

    public Directorate createDirectorate(Directorate directorate) {
        return diretorateRepository.save(directorate);
    }

    List<Directorate> getAllDirectorates() {
        return diretorateRepository.findAll();
    }
}
