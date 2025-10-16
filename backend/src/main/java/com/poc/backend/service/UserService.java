package com.poc.backend.service;

import com.poc.backend.dto.user.UserDto;
import com.poc.backend.entity.User;
import com.poc.backend.exception.ResourceNotFoundException;
import com.poc.backend.mapper.UserMapper;
import com.poc.backend.repository.RoleRepo;
import com.poc.backend.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class  UserService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    RoleRepo roleRepo;
    @Autowired
    UserMapper userMapper;
    public UserDto registerUser(UserDto userDto) {

    }
    public UserDto getUserById(Long id){
        User user = userRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User not found with id: " + id));
        return userMapper.toDto(user);

    }

}






















