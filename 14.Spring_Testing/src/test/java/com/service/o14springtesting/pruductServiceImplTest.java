package com.service.o14springtesting;

import com.service.o14springtesting.Entity.Product;
import com.service.o14springtesting.Repo.ProductRepository;
import com.service.o14springtesting.Service.Impl.ProductServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class pruductServiceImplTest {
    @InjectMocks
    private ProductServiceImpl productService;
    @Mock
    private ProductRepository productRepository;
    private Product product;


    @BeforeEach
    public void setUp(){
        product = Product.builder()
                .id(1L)
                .name("Test Product")
                .price(10.11)
                .quantity(12).build();
    }

    @Test
    void shouldSaveProduct(){
        //arrange
        when(productRepository.save(any(Product.class))).thenReturn(product);
        //action
        Product savedProduct = productService.createProduct(product);
        //asset
        Assertions.assertNotNull(savedProduct);
        Assertions.assertEquals(product , savedProduct);
        verify(productRepository, times(1))
                .save(any(Product.class));
    }

    @Test
        void shouldUpdateProduct() {

            Product product = Product.builder()
                    .id(1L)
                    .name("Updated Product")
                    .price(150.0)
                    .quantity(200)
                    .build();

            //01. dat arrange
            when(productRepository.findById(1L)).thenReturn(Optional.of(product));
            when(productRepository.save(any(Product.class))).thenReturn(product);

            //02. action
            Product updatedProduct = productService.updateProduct(product);

            //03. assert
            Assertions.assertNotNull(updatedProduct);
            Assertions.assertEquals(product.getId(), updatedProduct.getId());
            Assertions.assertEquals("Updated Product", updatedProduct.getName());
            Assertions.assertEquals(150.0, updatedProduct.getPrice());
            Assertions.assertEquals(200, updatedProduct.getQuantity());

            verify(productRepository, times(1)).save(any(Product.class));

        }
    }

