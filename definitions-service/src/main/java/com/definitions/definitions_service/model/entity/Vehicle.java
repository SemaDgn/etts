package com.definitions.definitions_service.model.entity;

import com.definitions.definitions_service.model.enums.VehicleRentalStatuses;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "license_plate", unique = true, nullable = false, length = 10)
    private String licensePlate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "directorate_id", nullable = false)
    private Directorate directorate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "vehicle_usage_purpose_id", nullable = false)
    private VehicleUsagePurpose vehicleUsagePurpose;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fuel_type_id", nullable = false)
    private FuelType fuelTypes;

    @Enumerated(EnumType.STRING)
    @Column(name = "rental_status_id", nullable = false)
    private VehicleRentalStatuses vehicleRentalStatus;
}

