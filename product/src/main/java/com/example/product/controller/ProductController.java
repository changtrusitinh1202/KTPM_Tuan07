package com.example.product.controller;



import com.example.product.entity.Product;
import com.example.product.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    @Autowired
    UserService userService;

    @GetMapping("/product")
    public List<Product> getUser() {
        return userService.getAllUser();
    }
}
