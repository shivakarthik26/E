package com.ecommerce_app.demo.Controller;

import com.ecommerce_app.demo.Service.ProductService;
import com.ecommerce_app.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class ProductController {

    @Autowired
    private ProductService productService;



    @GetMapping("/products")
    public List<Product> getallProducts()
    {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{name}")
    public List<Product> getProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }



    @PostMapping
    public Product CreateProduct(Product product)
    {
        return productService.saveproduct(product);

    }
    @DeleteMapping("/deleteAll")
    public void deleteAllProducts() {
        productService.deleteAllProducts();
    }

}
