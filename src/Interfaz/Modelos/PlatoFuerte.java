package Interfaz.Modelos;

import java.util.ArrayList;

public class PlatoFuerte extends Producto {
    //Creaci�n de la lista de ingredientes
    private ArrayList<String> ingredientes;

    //Constructor sin par�metros
    public PlatoFuerte() {
        super();
        ingredientes = new ArrayList();
    }
    
    //Constructor con par�metros
    public PlatoFuerte(ArrayList<String> ingredientes, int codigo, String nombre, boolean libreGluten, int cantidadPorciones, double precio) {
        super(codigo, nombre, libreGluten, cantidadPorciones, precio);
        this.ingredientes = ingredientes;
    }

    //Getters y setters
    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void agregarIngrediente(String nuevoIngrediente) {
        this.ingredientes.add(nuevoIngrediente);
    }

    //M�todo para mostrar los datos
    @Override
    public String toString() {

        //return "PlatoFuerte{" + "ingredientes=" + ingredientes + '}' + super.codigo + super.nombre + super.libreGluten + super.cantidadPorciones + super.precio;
        return String.format("PlatoFuerte|C�digo:%s|Nombre:%s|LibreGluten:%s|Porciones:%s|Precio:%s|Ingredientes:%s",
                super.codigo, super.nombre, super.libreGluten, super.cantidadPorciones, super.precio, ingredientes);
    }

}
