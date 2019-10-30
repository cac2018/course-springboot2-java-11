package com.cristianaugusto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianaugusto.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
