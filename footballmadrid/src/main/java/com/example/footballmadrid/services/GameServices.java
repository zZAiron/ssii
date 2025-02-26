package com.example.footballmadrid.services;

import com.example.footballmadrid.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServices {
    @Autowired
    GameRepository gameRepository;



}
