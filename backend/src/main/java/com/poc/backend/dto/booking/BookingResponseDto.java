package com.poc.backend.dto.booking;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Builder
public class BookingResponseDto {
        private Long id;
        private String vehicleModel;
        private String ownerName;
        private LocalDateTime startTime;
        private LocalDateTime endTime;
        private Double amount;
        private String status;

}
