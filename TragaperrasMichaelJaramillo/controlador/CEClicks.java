package controlador;

/*
  Michael Jaramillo Palacio
  29/01/2025
*/
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import modelo.MTraga;
import vista.VTraga;

public class CEClicks extends MouseAdapter {
    private MTraga modelo;
    private int posicion;
    private VTraga vista;

    public CEClicks(MTraga modelo, int posicion, VTraga vista) {
        this.modelo = modelo;
        this.posicion = posicion;
        this.vista = vista;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 1) {
            if (modelo.getBloqueados().get(posicion)) {
                desbloquearNumero(posicion);
            } else {
                bloquearNumero();
            }
        } else if (e.getClickCount() == 2) {
            desbloqueartodosNumeros();

        }
    }

    public void desbloquearNumero(int lugar) {
        modelo.getBloqueados().set(lugar, false);
        modelo.getVueltasBloqueo().set(lugar, modelo.getTurnospasados());
        vista.getLabels().get(lugar).setBackground(Color.WHITE);
    }

    private void bloquearNumero() {
        modelo.getBloqueados().set(posicion, true);
        modelo.getVueltasBloqueo().set(posicion, modelo.getTurnosbloqueado());
        vista.getLabels().get(posicion).setBackground(Color.lightGray);
    }

    private void desbloqueartodosNumeros() {
        for (int i = 0; i < modelo.getCasillas(); i++) {
            desbloquearNumero(i);
        }
    }
}
