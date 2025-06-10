package com.example.topup.service;

import com.example.topup.model.Product;
import com.example.topup.model.Product.GameCategory;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(GameCategory category);
    Product saveProduct(Product product);
    void deleteProductById(Long id);
}
