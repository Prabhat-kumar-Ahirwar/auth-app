package com.prabhat.auth_app.services;

import com.prabhat.auth_app.dtos.UserDto;


public interface AuthService {
     UserDto registerUser(UserDto userDto);

}