package com.poc.backend.dto.vehicle;

import com.poc.backend.entity.User;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class VehicleResponseDto {
    private String ownerName;
    private String type;
    private String fuelType;
    private String status;
    private String brand;
    private String model;
    private String registrationNo;
    private String transmission;
    private Integer seat;
    private Double pricePerHour;
    private Double pricePerDay;

    private List<String> images;
}
