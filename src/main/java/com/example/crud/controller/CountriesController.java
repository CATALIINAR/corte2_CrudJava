package com.example.crud.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.crud.services.CountriesServices;
import com.example.crud.entities.CountriesEntity;

@RestController
@RequestMapping("/api/v1/countries")

public class CountriesController {
    private final CountriesServices countriesServices;

    @Autowired
    public CountriesController(CountriesServices countryServices) {
        this.countriesServices = countryServices;
    }

    //Método para obtener todos los productos
    @GetMapping
    public List<CountriesEntity> getCountries(){
        return countriesServices.getAllCountries();
    }

    //Método para obtener un product por id
    @GetMapping("/{id}")
    public Optional<CountriesEntity> getCountry(@PathVariable UUID id){
        return countriesServices.getCountryById(id);
    }

    //Método para crear un producto
    @PostMapping
    public String createCountry(){
        return "POST COUNTRY";
    }

    ////Método para actualizar un producto
    @PutMapping("/{id}")
    public String updateCountry(){
        return "PUT COUNTRY";
    }

    //Método para eliminar un país
    @DeleteMapping("/{id}")
    public String deleteCountry(){
        return "DELETE COUNTRY";
    }

}
