package com.example.crud.services;

import com.example.crud.entities.CountriesEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service

public class CountriesServices {
    private List<CountriesEntity> productos;

    public CountriesServices(){
        productos.add(new CountriesE ntity(UUID.randomUUID(),"lapices","escolar",25));
        productos.add(new CountriesEntity(UUID.randomUUID(),"crema","aseo",12));
        productos.add(new CountriesEntity(UUID.randomUUID(), "cuadernos", "escolar", 50));
        productos.add(new CountriesEntity(UUID.randomUUID(), "jabón", "aseo", 20));
        productos.add(new CountriesEntity(UUID.randomUUID(), "bolígrafos", "oficina", 35));
        productos.add(new CountriesEntity(UUID.randomUUID(), "shampoo", "aseo", 15));

    }
    public List<CountriesEntity>  getAllCountries(){
        return productos;
    }
    public Optional<CountriesEntity> getCountryById(UUID id){
        return productos.stream().filter(country -> country.getId().equals(id)).findFirst();
    }
    public List<> createCountry(){

    }

    public List<> updateCountry(){

    }

    public List<> deleteCountry(){

    }

}
