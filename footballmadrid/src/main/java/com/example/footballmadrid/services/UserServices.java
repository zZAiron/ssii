package com.example.footballmadrid.services;

import com.example.footballmadrid.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    private UsersRepository usersRepository;




}
