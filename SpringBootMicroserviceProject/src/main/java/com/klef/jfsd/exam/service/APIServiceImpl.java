package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class APIServiceImpl implements APIService {
    
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Product> viewAllProducts() {
        Product[] products = restTemplate.getForObject("https://fakestoreapi.com/products", Product[].class);
        return Arrays.asList(products);  // Convert array to list
    }
}
