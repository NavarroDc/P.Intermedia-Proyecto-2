package Interfaz.Modelos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Administrador {
    //Variables de la clase Administrador
    private ArrayList<Producto> listaProductos;
    private ArrayList<PlatoFuerte> listaPlatosFuertes;
    private ArrayList<Postre> listaPostres;
    private ArrayList<Orden> listaOrdenes;

    //Construtor sin par�metros
    public Administrador() {
        listaProductos = new ArrayList();
        listaPlatosFuertes = new ArrayList();
        listaPostres = new ArrayList();
        listaOrdenes = new ArrayList();
    }
    //Constructor con par�metros
    public Administrador(ArrayList<Producto> listaProductos, ArrayList<PlatoFuerte> listaPlatosFuertes, ArrayList<Postre> listaPostres, ArrayList<Orden> listaOrdenes) {
        this.listaProductos = listaProductos;
        this.listaPlatosFuertes = listaPlatosFuertes;
        this.listaPostres = listaPostres;
        this.listaOrdenes = listaOrdenes;
    }
    
    //Getters y setters de la clase Administrador
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
    
    //M�todo para agregar un nuevo producto a listaProductos
    public void addNuevoProducto(Producto productoIngresado){
        this.listaProductos.add(productoIngresado);
        
    }
    
    //M�todo para agregar un nuevo plato fuerte a listaPlatosFuertes
    public void addNuevoPlatoFuerte(PlatoFuerte platoFuerteIngresado){
        this.listaPlatosFuertes.add(platoFuerteIngresado);
        
    }
    
    //M�todo para agregar un nuevo postre a listaPostres
    public void addNuevoPostre (Postre postreIngresado){
        this.listaPostres.add(postreIngresado);
    }
    
    //M�todo para escribir en el archivo Menu.txt
    public void escribirProducto(){
        FileWriter archivoProductos = null;
        PrintWriter guardarProductosArchivo = null;
        
        try{
            archivoProductos = new FileWriter("Menu.txt");
            guardarProductosArchivo = new PrintWriter(archivoProductos);
            
            for(PlatoFuerte indicePlatoFuerte : this.getListaPlatosFuertes()){
                guardarProductosArchivo.println(indicePlatoFuerte.toString());   
            }
            
            for(Postre indicePostre : this.getListaPostres()){
                guardarProductosArchivo.println(indicePostre.toString());
            }
            guardarProductosArchivo.flush();
            guardarProductosArchivo.close();
            
            
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Error al guardar el array.");
        }
        
    }
    
    //guardarPlatoFuerteArchivo.println("C�digo: " + String precioString = String.valueOf(nuevoPlatoFuerte.getCodigo()));
}


