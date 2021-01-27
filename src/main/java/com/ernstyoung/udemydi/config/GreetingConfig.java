package com.ernstyoung.udemydi.config;

import com.ernstyoung.udemydi.services.GreetingRepository;
import com.ernstyoung.udemydi.services.GreetingService;
import com.ernstyoung.udemydi.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
        System.out.println("Setting up factory class");
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    GreetingService englishGreeting(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("en");

    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService spanishGreeting(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("es");

    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService germanGreeting(GreetingServiceFactory greetingServiceFactory) {
        System.out.println("Inside germanGreeting config");
        return greetingServiceFactory.createGreetingService("de");
    }

}
