package com.springframework.Dependencyinjection.controller;

import com.springframework.Dependencyinjection.services.ConstructorGreatingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContrurctorInjectedControllerTest {
ContrurctorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller= new ContrurctorInjectedController(new ConstructorGreatingService());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}