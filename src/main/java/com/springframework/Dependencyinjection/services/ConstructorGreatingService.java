package com.springframework.Dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreatingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
