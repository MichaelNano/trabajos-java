package bingo;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Fecha: 25-nov-2024
 * Autor: Michael Jaramillo Palacio
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Tarjeta> Tarje=new ArrayList<>();
        generartarjetas(Tarje);
        imprimirTarjetas(Tarje);
    }

    private static void generartarjetas(ArrayList<Tarjeta> Tarje) {
        Scanner teclado=new Scanner(System.in);
        int numeroT=2;
       // System.out.println("Cuantas tarjetas quieres imprimir:");
       // numeroT=teclado.nextInt();
        for (int i = 1; i <= numeroT; i++) {
            Tarjeta tarjeta=new Tarjeta(i); 
            Tarje.add(tarjeta);
        }
    }

    private static void imprimirTarjetas(ArrayList<Tarjeta> Tarje) {
            for (Tarjeta tarjeta :Tarje) {
                System.out.println("Tarjeta "+tarjeta.getnTarjeta()+": ");
                int lineanum=1;
                for (Lineas linea: tarjeta.getLineas()) {
                    System.out.println("  Línea " + lineanum + ": " + linea.getLineas());
                    lineanum++;
                }
                System.out.println("");
            }
        }   
}
