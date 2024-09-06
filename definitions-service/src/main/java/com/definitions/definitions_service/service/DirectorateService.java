package com.definitions.definitions_service.service;

import com.definitions.definitions_service.model.entity.DirectorateEntity;

import java.util.List;

public interface DirectorateService {

    public DirectorateEntity saveDirectorate(DirectorateEntity directorate);

    public List<DirectorateEntity> listDirectorates() ;

}