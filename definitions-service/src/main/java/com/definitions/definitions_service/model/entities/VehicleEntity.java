package com.definitions.definitions_service.model.entities;

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
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "license_plate", unique = true, nullable = false, length = 10)
    private String licensePlate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "directorate_id", nullable = false)
    private DirectorateEntity directorate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "vehicle_usage_purpose_id", nullable = false)
    private VehicleUsagePurposeEntity vehicleUsagePurpose;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fuel_type_id", nullable = false)
    private FuelTypeEntity fuelTypes;

    @Enumerated(EnumType.STRING)
    @Column(name = "rental_status_id", nullable = false)
    private VehicleRentalStatuses vehicleRentalStatus;
}

