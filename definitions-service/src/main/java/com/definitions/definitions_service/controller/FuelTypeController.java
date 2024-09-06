package com.definitions.definitions_service.controller;

import com.definitions.definitions_service.model.entity.FuelTypeEntity;
import com.definitions.definitions_service.service.FuelTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuelTypeController {

    @Autowired
    private FuelTypeService fuelTypeService;

    @PostMapping(path = "/api/fuelType" )
    public FuelTypeEntity createDirectorate(@RequestBody FuelTypeEntity fuelType){
        return fuelTypeService.saveFuelType(fuelType);
    }

}
