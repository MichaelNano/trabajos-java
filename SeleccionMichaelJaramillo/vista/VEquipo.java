package vista;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.GridLayout;
import java.awt.BorderLayout;

import modelo.Equipo;
import modelo.MEquipo;

public class VEquipo extends JFrame {
    // Jcombox
    @SuppressWarnings("rawtypes")
    private ArrayList<JComboBox> listas = new ArrayList<>();

    // Modelo
    private MEquipo modelo;
    private Equipo equipoA;
    private Equipo equipoB;

    // JTable
    private DefaultTableModel modelotabla;
    private JTable tabla;

    public VEquipo(Equipo EquipoA, Equipo EquipoB) {
        this.equipoA = EquipoA;
        this.equipoB = EquipoB;

        propiedades();
        añadirJCombox();
    }

    public VEquipo(MEquipo modelo) {
        this.modelo = modelo;
        creartabla();

    }

    private void creartabla() {
        setTitle("Jugadores Seleccionados");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        modelotabla = new DefaultTableModel(null, modelo.getEncabezadotabla().toArray());
        tabla = new JTable(modelotabla);
        JScrollPane scrollPane = new JScrollPane(tabla);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void añadirJCombox() {
        listas.add(new JComboBox<>(equipoA.getEquipo().toArray()));
        listas.add(new JComboBox<>(equipoB.getEquipo().toArray()));
        for (int i = 0; i < listas.size(); i++) {
            add(listas.get(i));
        }
    }

    private void propiedades() {
        setTitle("Seleccion Equipos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 100);
        setLayout(new GridLayout(1, 2));
    }

    public void mostrar() {
        setVisible(true);
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public DefaultTableModel getModelotabla() {
        return modelotabla;
    }

    public void setModelotabla(DefaultTableModel modelotabla) {
        this.modelotabla = modelotabla;
    }

    @SuppressWarnings("rawtypes")
    public ArrayList<JComboBox> getListas() {
        return listas;
    }

    @SuppressWarnings("rawtypes")
    public void setListas(ArrayList<JComboBox> listas) {
        this.listas = listas;
    }

}
