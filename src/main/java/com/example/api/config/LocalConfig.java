package com.example.api.config;

import com.example.api.domain.User;
import com.example.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {
    @Autowired
    private UserRepository repository;
    @Bean
    public void startDB(){
        User u1 = new User(null, "Carlos", "carlos@gmail.com", "123456");
        User u2 = new User(null, "Marli", "marli@gmail.com", "123456");

        repository.saveAll(List.of(u1, u2));
    }
}
