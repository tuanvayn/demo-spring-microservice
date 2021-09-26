package me.tuanva.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.tuanva.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {}
