package com.scm.services.impl;

import java.util.List;
import java.util.Optional;

import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.entities.user;
import com.scm.repositories.userRepo;
import com.scm.services.userService;

import jakarta.validation.constraints.Null;

@Service
public class userServiceImpl implements userService 
{
    @Autowired
    private userRepo userRepo;

    @Override
    public user saveUser(user user) {
        return userRepo.save(user);
    }

    @Override
    public Optional<user> getUserById(String id) {
        return userRepo.findById(id);
    }

    @Override
    public Optional<user> updateUser(user user) {
        userRepo.findById(user.getUserId()).orElseThrow(()->new ResourceNotFoundException("User not found"));
    }

    @Override
    public void deleteUser(user user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public boolean isUserExist(String userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isUserExist'");
    }

    @Override
    public boolean isUserExistByEmail(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isUserExistByEmail'");
    }

    @Override
    public List<user> getAllUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllUsers'");
    }
    
}
