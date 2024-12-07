package com.klef.jfsd.exam.service;

import java.util.List;

import com.klef.jfsd.exam.model.Product;

public interface APIService {
    // External API - Fake Store API
    public List<Product> viewAllProducts();
}
