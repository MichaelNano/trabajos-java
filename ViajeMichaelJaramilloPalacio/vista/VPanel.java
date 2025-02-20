package vista;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.util.ArrayList;
import modelo.Viaje;

public class VPanel extends JPanel {
    private JPanel PNombre, PElecciones;
    private Viaje categorias;
    private ArrayList<JRadioButton> radioButtons = new ArrayList<>();
    private ArrayList<JLabel> precios = new ArrayList<>();
    private JLabel cantidadpersonas;
    private ButtonGroup grupo = new ButtonGroup();
    private JTextField Personas;

    public VPanel(Viaje categorias) {
        this.categorias = categorias;
        setLayout(new GridLayout(2, 1));

        // Panel de nombre
        PNombre = new JPanel(new GridLayout(1, 1));
        JLabel labelCategoria = new JLabel(categorias.getCategoria(), JLabel.CENTER);
        PNombre.add(labelCategoria);

        // Panel de elecciones
        PElecciones = new JPanel();
        PElecciones.setLayout(new GridLayout(categorias.getOpciones().size() + 1, 2));

        // Crear los JRadioButton y agregarlos a la lista
        for (int i = 0; i < categorias.getOpciones().size(); i++) {
            radioButtons.add(new JRadioButton(categorias.getOpciones().get(i)));
            precios.add(new JLabel(String.valueOf(categorias.getPrecio().get(i))));
            grupo.add(radioButtons.get(i));
            PElecciones.add(radioButtons.get(i));
            PElecciones.add(precios.get(i));
        }
        cantidadpersonas = new JLabel("Personas: ", JLabel.CENTER);
        Personas = new JTextField(5);
        PElecciones.add(cantidadpersonas);
        PElecciones.add(Personas);

        // Agregar los paneles al panel
        add(PNombre);
        add(PElecciones);
    }

    public JLabel getCantidadpersonas() {
        return cantidadpersonas;
    }

    public void setCantidadpersonas(JLabel cantidadpersonas) {
        this.cantidadpersonas = cantidadpersonas;
    }

    public JTextField getPersonas() {
        return Personas;
    }

    public void setPersonas(JTextField personas) {
        Personas = personas;
    }

    public ArrayList<JRadioButton> getRadioButtons() {
        return radioButtons;
    }

    public void setRadioButtons(ArrayList<JRadioButton> radioButtons) {
        this.radioButtons = radioButtons;
    }

    public ArrayList<JLabel> getPrecios() {
        return precios;
    }

    public void setPrecios(ArrayList<JLabel> precios) {
        this.precios = precios;
    }

    // Getter para obtener un JRadioButton específico por su índice
    public JRadioButton getRadioButton(int index) {
        if (index >= 0 && index < radioButtons.size()) {
            return radioButtons.get(index);
        }
        return null;
    }

    // Otros getters y setters
    public JPanel getPNombre() {
        return PNombre;
    }

    public void setPNombre(JPanel pNombre) {
        PNombre = pNombre;
    }

    public JPanel getPElecciones() {
        return PElecciones;
    }

    public void setPElecciones(JPanel pElecciones) {
        PElecciones = pElecciones;
    }

    public Viaje getCategorias() {
        return categorias;
    }

    public void setCategorias(Viaje categorias) {
        this.categorias = categorias;
    }
}
