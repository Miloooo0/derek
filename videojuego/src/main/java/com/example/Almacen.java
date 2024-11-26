package com.example;

public class Almacen {
    private int cantidad;
    private Videojuego[] videojuegos;

    public Almacen(int cantidad) {
        this.cantidad = cantidad;
        this.videojuegos = new Videojuego[cantidad];
    }

    public String toString() {
        String resultado = "";
        boolean hayViedojuego = false;

        for (int i = 0; i < cantidad; i++) {
            if(videojuegos[i] != null) {
                hayViedojuego = true;
                break;
            }
        }
        if(!hayViedojuego) {
            return "No hay videojuegos en el almacen";
        }

        for (int i = 0; i < cantidad; i++) {
            if(videojuegos[i] == null) {
                resultado += "(" + i + ") \n";
            }
            else{
                resultado += "(" + i + ") " + videojuegos[i].toString() + "\n";
            }
        }
        return resultado;
    }

    public boolean insertar(Videojuego videojuego) {
        for (int i = 0; i < cantidad; i++) {
            if(videojuegos[i] == null) {
                videojuegos[i] = videojuego;
                return true;
            }
        }
        return false;
    }

    public Videojuego obtener(int codigo) {
        for (int i = 0; i < cantidad; i++) {
            if(videojuegos[i] != null && videojuegos[i].getCodigo() == codigo) {
                return videojuegos[i];
            }
        }
        return null;
    }

    public boolean eliminar(int posicion) {
        if(posicion < 0 || posicion >= cantidad || videojuegos[posicion] == null) {
            return false;
        }
        videojuegos[posicion] = null;

        for (int i = posicion; i < cantidad; i++) {
            if(videojuegos[i] != null) {
                videojuegos[i-1] = videojuegos[i];
                videojuegos[i] = null;
            }
        }
        return true;
    }

    public int modificarCantidad(double precio) {
        int contadorVideojuegos = 0;
        for (Videojuego videojuego : videojuegos) {
            if(videojuego.getPrecio() < precio) {
                videojuego.setCantidad(videojuego.getCantidad() + 1);
                contadorVideojuegos++;
            }
        }
        return contadorVideojuegos;
    }

    public String buscaVideojuegos(int cantidad){
        String resultado = "";
        for (Videojuego videojuego : videojuegos) {
            if (videojuego != null && videojuego.getCantidad() == cantidad) {
                resultado += videojuego.toString() + "\n";
            }
        }
        return resultado;
    }
}

