package modelo;

import java.util.ArrayList;

public class MMinas {
    // ARRAY PARA TEXTOS
    private String textominas;
    private String titulo;

    // VARIABLES NUMERICAS
    private int numminas;
    private ArrayList<Integer> bomb;
    private int bombaAcertada;
    private int bombaFallada;

    public MMinas() {
        textominas = "¿Cuántas minas quieres?";
        titulo = "Buscaminas";
        bomb = new ArrayList<Integer>();

    }

    public int getBombaAcertada() {
        return bombaAcertada;
    }

    public void setBombaAcertada(int bombaAcertada) {
        this.bombaAcertada = bombaAcertada;
    }

    public int getBombaFallada() {
        return bombaFallada;
    }

    public void setBombaFallada(int bombaFallada) {
        this.bombaFallada = bombaFallada;
    }

    public void añadirBombas(int bomba) {
        bomb.add(bomba);
    }

    public String getTextominas() {
        return textominas;
    }

    public void setTextominas(String textominas) {
        this.textominas = textominas;
    }

    public int getNumminas() {
        return numminas;
    }

    public void setNumminas(int numminas) {
        this.numminas = numminas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Integer> getBomb() {
        return bomb;
    }

    public void setBomb(ArrayList<Integer> bomb) {
        this.bomb = bomb;
    }

}
