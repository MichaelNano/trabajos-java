package controlador;

import java.util.ArrayList;

import modelo.*;
import vista.VEquipo;

public class CEquipo {
    private MEquipo modelo;
    private ArrayList<VEquipo> vista = new ArrayList<VEquipo>();
    private ArrayList<Equipo> Equipos = new ArrayList<Equipo>();

    public CEquipo() {
        modelo = new MEquipo();
        Equipos.add(new Equipo(modelo.getPlantillaEquipoA()));
        Equipos.add(new Equipo(modelo.getPlantillaEquipoB()));
        vista.add(new VEquipo(Equipos.get(0), Equipos.get(1)));
        vista.add(new VEquipo(modelo));
        for (int i = 0; i < vista.size(); i++) {
            vista.get(i).mostrar();
        }
        asignareventos();
    }

    private void asignareventos() {
        for (int i = 0; i < vista.get(0).getListas().size(); i++) {
            vista.get(0).getListas().get(i).addItemListener(new CEJcombox(vista.get(1)));
        }
        vista.get(1).getTabla()
                .addMouseListener(new CETable(vista.get(0), Equipos.get(0), Equipos.get(1), vista.get(1)));
    }
}
