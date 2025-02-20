package vista;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo.Viaje;

public class VViaje extends JFrame {

    private ArrayList<Viaje> categorias = new ArrayList<>();
    private JLabel Lprecio, preciototal;
    private JPanel panelcategorias, panelprecios;
    private ArrayList<VPanel> paneles = new ArrayList<>();

    public VViaje(ArrayList<Viaje> categorias) {
        this.categorias = categorias;

        propiedades();
        crearpanelesvista();
    }

    private void crearpanelesvista() {
        panelcategorias = new JPanel();
        panelcategorias.setLayout(new GridLayout(1, categorias.size()));
        panelprecios = new JPanel();
        panelprecios.setLayout(new GridLayout(1, 2));

        // Se almacenan los paneles creados
        for (int i = 0; i < categorias.size(); i++) {
            paneles.add(new VPanel(categorias.get(i)));
            panelcategorias.add(paneles.get(i));

        }
        add(panelcategorias);

        // Se almacena el precio
        Lprecio = new JLabel("Precio Total:  ", JLabel.RIGHT);
        preciototal = new JLabel("0", JLabel.LEFT);
        panelprecios.add(Lprecio);
        panelprecios.add(preciototal);
        add(panelprecios);

    }

    private void propiedades() {
        setTitle("Seleccion Equipos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setLayout(new GridLayout(2, 1));
    }

    public void mostrar() {
        setVisible(true);
    }

    // Getter para obtener los paneles
    public ArrayList<VPanel> getPaneles() {
        return paneles;
    }

    // Getter para obtener un panel específico
    public VPanel getPanel(int index) {
        if (index >= 0 && index < paneles.size()) {
            return paneles.get(index);
        }
        return null;
    }

    // Otros getters y setters
    public ArrayList<Viaje> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Viaje> categorias) {
        this.categorias = categorias;
    }

    public JLabel getLprecio() {
        return Lprecio;
    }

    public void setLprecio(JLabel lprecio) {
        Lprecio = lprecio;
    }

    public JLabel getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(JLabel preciototal) {
        this.preciototal = preciototal;
    }
}
