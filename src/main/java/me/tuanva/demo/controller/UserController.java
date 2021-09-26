package me.tuanva.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import me.tuanva.demo.dto.CreateUserRequestDto;
import me.tuanva.demo.dto.GetAllUserResponseDto;
import me.tuanva.demo.dto.UpdateUserRequestDto;
import me.tuanva.demo.dto.UserResponseDto;
import me.tuanva.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired UserService userService;

  @ApiOperation(value = "API for creating user")
  @PostMapping("/")
  ResponseEntity<UserResponseDto> createUser(@Valid @RequestBody CreateUserRequestDto request) {
    return ResponseEntity.ok().body(userService.createUser(request));
  }

  @ApiOperation(value = "API for updating user")
  @PutMapping("/")
  ResponseEntity<UserResponseDto> updateUser(@Valid @RequestBody UpdateUserRequestDto request) {
    return ResponseEntity.ok().body(userService.updateUser(request));
  }

  @ApiOperation(value = "API for deleting user")
  @DeleteMapping("/{id}")
  ResponseEntity<String> deleteUser(@Valid @PathVariable String id) {
    return ResponseEntity.ok().body(userService.deleteUser(id));
  }

  @ApiOperation(value = "API for getting one user")
  @GetMapping("/{id}")
  ResponseEntity<UserResponseDto> getUser(@Valid @PathVariable String id) {
    return ResponseEntity.ok().body(userService.getUser(id));
  }

  @ApiOperation(value = "API for getting all users")
  @GetMapping("/")
  ResponseEntity<GetAllUserResponseDto> getUsers() {
    return ResponseEntity.ok().body(userService.getUsers());
  }
}
