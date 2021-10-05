package com.springframework.Dependencyinjection.controller;

import com.springframework.Dependencyinjection.services.ConstructorGreatingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreatingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}