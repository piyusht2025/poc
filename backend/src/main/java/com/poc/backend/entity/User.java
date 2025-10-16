package com.poc.backend.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "users")
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name="email" , unique = true , nullable = false)
    private String email;
    @Column( name = "phone",nullable = false)
    private String phone;
    @Column( name="license_no",unique = true)
    private String licenseNo;
    @ManyToOne
    @JoinColumn(name = "role" )
    private Role role;
    @Column( name="created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
    @Column( name="updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();
    @Column( name="is_active")
    private boolean isActive = true;

}
