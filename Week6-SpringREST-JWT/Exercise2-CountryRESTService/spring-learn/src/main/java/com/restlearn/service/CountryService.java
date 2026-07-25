package com.restlearn.service;

import com.restlearn.entity.Country;

import java.util.List;

public class CountryService {

    private List<Country> countries;

    public List<Country> getCountry() {
        return countries;
    }

    public Country getCountry(String code) {
        return countries.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
