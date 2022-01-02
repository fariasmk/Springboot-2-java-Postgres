package com.maikon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maikon.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
