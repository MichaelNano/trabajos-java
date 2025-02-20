package modelo;

import java.util.ArrayList;

public class MEquipo {
    // Equipos
    private ArrayList<String> plantillaEquipoA = new ArrayList<String>();
    private ArrayList<String> plantillaEquipoB = new ArrayList<String>();

    // Tabla
    private ArrayList<String> encabezadotabla = new ArrayList<>();

    public MEquipo() {
        rellenarEquipos();
    }

    private void rellenarEquipos() {
        // EquipoA
        plantillaEquipoA.add("Manolo");
        plantillaEquipoA.add("Pedro");
        plantillaEquipoA.add("Salvador");
        plantillaEquipoA.add("Thegrefg");
        plantillaEquipoA.add("Vegeta");
        plantillaEquipoA.add("Goku");

        // EquipoB
        plantillaEquipoB.add("Francisco");
        plantillaEquipoB.add("Stanlin");
        plantillaEquipoB.add("Adolfo");
        plantillaEquipoB.add("Norte");
        plantillaEquipoB.add("Sanchez");
        plantillaEquipoB.add("Freezer");

        // Tabla
        encabezadotabla.add("Jugador");
    }

    public ArrayList<String> getPlantillaEquipoA() {
        return plantillaEquipoA;
    }

    public void setPlantillaEquipoA(ArrayList<String> plantillaEquipoA) {
        this.plantillaEquipoA = plantillaEquipoA;
    }

    public ArrayList<String> getPlantillaEquipoB() {
        return plantillaEquipoB;
    }

    public void setPlantillaEquipoB(ArrayList<String> plantillaEquipoB) {
        this.plantillaEquipoB = plantillaEquipoB;
    }

    public ArrayList<String> getEncabezadotabla() {
        return encabezadotabla;
    }

    public void setEncabezadotabla(ArrayList<String> encabezadotabla) {
        this.encabezadotabla = encabezadotabla;
    }

}
