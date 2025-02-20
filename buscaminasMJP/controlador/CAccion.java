package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import modelo.MMinas;
import vista.VMinas;

public class CAccion implements ActionListener {
    private MMinas modelo;
    private VMinas vista;

    public CAccion(MMinas modelo, VMinas vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = new JButton();
        boton = (JButton) e.getSource();
        if (modelo.getBomb().contains(Integer.parseInt(boton.getText()))) {
            modelo.setBombaAcertada(modelo.getBombaAcertada() + 1);
            boton.setBackground(Color.GREEN);
        } else {
            modelo.setBombaAcertada(modelo.getBombaFallada() + 1);
            boton.setBackground(Color.RED);
        }

        boton.setEnabled(false);

    }

}
