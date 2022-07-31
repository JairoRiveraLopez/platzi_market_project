package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory (Long categoryId);
    Optional<List<Product>> getScarseProducto(Integer quantity);
    Optional<Product> getProduct (Long productId);
    Product saveProduct (Product product);
    void deleteProduct (Long productId);
}
