package com.definitions.definitions_service.controller;

import com.definitions.definitions_service.model.entity.DirectorateEntity;
import com.definitions.definitions_service.service.DirectorateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DirectorateController {

    @Autowired
    private DirectorateService directorateService;

    @PostMapping(path = "/api/Directorates" )
    public DirectorateEntity createDirectorate(@RequestBody DirectorateEntity directorate){
        return directorateService.saveDirectorate(directorate);
    }

    @GetMapping(path = "/api/Directorates")
    public List<DirectorateEntity> getAllDirectorates(){
        return directorateService.listDirectorates();
    }


}
