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
    
    @Override
    public String toString() {
        ArrayList<String> platosFuertesCodigos = new ArrayList<String>();
        for (PlatoFuerte platoFuerte: this.listaPlatosFuertes ) {
            platosFuertesCodigos.add(String.valueOf(platoFuerte.getCodigo()));
        }
        ArrayList<String> postresCodigos = new ArrayList<String>();
        for (Postre postre: this.listaPostres ) {
            postresCodigos.add(String.valueOf(postre.getCodigo()));
        }
        //"Orden{" + "numOrden=" + numOrden + ", fecha=" + fecha + ", nombreCliente=" + nombreCliente + ", descuento=" + descuento + ", total=" + total + ", listaPlatosFuertes=" + listaPlatosFuertes + ", listaPostres=" + listaPostres + '}';
        return String.format("%s|%s|%s|%s|%s|%s|%s",
                numOrden,
                fecha,
                nombreCliente,
                descuento,
                totalFinal(),
                platosFuertesCodigos,
                postresCodigos);
        
    }
    
    public double productoCantidadPrecio(){
        //Se define e inicializa la variable
        double precioCantidad = 0.0;
        
        for(PlatoFuerte precioPlatoFuerte : this.listaPlatosFuertes){
            
            precioCantidad = precioCantidad + (precioPlatoFuerte.getPrecio() * 1);
        }   
        
        for(Postre precioPostre : this.listaPostres){
            
            precioCantidad = precioCantidad + (precioPostre.getPrecio() * 1);
        }  
            
        return precioCantidad; 
    }
    
    //Calcula el impuesto del servicio (10%)
    public double calculoServicio() {

        double totalProducto = 0.0;
        
            totalProducto = productoCantidadPrecio() * 0.10;//Se realiza la multiplicació del resultado del método de productoCantidadPrecio() * 0.10 (impuesto del servicio 10%)
            
        return totalProducto; //Retorna el total del producto con el impuesto de servicio (10%)
    }
    
    //Calcula el impuesto del IVA (13%)
    public double calculoIVA() {

        double totalProducto = 0.0;
        
            totalProducto = productoCantidadPrecio() * 0.13;//Se realiza la multiplicació del resultado del método de productoCantidadPrecio() * 0.13 (impuesto del IVA 13%)
            
        return totalProducto;//Retorna el total del producto con el impuesto del IVA (13%)
    }
    
     //Cálculo del subtotal
    public double primerTotal() {
        double montoTotalProductos = 0.0;

        for (PlatoFuerte subPlatoFuerte : this.listaPlatosFuertes) {
            montoTotalProductos = productoCantidadPrecio();
        }
        
        for (Postre subPostre : this.listaPostres) {
            montoTotalProductos = productoCantidadPrecio();
        }
        return montoTotalProductos + this.calculoIVA() + this.calculoServicio();//Retorna la suma de los impuestos (10%) y (13%) al total del productoCantidadPrecio()
    }
    
    //Cálculo del total final
    public double totalFinal() {
       
        double totalFinal = this.primerTotal() - (this.primerTotal() * ((this.descuento * 1.0) / 100.0)); //Se guarda en la variable totalFinal el resultado del subtotal menos el descuento
        System.out.println("");
        
        return totalFinal; //El método retorna el total final
    }
}