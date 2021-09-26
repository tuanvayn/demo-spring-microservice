package me.tuanva.demo.service;

import me.tuanva.demo.dto.CreateUserRequestDto;
import me.tuanva.demo.dto.GetAllUserResponseDto;
import me.tuanva.demo.dto.UpdateUserRequestDto;
import me.tuanva.demo.dto.UserResponseDto;

public interface UserService {
  UserResponseDto createUser(CreateUserRequestDto createUserRequestDto);

  UserResponseDto updateUser(UpdateUserRequestDto updateUserRequestDto);

  String deleteUser(String id);

  UserResponseDto getUser(String id);

  GetAllUserResponseDto getUsers();
}
