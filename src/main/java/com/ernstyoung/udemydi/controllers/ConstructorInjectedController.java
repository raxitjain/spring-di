package com.ernstyoung.udemydi.controllers;

import com.ernstyoung.udemydi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService constructorGreetingService) {
        this.greetingService = constructorGreetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
