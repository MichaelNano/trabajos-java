package controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import vista.VViaje;

public class CEJround implements ActionListener {
    private VViaje vista;

    public CEJround(VViaje vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int preciototal;
        vista.getPreciototal().setText("0");
        preciototal = calculartotal();
        vista.getPreciototal().setText(String.valueOf(preciototal));
    }

    private int calculartotal() {
        int total = 0;

        for (int i = 0; i < vista.getPaneles().size(); i++) {
            for (int j = 0; j < vista.getPaneles().get(i).getRadioButtons().size(); j++) {
                if (vista.getPaneles().get(i).getRadioButtons().get(j).isSelected()
                        && vista.getPaneles().get(i).getPersonas().getText().length() > 0) {
                    total += Integer.parseInt(vista.getPaneles().get(i).getPrecios().get(j).getText())
                            * Integer.parseInt(vista.getPaneles().get(i).getPersonas().getText());
                }
            }
        }
        return total;
    }
}
