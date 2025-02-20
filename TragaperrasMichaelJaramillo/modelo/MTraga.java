package modelo;

/*
  Michael Jaramillo Palacio
  29/01/2025
*/
import java.util.ArrayList;

public class MTraga {
    // Int
    private int intentos = 0;
    private int casillas = 5;
    private int numerotope = 5;
    private int numerominimo = 1;
    private int numerolabel = 0;
    private int turnosbloqueado = 2;
    private int turnospasados = 0;
    private int valorcero = 0;

    private ArrayList<Integer> vueltasBloqueo = new ArrayList<Integer>();

    // String
    private String textolabel = "Intentos: ";
    private String textoboton = "Cambiar Números";
    private String ganar = "Has ganado en: ";
    private String Intentosganar = " intentos";

    // Boolean
    private ArrayList<Boolean> bloqueados = new ArrayList<Boolean>();

    public MTraga() {
        generararrays();
    }

    private void generararrays() {
        for (int i = 0; i < casillas; i++) {
            bloqueados.add(false);
            vueltasBloqueo.add(0);
        }
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getCasillas() {
        return casillas;
    }

    public void setCasillas(int casillas) {
        this.casillas = casillas;
    }

    public int getNumerotope() {
        return numerotope;
    }

    public void setNumerotope(int numerotope) {
        this.numerotope = numerotope;
    }

    public ArrayList<Integer> getVueltasBloqueo() {
        return vueltasBloqueo;
    }

    public void setVueltasBloqueo(ArrayList<Integer> vueltasBloqueo) {
        this.vueltasBloqueo = vueltasBloqueo;
    }

    public String getTextolabel() {
        return textolabel;
    }

    public void setTextolabel(String textolabel) {
        this.textolabel = textolabel;
    }

    public ArrayList<Boolean> getBloqueados() {
        return bloqueados;
    }

    public void setBloqueados(ArrayList<Boolean> bloqueados) {
        this.bloqueados = bloqueados;
    }

    public String getTextoboton() {
        return textoboton;
    }

    public void setTextoboton(String textoboton) {
        this.textoboton = textoboton;
    }

    public int getNumerolabel() {
        return numerolabel;
    }

    public void setNumerolabel(int numerolabel) {
        this.numerolabel = numerolabel;
    }

    public int getTurnosbloqueado() {
        return turnosbloqueado;
    }

    public void setTurnosbloqueado(int turnosbloqueado) {
        this.turnosbloqueado = turnosbloqueado;
    }

    public int getTurnospasados() {
        return turnospasados;
    }

    public void setTurnospasados(int turnospasados) {
        this.turnospasados = turnospasados;
    }

    public int getValorcero() {
        return valorcero;
    }

    public void setValorcero(int valorcero) {
        this.valorcero = valorcero;
    }

    public String getGanar() {
        return ganar;
    }

    public void setGanar(String ganar) {
        this.ganar = ganar;
    }

    public String getIntentosganar() {
        return Intentosganar;
    }

    public void setIntentosganar(String intentosganar) {
        Intentosganar = intentosganar;
    }

    public int getNumerominimo() {
        return numerominimo;
    }

    public void setNumerominimo(int numerominimo) {
        this.numerominimo = numerominimo;
    }

}