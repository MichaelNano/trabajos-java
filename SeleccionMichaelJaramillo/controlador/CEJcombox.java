package controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import vista.VEquipo;

public class CEJcombox implements ItemListener {
    private VEquipo tabla;

    public CEJcombox(VEquipo tabla) {
        this.tabla = tabla;

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            tabla.getModelotabla().addRow(new Object[] { e.getItem() });

            @SuppressWarnings("unchecked")
            JComboBox<String> comboBox = (JComboBox<String>) e.getItemSelectable();
            comboBox.setSelectedItem(null);
            comboBox.removeItem(e.getItem());
        }
    }

}
