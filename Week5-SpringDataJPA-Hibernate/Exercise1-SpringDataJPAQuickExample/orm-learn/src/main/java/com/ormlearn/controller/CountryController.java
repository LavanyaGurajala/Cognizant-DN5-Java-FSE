package com.ormlearn.controller;

import com.ormlearn.entity.Country;
import com.ormlearn.service.CountryService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public List<Country> getAll() {
        return countryService.findAll();
    }

    @PostMapping
    public Country create(@RequestBody Country country) {
        return countryService.save(country);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        countryService.deleteById(id);
    }
}

