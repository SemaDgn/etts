package com.definitions.definitions_service.repository;

import com.definitions.definitions_service.model.entities.VehicleTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleTypeEntity, Short> {
}
