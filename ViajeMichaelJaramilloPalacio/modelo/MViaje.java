package modelo;

import java.util.ArrayList;

public class MViaje {
    // Categorias
    private ArrayList<String> categorias = new ArrayList<String>();

    // transporte
    private ArrayList<String> transporte = new ArrayList<String>();
    private ArrayList<Integer> transportedinero = new ArrayList<Integer>();

    // hotel
    private ArrayList<String> hotel = new ArrayList<String>();
    private ArrayList<Integer> hoteldinero = new ArrayList<Integer>();

    // ocio
    private ArrayList<String> ocio = new ArrayList<String>();
    private ArrayList<Integer> ociodinero = new ArrayList<Integer>();

    // comida
    private ArrayList<String> comida = new ArrayList<String>();
    private ArrayList<Integer> comidadinero = new ArrayList<Integer>();

    public MViaje() {
        rellenar();
    }

    private void rellenar() {
        // categorias
        categorias.add("Transporte");
        categorias.add("Hotel");
        categorias.add("Ocio");
        categorias.add("Comida");

        // transporte
        transporte.add("Avion -");
        transporte.add("Bus -");
        transporte.add("Tren -");
        transporte.add("Propio -");
        transporte.add("Canoa -");
        transportedinero.add(800);
        transportedinero.add(100);
        transportedinero.add(150);
        transportedinero.add(50);
        transportedinero.add(10);

        // hotel
        hotel.add("Ibis -");
        hotel.add("Hilton -");
        hotel.add("Malaga Palacio -");
        hoteldinero.add(500);
        hoteldinero.add(300);
        hoteldinero.add(200);

        // comida
        comida.add("Completa -");
        comida.add("Media -");
        comida.add("Desayuno -");
        comidadinero.add(200);
        comidadinero.add(100);
        comidadinero.add(50);

        // ocio
        ocio.add("Cultural -");
        ocio.add("Fiestas -");
        ocio.add("Libro -");
        ocio.add("Churros -");
        ociodinero.add(200);
        ociodinero.add(100);
        ociodinero.add(50);
        ociodinero.add(10);
    }

    public ArrayList<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<String> categorias) {
        this.categorias = categorias;
    }

    public ArrayList<String> getTransporte() {
        return transporte;
    }

    public void setTransporte(ArrayList<String> transporte) {
        this.transporte = transporte;
    }

    public ArrayList<Integer> getTransportedinero() {
        return transportedinero;
    }

    public void setTransportedinero(ArrayList<Integer> transportedinero) {
        this.transportedinero = transportedinero;
    }

    public ArrayList<String> getHotel() {
        return hotel;
    }

    public void setHotel(ArrayList<String> hotel) {
        this.hotel = hotel;
    }

    public ArrayList<Integer> getHoteldinero() {
        return hoteldinero;
    }

    public void setHoteldinero(ArrayList<Integer> hoteldinero) {
        this.hoteldinero = hoteldinero;
    }

    public ArrayList<String> getOcio() {
        return ocio;
    }

    public void setOcio(ArrayList<String> ocio) {
        this.ocio = ocio;
    }

    public ArrayList<Integer> getOciodinero() {
        return ociodinero;
    }

    public void setOciodinero(ArrayList<Integer> ociodinero) {
        this.ociodinero = ociodinero;
    }

    public ArrayList<String> getComida() {
        return comida;
    }

    public void setComida(ArrayList<String> comida) {
        this.comida = comida;
    }

    public ArrayList<Integer> getComidadinero() {
        return comidadinero;
    }

    public void setComidadinero(ArrayList<Integer> comidadinero) {
        this.comidadinero = comidadinero;
    }

}
