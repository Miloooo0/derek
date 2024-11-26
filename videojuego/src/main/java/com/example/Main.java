package com.example;

public class Main {
    public static void main(String[] args) {
        Videojuego videojuego = new Videojuego("GTA V", 100);
        Videojuego videojuego2 = new Videojuego("GTA VI", 120);
        Videojuego videojuego3 = new Videojuego("GTA VII", 120);


        Almacen almacen = new Almacen(10);
        almacen.insertar(videojuego);
        almacen.insertar(videojuego2);
        almacen.insertar(videojuego3);

        System.out.println(almacen.buscaVideojuegos(5));
    }
}