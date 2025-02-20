package vista;

import java.util.ArrayList;
import javax.swing.*;
import modelo.MMinas;
import java.awt.*;

public class VMinas extends JFrame {
    ArrayList<JButton> botones;
    MMinas modelo = new MMinas();

    public VMinas() {
        botones = new ArrayList<JButton>();

        this.setTitle(modelo.getTitulo());
        propiedadesventana();
    }

    private void propiedadesventana() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setSize(500, 500);
    }

    public void hacerVisible() {
        this.setVisible(true);
    }

    public void crearbotones(int nminas) {
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER));

        for (int i = 1; i <= nminas; i++) {
            // Se les asigna la etiqueta con su numero
            JButton boton = new JButton(Integer.toString(i));
            boton.setPreferredSize(new Dimension(100, 50));
            this.botones.add(boton);
            panelBotones.add(boton);
        }
        this.add(panelBotones);
    }

    public ArrayList<JButton> getBotones() {
        return botones;
    }

    public void setBotones(ArrayList<JButton> botones) {
        this.botones = botones;
    }

}
