package com.example.product.service;



import com.example.product.entity.Product;
import com.example.product.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Product> getAllUser() {
        return userRepository.findAll();
    }
}
