package Interfaz.Modelos;

import java.util.ArrayList;

public class Administrador {
    //Variables de la clase Administrador
    private ArrayList<Producto> listaProductos;
    private ArrayList<PlatoFuerte> listaPlatosFuertes;
    private ArrayList<Postre> listaPostres;
    private ArrayList<Orden> listaOrdenes;

    
    public Administrador() {
        listaProductos = new ArrayList();
        listaPlatosFuertes = new ArrayList();
        listaPostres = new ArrayList();
        listaOrdenes = new ArrayList();
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
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

    public ArrayList<Orden> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(ArrayList<Orden> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }
    
    public void addNuevoProducto(Producto productoIngresado){
        this.listaProductos.add(productoIngresado);
        
    }
    
    public void addNuevoPlatoFuerte(PlatoFuerte platoFuerteIngresado){
        this.listaPlatosFuertes.add(platoFuerteIngresado);
        
    }
    
    public void addNuevoPostre (Postre postreIngresado){
        this.listaPostres.add(postreIngresado);
    }
    
    
    
    
}


