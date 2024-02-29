package com.educandoweb.curso.repositories;

import com.educandoweb.curso.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
