package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import vista.VViaje;

public class CEJtext implements KeyListener {
    private VViaje vista;

    public CEJtext(VViaje vista) {
        this.vista = vista;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!Character.isDigit(c)) {
            e.consume();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int preciototal;
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

    @Override
    public void keyPressed(KeyEvent e) {
    }

}
