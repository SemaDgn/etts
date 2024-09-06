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
/*
    public Directorate createDirectorate(String name, String address) {
        return diretorateRepository.save(new Directorate(name, address));
    }

 */

    List<Directorate> getAllDirectorates() {
        return diretorateRepository.findAll();
    }
}
