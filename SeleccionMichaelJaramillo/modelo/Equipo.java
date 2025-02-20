package modelo;

import java.util.ArrayList;

public class Equipo {
    private ArrayList<String> equipo = new ArrayList<String>();

    public Equipo(ArrayList<String> plantilla) {
        this.equipo = plantilla;
    }

    public ArrayList<String> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<String> equipo) {
        this.equipo = equipo;
    }

}
