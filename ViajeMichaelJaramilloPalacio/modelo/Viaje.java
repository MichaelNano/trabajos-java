package modelo;

import java.util.ArrayList;

public class Viaje {
    private String Categoria;
    private ArrayList<String> opciones;
    private ArrayList<Integer> precio;

    public Viaje(String Categoria, ArrayList<String> opciones, ArrayList<Integer> precio) {
        this.Categoria = Categoria;
        this.opciones = opciones;
        this.precio = precio;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public ArrayList<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<String> opciones) {
        this.opciones = opciones;
    }

    public ArrayList<Integer> getPrecio() {
        return precio;
    }

    public void setPrecio(ArrayList<Integer> precio) {
        this.precio = precio;
    }

}
