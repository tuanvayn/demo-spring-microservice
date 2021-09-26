package me.tuanva.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.tuanva.demo.dto.CreateUserRequestDto;
import me.tuanva.demo.dto.GetAllUserResponseDto;
import me.tuanva.demo.dto.UpdateUserRequestDto;
import me.tuanva.demo.dto.UserResponseDto;
import me.tuanva.demo.exception.NotFoundException;
import me.tuanva.demo.model.User;
import me.tuanva.demo.repository.UserRepository;
import me.tuanva.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Autowired UserRepository userRepository;

  @Override
  public UserResponseDto createUser(CreateUserRequestDto createUserRequestDto) {
    User user = new User(createUserRequestDto.getUsername(), createUserRequestDto.getGender());
    user = userRepository.save(user);
    return new UserResponseDto(user.getId(), user.getUsername(), user.getGender());
  }

  @Override
  public UserResponseDto updateUser(UpdateUserRequestDto updateUserRequestDto) {
    User user =
        userRepository
            .findById(updateUserRequestDto.getId())
            .orElseThrow(() -> new NotFoundException(updateUserRequestDto.getId()));
    user.setUsername(updateUserRequestDto.getUsername());
    user.setGender(updateUserRequestDto.getGender());
    user = userRepository.save(user);
    return new UserResponseDto(user.getId(), user.getUsername(), user.getGender());
  }

  @Override
  public String deleteUser(String id) {
    User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    userRepository.delete(user);
    return id;
  }

  @Override
  public UserResponseDto getUser(String id) {
    User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    return new UserResponseDto(user.getId(), user.getUsername(), user.getGender());
  }

  @Override
  public GetAllUserResponseDto getUsers() {
    return new GetAllUserResponseDto(userRepository.findAll());
  }
}
