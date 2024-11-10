package Interfaz.Modelos;

import java.util.Date;

public class Orden {
    private int numOrden;
    private Date fecha;
    private String nombreCliente;
    private int descuento;
    private double total;

    public Orden() {
        this.numOrden = 0;
        this.fecha = null;
        this.nombreCliente = "";
        this.descuento = 0;
        this.total = 0.0;
    }

    public Orden(int numOrden, Date fecha, String nombreCliente, int descuento, double total) {
        this.numOrden = numOrden;
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.descuento = descuento;
        this.total = total;
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
    
    
    
    
}
