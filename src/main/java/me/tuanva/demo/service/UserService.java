package me.tuanva.demo.service;

import java.util.List;

import me.tuanva.demo.model.User;

public interface UserService {
  User createUser(User user);

  User updateUser(User user);

  void deleteUser(User user);

  User getUser(User user);

  List<User> getUsers(User user);
}
