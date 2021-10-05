package com.springframework.Dependencyinjection.controller;

import com.springframework.Dependencyinjection.services.ConstructorGreatingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreatingService());    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}