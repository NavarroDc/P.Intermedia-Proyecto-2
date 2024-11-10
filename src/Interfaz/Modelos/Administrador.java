package Interfaz.Modelos;

import java.util.ArrayList;

public class Administrador {
    
    private ArrayList<Producto> listaProductos = new ArrayList();
    private ArrayList<PlatoFuerte> listaPlatosFuertes = new ArrayList();
    private ArrayList<Postre> listaPostres = new ArrayList();

    public Administrador() {
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


