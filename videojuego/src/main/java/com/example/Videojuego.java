package com.example;

public class Videojuego {
    private int codigo;
    private String titulo;
    private double precio;
    private int cantidad;
    public static int codigoAutoincremental = 0;

    public Videojuego(String titulo, double precio) {
        this.codigo = codigoAutoincremental;
        this.titulo = titulo;
        this.precio = precio;
        this.cantidad = 10;
        codigoAutoincremental++;
    }

    public String toString() {
        return (String.format("[Código:%d, Título=%s, Precio=%.2f, Cantidad=%d]", codigo, titulo, precio, cantidad)); 
    }
    

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
