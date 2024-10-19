package com.example.crud.entities;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Data
@Getter
@Setter
@NoArgsConstructor


public class CountriesEntity {
    private UUID id;
    private String nombreProducto;
    private String categoria;
    private int cantidad;

    public CountriesEntity(UUID id, String nombreProducto, String categoria, int cantidad) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.cantidad = cantidad;

    }
}
