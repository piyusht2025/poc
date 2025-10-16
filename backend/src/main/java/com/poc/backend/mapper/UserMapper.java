package com.poc.backend.mapper;

import com.poc.backend.dto.user.UserDto;
import com.poc.backend.entity.Role;
import com.poc.backend.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMapper {
    @Autowired
    private ModelMapper modelMapper;
    public UserDto toDto(User user){
        UserDto userDto = modelMapper.map(user,UserDto.class);
        userDto.setRole(user.getRole().getName());
        return userDto;
    }
    public User toEntity(UserDto userDto, Role role ){
        User user = modelMapper.map(userDto,User.class);
        user.setRole();
    }
}
