package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.MTraga;
import vista.VTraga;

/*
  Michael Jaramillo Palacio
  29/01/2025
*/
public class CEBoton implements ActionListener {
    private MTraga modelo;
    private VTraga vista;
    private CEClicks clicks;
    private String valorcomparar;
    private int nRandom;

    public CEBoton(MTraga modelo, VTraga vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.clicks = new CEClicks(modelo, 0, vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        modelo.setIntentos(modelo.getIntentos() + 1);

        for (int i = 0; i < vista.getLabels().size(); i++) {
            if (modelo.getBloqueados().get(i)) {
                modelo.getVueltasBloqueo().set(i, modelo.getVueltasBloqueo().get(i) - 1);
                if (modelo.getVueltasBloqueo().get(i) <= 0) {
                    clicks.desbloquearNumero(i);
                }
            } else {
                nRandom = (int) (Math.random() * (modelo.getNumerotope() - modelo.getNumerominimo() + 1))
                        + modelo.getNumerominimo();
                vista.getLabels().get(i)
                        .setText(String.valueOf(nRandom));
            }
        }
        valorcomparar = vista.getLabels().get(0).getText();
        boolean todosIguales = true;
        for (int i = 0; i < vista.getLabels().size(); i++) {
            if (!vista.getLabels().get(i).getText().equals(valorcomparar)) {
                todosIguales = false;
            }
        }

        if (todosIguales) {
            vista.getIntentosLabel().setText(modelo.getGanar() + modelo.getIntentos() + modelo.getIntentosganar());
            vista.getBoton().setEnabled(false);
        } else {
            vista.getIntentosLabel().setText(modelo.getTextolabel() + modelo.getIntentos());
        }
    }
}
