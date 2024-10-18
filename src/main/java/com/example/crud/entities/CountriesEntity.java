package com.example.crud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Data
@AllArgsConstructor
@Getter
@Setter

public class CountriesEntity {
    private UUID id;
    private String nombre_Producto;
    private String categoria;
    private int cantidad;

    private CountriesEntity(UUID id, String nombre_Producto, String categoria, int cantidad){
        this.id = id;
        this.nombre_Producto = nombre_Producto;
        this.categoria = categoria;
        this.cantidad = cantidad;

    }
    public UUID getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getNombre_Producto(){
        return nombre_Producto;
    }

    public void setNombre_Producto(){
        this.nombre_Producto;
    }

    public String getCategoriao(){
        return categoria;
    }

    public void setCategoria(){
        this.categoria;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(){
        this.cantidad;
    }
}
