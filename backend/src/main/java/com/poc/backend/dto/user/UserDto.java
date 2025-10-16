package com.poc.backend.dto.user;

import com.poc.backend.entity.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String role;
}
