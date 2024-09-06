package com.definitions.definitions_service.service;

import com.definitions.definitions_service.model.entity.FuelType;

import java.util.List;

public interface FuelTypeService {

    public FuelType saveFuelType(FuelType fuelType);

    public List<FuelType> listFuelTypes();

 }
