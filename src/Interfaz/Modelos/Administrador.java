package Interfaz.Modelos;



import java.util.ArrayList;

public class Administrador {
    
    private ArrayList<Producto> listaProductos = new ArrayList();

    public Administrador() {
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    public void addNuevoProducto(Producto productoIngresado){
        this.listaProductos.add(productoIngresado);
    }
    
    
}


