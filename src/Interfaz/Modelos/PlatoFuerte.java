package Interfaz.Modelos;

import java.util.ArrayList;

public class PlatoFuerte extends Producto {

    private ArrayList<String> ingredientes;

    public PlatoFuerte() {
        super();
        ingredientes = new ArrayList();
    }

    public PlatoFuerte(ArrayList<String> ingredientes, int codigo, String nombre, boolean libreGluten, int cantidadPorciones, double precio) {
        super(codigo, nombre, libreGluten, cantidadPorciones, precio);
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void agregarIngrediente(String nuevoIngrediente) {
        this.ingredientes.add(nuevoIngrediente);
    }

    @Override
    public String toString() {

        //return "PlatoFuerte{" + "ingredientes=" + ingredientes + '}' + super.codigo + super.nombre + super.libreGluten + super.cantidadPorciones + super.precio;
        return String.format("PlatoFuerte|Código:%s|Nombre:%s|LibreGluten:%s|Porciones:%s|Precio%s|Ingredientes:%s",
                super.codigo, super.nombre, super.libreGluten, super.cantidadPorciones, super.precio, ingredientes);
    }

}
