package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableModel;

import modelo.Equipo;
import vista.VEquipo;

public class CETable implements MouseListener {
    private VEquipo vista;
    private Equipo EquipoA;
    private Equipo EquipoB;
    private VEquipo tabla;

    public CETable(VEquipo vista, Equipo EquipoA, Equipo EquipoB, VEquipo tabla) {
        this.EquipoA = EquipoA;
        this.EquipoB = EquipoB;
        this.vista = vista;
        this.tabla = tabla;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void mouseClicked(MouseEvent e) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModelotabla();
        Object valor = tabla.getTabla().getValueAt(tabla.getTabla().getSelectedRow(),
                tabla.getTabla().getSelectedColumn());
        if (EquipoA.getEquipo().contains(valor)) {
            vista.getListas().get(0).addItem(valor.toString());
        } else if (EquipoB.getEquipo().contains(valor)) {
            vista.getListas().get(1).addItem(valor.toString());
        }
        modelo.removeRow(tabla.getTabla().getSelectedRow());
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
