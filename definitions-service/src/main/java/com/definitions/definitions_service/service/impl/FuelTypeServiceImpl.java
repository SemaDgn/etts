package com.definitions.definitions_service.service.impl;

import com.definitions.definitions_service.model.entity.FuelType;
import com.definitions.definitions_service.repository.FuelTypeRepository;
import com.definitions.definitions_service.service.FuelTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuelTypeServiceImpl implements FuelTypeService{

    @Autowired
    private FuelTypeRepository fuelTypeRepository;

    @Override
    public FuelType saveFuelType(FuelType fuelType){
        return fuelTypeRepository.save(fuelType);
    }
    @Override
    public List<FuelType> listFuelTypes(){
        return fuelTypeRepository.findAll();
    }
}
