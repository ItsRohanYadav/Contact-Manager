package com.scm.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scm.entities.user;

@Repository

public interface userRepo extends JpaRepository<user, String>{

    public user saveUser(user user);
    
}