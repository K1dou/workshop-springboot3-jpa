package com.educandoweb.curso.repositories;

import com.educandoweb.curso.entities.OrderItem;
import com.educandoweb.curso.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {
}
