package com.poc.backend.dto.booking;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Builder
public class BookingDto {
    private Long id;
    private Long renterId;
    private Long vehicleId;
    private String status;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Double amount;
}
