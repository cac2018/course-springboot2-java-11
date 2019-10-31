package com.cristianaugusto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianaugusto.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
