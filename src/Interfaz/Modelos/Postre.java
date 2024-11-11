package Interfaz.Modelos;

public class Postre extends Producto{
   private String tipoSabor; 

    public Postre() {
        super();    
        this.tipoSabor = "";
    }

    public Postre(String tipoSabor, int codigo, String nombre, boolean libreGluten, int cantidadPorciones, double precio) {
        super(codigo, nombre, libreGluten, cantidadPorciones, precio);
        this.tipoSabor = tipoSabor;
    }

    public String getTipoSabor() {
        return tipoSabor;
    }

    public void setTipoSabor(String tipoSabor) {
        this.tipoSabor = tipoSabor;
    }

    @Override
    public String toString() {
        //return "Postre{" + "tipoSabor=" + tipoSabor + '}' + super.codigo + super.nombre + super.libreGluten + super.cantidadPorciones + super.precio;
        return String.format("Postre|Código:%s|Nombre:%s|LibreGluten:%s|Porciones:%s|Precio%s|TipoSabor:%s",
                super.codigo, super.nombre, super.libreGluten, super.cantidadPorciones, super.precio, tipoSabor);
    }   
    
    
}
