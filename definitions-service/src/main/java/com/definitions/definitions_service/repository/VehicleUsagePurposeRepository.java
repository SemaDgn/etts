package com.definitions.definitions_service.repository;

import com.definitions.definitions_service.model.VehicleUsagePurpose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleUsagePurposeRepository extends JpaRepository<VehicleUsagePurpose, Integer> {
}