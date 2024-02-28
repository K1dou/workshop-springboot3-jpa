package com.educandoweb.curso.services;

import com.educandoweb.curso.entities.Product;
import com.educandoweb.curso.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> findAll() {
        return productRepository.findAll();

    }

    public Product findById(Integer id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }


}
