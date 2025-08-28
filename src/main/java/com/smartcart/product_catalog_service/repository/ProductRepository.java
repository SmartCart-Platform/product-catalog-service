package com.smartcart.product_catalog_service.repository;

import com.smartcart.product_catalog_service.model.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}