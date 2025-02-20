
package bingo;

import java.util.ArrayList;
/**
 * Fecha: 26-nov-2024
 * Autor: Michael Jaramillo Palacio
 */
public class Tarjeta {
    private int nTarjeta;
    private ArrayList<Lineas> li=new ArrayList<>();
    private ArrayList<Integer> numerosusados=new ArrayList<>();

    public Tarjeta(int nTarjeta) {
        this.nTarjeta = nTarjeta;
        this.li=generartarjetas(numerosusados);
    }

    public int getnTarjeta() {
        return nTarjeta;
    }

    public void setnTarjeta(int nTarjeta) {
        this.nTarjeta = nTarjeta;
    }

    public ArrayList<Lineas> getLineas() {
        return li;
    }

    public void setLineas(ArrayList<Lineas> lineas) {
        this.li = lineas;
    }

    private ArrayList<Lineas> generartarjetas(ArrayList<Integer> numerosusados) {
        ArrayList<Lineas> listaLineas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listaLineas.add(new Lineas(numerosusados));
        }
        return listaLineas;
    }
    
    
}
