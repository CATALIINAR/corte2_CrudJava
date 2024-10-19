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

    public CountriesServices() {
        productos = new ArrayList<>();
        productos.add(new CountriesEntity(UUID.randomUUID(), "lapices", "escolar", 25));
        productos.add(new CountriesEntity(UUID.randomUUID(), "crema", "aseo", 12));
        productos.add(new CountriesEntity(UUID.randomUUID(), "cuadernos", "escolar", 50));
        productos.add(new CountriesEntity(UUID.randomUUID(), "jabón", "aseo", 20));
        productos.add(new CountriesEntity(UUID.randomUUID(), "bolígrafos", "oficina", 35));
        productos.add(new CountriesEntity(UUID.randomUUID(), "shampoo", "aseo", 15));
    }

    public List<CountriesEntity> getAllCountries() {
        return productos;
    }

    public Optional<CountriesEntity> getCountryById(UUID id) {
        return productos.stream().filter(country -> country.getId().equals(id)).findFirst();
    }

    public CountriesEntity createCountry(CountriesEntity country) {
        country.setId(UUID.randomUUID());
        productos.add(country);
        return country;
    }

    public Optional<CountriesEntity> updateCountry(UUID id, CountriesEntity updatedCountry) {
        for (int i = 0; i < productos.size(); i++) {
            CountriesEntity country = productos.get(i);
            if (country.getId().equals(id)) {
                updatedCountry.setId(id); 
                productos.set(i, updatedCountry);
                return Optional.of(updatedCountry);
            }
        }
        return Optional.empty();
    }

    public boolean deleteCountry(UUID id) {
        return productos.removeIf(country -> country.getId().equals(id));
    }
}
