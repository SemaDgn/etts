package com.definitions.definitions_service.repository;

import com.definitions.definitions_service.model.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelTypeRepository extends JpaRepository<FuelType, Short> {
}