package controlador;

import vista.VMinas;

import java.util.Scanner;
import java.util.Random;
import modelo.MMinas;

public class CMinas {
    private VMinas vista;
    private MMinas modelo;
    private Random rand = new Random();

    public CMinas() {
        vista = new VMinas();
        modelo = new MMinas();

        pedirminas();
    }

    private void pedirminas() {
        System.out.println(modelo.getTextominas());
        int Nminas = new Scanner(System.in).nextInt();

        modelo.setNumminas(Nminas);
        vista.crearbotones(Nminas);
        vista.hacerVisible();
        vista.revalidate();
        crearbombas(Nminas);
        activarEventoBotones();
    }

    private void crearbombas(int valor) {
        while (modelo.getBomb().size() != valor / 5) {
            int randonumber = rand.nextInt(valor);
            while (!modelo.getBomb().contains(randonumber)) {
                modelo.añadirBombas(randonumber);
            }
            valor++;
        }
    }

    private void activarEventoBotones() {
        for (int i = 0; i < modelo.getNumminas() + 1; i++) {
            this.vista.getBotones().get(i).addActionListener(new CAccion(modelo, vista));
        }
    }
}
