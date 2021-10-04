package com.springframework.Dependencyinjection.controller;

import com.springframework.Dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ContrurctorInjectedController {
private final GreetingService greetingService;

public ContrurctorInjectedController(GreetingService greetingService)
{
    this.greetingService=greetingService;
}
public String getGreeting(){
    return greetingService.sayGreeting();
}
}
