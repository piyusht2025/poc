package com.poc.backend.dto.booking;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BookingRequestDto {
    private Long vehicleId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
