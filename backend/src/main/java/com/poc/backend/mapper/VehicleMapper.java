package com.poc.backend.mapper;

import com.poc.backend.dto.vehicle.VehicleDto;
import com.poc.backend.dto.vehicle.VehicleResponseDto;
import com.poc.backend.entity.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class VehicleMapper {
    @Autowired
    private ModelMapper modelMapper;
    public VehicleResponseDto toDto(Vehicle vehicle){
        VehicleResponseDto vehicleDto = modelMapper.map(vehicle,VehicleResponseDto.class);
        vehicleDto.setOwnerName(vehicle.getOwner().getName());
        vehicleDto.setType(vehicle.getType().getName());
        vehicleDto.setFuelType(vehicle.getFuelType().getName());
        vehicleDto.setImages(
                vehicle.getImages()!=null ?
                        vehicle.getImages().stream().map(img->img.getUrl()).collect(Collectors.toList())
                        :null);
        return vehicleDto;
    }
    public Vehicle toEntity(VehicleDto dto,User owner,VehicleType type,FuelType fuelType,VehicleStatus status) {
        Vehicle vehicle = modelMapper.map(dto, Vehicle.class);
        vehicle.setOwner(owner);
        vehicle.setType(type);
        vehicle.setFuelType(fuelType);
        vehicle.setStatus(status);
        return vehicle;
    }
}
