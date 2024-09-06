package com.definitions.definitions_service.service;

import com.definitions.definitions_service.model.entity.Directorate;

import java.util.List;

public interface DirectorateService {

    public Directorate saveDirectorate(Directorate directorate);

    public List<Directorate> listDirectorates() ;

}