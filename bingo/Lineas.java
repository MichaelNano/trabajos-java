package bingo;

import java.util.ArrayList;
/**
 * Fecha: 25-nov-2024
 * Autor: Michael Jaramillo Palacio
 */
public class Lineas {
    private ArrayList<Integer> lineas=new ArrayList<>();

    public Lineas(ArrayList<Integer> numerosUsados) {
        this.lineas=generarlineas(numerosUsados);
    }

    public ArrayList<Integer> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<Integer> lineas) {
        this.lineas = lineas;
    }

    private ArrayList<Integer> generarlineas(ArrayList<Integer> numerosUsados) {        
        ArrayList<Integer> Lineanumeros=new ArrayList<>();
            while (Lineanumeros.size()<5) {                
                int numerosale = (int) Math.floor(Math.random() * (99- 1 + 1) + 1);
                if (!numerosUsados.contains(numerosale)) {
                    numerosUsados.add(numerosale);
                    Lineanumeros.add(numerosale);
                }
            }
        return Lineanumeros;
    }
    
}