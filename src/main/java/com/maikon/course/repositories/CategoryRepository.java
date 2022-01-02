package com.maikon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maikon.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
