package com.service.o14springtesting.Service.Impl;

import com.service.o14springtesting.Entity.Product;
import com.service.o14springtesting.Repo.ProductRepository;
import com.service.o14springtesting.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("Product not found with ID "+id)
        );
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {

        Product exists = getProductById(product.getId());
        exists.setName(product.getName());
        exists.setPrice(product.getPrice());
        exists.setQuantity(product.getQuantity());

        return productRepository.save(exists);
      }

    @Override
    public void deleteProduct(Long id) {
        Product product = getProductById(id);
        productRepository.delete(product);
    }
}
