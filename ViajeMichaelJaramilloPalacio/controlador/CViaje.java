package controlador;

import vista.VViaje;

import java.util.ArrayList;

import modelo.MViaje;
import modelo.Viaje;

public class CViaje {
    private VViaje vista;
    private MViaje modelo;
    private ArrayList<Viaje> categorias = new ArrayList<Viaje>();

    public CViaje() {
        this.modelo = new MViaje();
        categorias.add(
                new Viaje(modelo.getCategorias().get(0), modelo.getTransporte(), modelo.getTransportedinero()));
        categorias.add(
                new Viaje(modelo.getCategorias().get(1), modelo.getHotel(), modelo.getHoteldinero()));
        categorias.add(
                new Viaje(modelo.getCategorias().get(2), modelo.getOcio(), modelo.getOciodinero()));
        categorias.add(
                new Viaje(modelo.getCategorias().get(3), modelo.getComida(), modelo.getComidadinero()));
        this.vista = new VViaje(categorias);

        vista.mostrar();
        asignarEventos();
    }

    private void asignarEventos() {
        for (int i = 0; i < vista.getPaneles().size(); i++) {
            vista.getPaneles().get(i).getPersonas().addKeyListener(new CEJtext(vista));
            for (int j = 0; j < vista.getPaneles().get(i).getRadioButtons().size(); j++) {
                vista.getPaneles().get(i).getRadioButtons().get(j).addActionListener(new CEJround(vista));
            }
        }

    }
}
