package com.maikon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maikon.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
