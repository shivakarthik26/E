package com.ecommerce_app.demo.Service;

import com.ecommerce_app.demo.Repository.ProductRepository;
import com.ecommerce_app.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }
    public List<Product> getProductByName(String name) {
        return productRepository.findByNameContainingIgnoreCase(name);
    }
    public Product saveproduct(Product product)
    {
        return productRepository.save(product);
    }

    public void deleteAllProducts()
    {
        productRepository.deleteAll();
    }
    public void SayHello()
    {
        System.out.println("hello all");
    }
}
