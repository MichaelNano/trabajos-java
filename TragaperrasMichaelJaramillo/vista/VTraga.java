package vista;

/*
  Michael Jaramillo Palacio
  29/01/2025
*/
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JButton;

import modelo.MTraga;

public class VTraga extends JFrame {
    private MTraga modelo;
    private JButton boton;
    private ArrayList<JLabel> labels = new ArrayList<JLabel>();
    private JPanel panelparalabels;
    private JLabel intentosLabel;

    public VTraga(MTraga modelo) {
        propiedades();
        this.modelo = modelo;
    }

    private void propiedades() {
        setTitle("Tragaperras");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(3, 1));
    }

    public void mostrar() {
        setVisible(true);

    }

    public void crearpanelylabels() {
        panelparalabels = new JPanel();
        panelparalabels.setLayout(new GridLayout(1, modelo.getCasillas()));
        for (int index = 0; index < modelo.getCasillas(); index++) {
            labels.add(new JLabel(String.valueOf(modelo.getNumerolabel() + index), JLabel.CENTER));
            labels.get(index).setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labels.get(index).setOpaque(true);
            labels.get(index).setBackground(Color.WHITE);
            panelparalabels.add(labels.get(index));
        }
        add(panelparalabels);
    }

    public void crearBotonEIntentos() {
        boton = new JButton(modelo.getTextoboton());
        intentosLabel = new JLabel(modelo.getTextolabel() + modelo.getIntentos(), JLabel.CENTER);
        add(boton);
        add(intentosLabel);

    }

    public ArrayList<JLabel> getLabels() {
        return labels;
    }

    public void setLabels(ArrayList<JLabel> labels) {
        this.labels = labels;
    }

    public JPanel getPanelparalabels() {
        return panelparalabels;
    }

    public void setPanelparalabels(JPanel panelparalabels) {
        this.panelparalabels = panelparalabels;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public JLabel getIntentosLabel() {
        return intentosLabel;
    }

    public void setIntentosLabel(JLabel intentosLabel) {
        this.intentosLabel = intentosLabel;
    }

}
