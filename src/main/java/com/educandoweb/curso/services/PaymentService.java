package com.educandoweb.curso.services;

import com.educandoweb.curso.entities.Payment;
import com.educandoweb.curso.entities.Product;
import com.educandoweb.curso.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> findAll() {
        return paymentRepository.findAll();

    }

    public Payment findById(Long id) {
        Optional<Payment> obj = paymentRepository.findById(id);
        return obj.get();
    }





}
