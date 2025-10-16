package com.poc.backend.service;

import org.springframework.stereotype.Service;

@Service
public class VehicleService {
}

/*private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final UserMapper userMapper;
    @Override
    public UserDto registerUser(UserDto userDto) {
        Role role = roleRepository.findByName(userDto.getRole())
                .orElseThrow(() -> new ResourceNotFoundException("Role not found: " + userDto.getRole()));
        User user = userMapper.toEntity(userDto, role);
        User savedUser = userRepository.save(user);
        return userMapper.toDto(savedUser);
    }
    @Override
    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        return userMapper.toDto(user);
    }
    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }
    @Override
    public UserDto updateUser(Long id, UserDto userDto) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPhone(userDto.getPhone());
        user.setLicenseNo(userDto.getLicenseNo());
        user.setUpdatedAt(java.time.LocalDateTime.now());
        User updatedUser = userRepository.save(user);
        return userMapper.toDto(updatedUser);
    }
    @Override
    public void softDeleteUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        user.setIsActive(false);
        userRepository.save(user);
    }*/