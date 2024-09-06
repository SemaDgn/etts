package com.definitions.definitions_service.service;

import com.definitions.definitions_service.model.entity.FuelTypeEntity;

import java.util.List;

public interface FuelTypeService {

    public FuelTypeEntity saveFuelType(FuelTypeEntity fuelType);

    public List<FuelTypeEntity> listFuelTypes();

 }
