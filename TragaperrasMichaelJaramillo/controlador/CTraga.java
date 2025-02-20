package controlador;

/*
  Michael Jaramillo Palacio
  29/01/2025
*/
import modelo.MTraga;
import vista.VTraga;

public class CTraga {
    private MTraga modelo;
    private VTraga vista;

    public CTraga() {
        this.modelo = new MTraga();
        this.vista = new VTraga(modelo);
        vista.crearpanelylabels();
        vista.crearBotonEIntentos();
        asignareventos();
        vista.mostrar();
    }

    private void asignareventos() {
        for (int i = 0; i < vista.getLabels().size(); i++) {
            vista.getLabels().get(i).addMouseListener(new CEClicks(modelo, i, vista));
        }
        vista.getBoton().addActionListener(new CEBoton(modelo, vista));
    }
}
