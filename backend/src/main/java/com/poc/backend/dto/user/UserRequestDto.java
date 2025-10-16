package com.poc.backend.dto.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRequestDto {
    private String name;
    private String email;
    private String phone;
    private String licenseNo;

}
