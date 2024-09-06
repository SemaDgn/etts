package com.definitions.definitions_service.repository;

import com.definitions.definitions_service.model.entity.FuelTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelTypeRepository extends JpaRepository<FuelTypeEntity, Long> {
}
