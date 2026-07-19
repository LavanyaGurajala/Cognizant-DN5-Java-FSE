package com.ormlearn;

import com.ormlearn.entity.Country;
import com.ormlearn.service.CountryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BootstrapData {
    @Bean
    CommandLineRunner init(CountryService countryService) {
        return args -> {
            if (countryService.findAll().isEmpty()) {
                Country country = new Country();
                country.setName("India");
                country.setCode("IN");
                countryService.save(country);
            }
        };
    }
}
