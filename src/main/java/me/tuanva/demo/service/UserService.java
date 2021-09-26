package me.tuanva.demo.service;

import me.tuanva.demo.dto.CreateUserRequestDto;
import me.tuanva.demo.dto.GetAllUserResponseDto;
import me.tuanva.demo.dto.UpdateUserRequestDto;
import me.tuanva.demo.dto.UserResponseDto;

/** Interface of UserService. */
public interface UserService {

  /**
   * Creates the user.
   *
   * @param createUserRequestDto the create user request dto
   * @return the user response dto
   */
  UserResponseDto createUser(CreateUserRequestDto createUserRequestDto);

  /**
   * Update the user.
   *
   * @param updateUserRequestDto the update user request dto
   * @return the user response dto
   */
  UserResponseDto updateUser(UpdateUserRequestDto updateUserRequestDto);

  /**
   * Delete the user.
   *
   * @param id the user's id
   * @return the user response dto
   */
  UserResponseDto deleteUser(String id);

  /**
   * Get informations of user.
   *
   * @param id the id
   * @return gia tri cua bien user
   */
  UserResponseDto getUser(String id);

  /**
   * Get informations of users.
   *
   * @return gia tri cua bien users
   */
  GetAllUserResponseDto getUsers();
}
