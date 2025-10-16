package com.poc.backend.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "vehicles")
@Builder
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;
    @ManyToOne
    @JoinColumn(name = "type")
    private VehicleType type;
    @ManyToOne
    @JoinColumn(name = "fuel_type")
    private FuelType fuelType;
    @ManyToOne
    @JoinColumn(name = "status")
    private VehicleStatus status;
    private String brand;
    private String model;
    private String registrationNo;
    private String transmission;
    private Integer seat;
    private Double pricePerHour;
    private Double pricePerDay;
    private Boolean isAvailable = true;
    private Boolean isActive = true;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VehicleImage> images;
}
