package Interfaz.Modelos;

import java.util.ArrayList;
import java.util.Date;

public class Orden {
    private int numOrden;
    private Date fecha;
    private String nombreCliente;
    private int descuento;
    private double total;
    private ArrayList <PlatoFuerte> listaPlatosFuertes;
    private ArrayList <Postre> listaPostres;
    

    public Orden() {
        this.numOrden = 0;
        this.fecha = null;
        this.nombreCliente = "";
        this.descuento = 0;
        this.total = 0.0;
        this.listaPlatosFuertes = new ArrayList();
        this.listaPostres = new ArrayList();
    }

    public Orden(int numOrden, Date fecha, String nombreCliente, int descuento, double total, ArrayList<PlatoFuerte> listaPlatosFuertes, ArrayList<Postre> listaPostres) {
        this.numOrden = numOrden;
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.descuento = descuento;
        this.total = total;
        this.listaPlatosFuertes = listaPlatosFuertes;
        this.listaPostres = listaPostres;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<PlatoFuerte> getListaPlatosFuertes() {
        return listaPlatosFuertes;
    }

    public void setListaPlatosFuertes(ArrayList<PlatoFuerte> listaPlatosFuertes) {
        this.listaPlatosFuertes = listaPlatosFuertes;
    }

    public ArrayList<Postre> getListaPostres() {
        return listaPostres;
    }

    public void setListaPostres(ArrayList<Postre> listaPostres) {
        this.listaPostres = listaPostres;
    }
    
    public void recibirPlatoFuerte(PlatoFuerte platoFuerte){
        this.listaPlatosFuertes.add(platoFuerte);
    }
    
    public void recibirPostre(Postre postre){
        this.listaPostres.add(postre);
    
    }
}