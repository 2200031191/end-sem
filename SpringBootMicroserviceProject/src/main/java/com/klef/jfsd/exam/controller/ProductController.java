package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.service.APIService;
import com.klef.jfsd.exam.model.Product;  // Ensure you import the Product class

@RestController
@RequestMapping("api")
public class ProductController {
    
    @Autowired
    private APIService service;
    
    @GetMapping("/")
    public String home() {
        return "<h3>API Demo</h3>";
    }
    
    @GetMapping("/viewall")
    public List<Product> viewAllProducts() {
        return service.viewAllProducts();  
    }
}
