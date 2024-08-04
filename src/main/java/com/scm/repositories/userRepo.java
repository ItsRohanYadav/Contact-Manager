package com.scm.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.scm.entities.user;

public interface userRepo extends JpaRepository<user, String>{
    
}