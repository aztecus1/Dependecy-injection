package com.springframework.Dependencyinjection.controller;

import com.springframework.Dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContrurctorInjectedControllerTest {
ContrurctorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller= new ContrurctorInjectedController(new GreetingServiceImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}