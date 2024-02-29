package com.educandoweb.curso.resources;


import com.educandoweb.curso.entities.Payment;
import com.educandoweb.curso.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

    @Autowired
    private PaymentService paymentservice;

    @GetMapping
    public ResponseEntity<List<Payment>> findAll() {
        List<Payment> list = paymentservice.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Payment> findById(@PathVariable Long id) {
        Payment obj = paymentservice.findById(id);
        return ResponseEntity.ok().body(obj);
    }








}
