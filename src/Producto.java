public class Producto {
    
    //Propiedades de la clase Producto
    protected int codigo;
    protected String nombre;
    protected boolean libreGluten;
    protected int cantidadPorciones;
    protected double precio;

    //Constructor sin parámetros
    public Producto() {
        
        this.codigo = 0;
        this.nombre = "";
        this.libreGluten = false;
        this.cantidadPorciones = 0;
        this.precio = 0.0;
    }

    //Constructor con parámetros
    public Producto(int codigo, String nombre, boolean libreGluten, int cantidadPorciones, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.libreGluten = libreGluten;
        this.cantidadPorciones = cantidadPorciones;
        this.precio = precio;
    }

    //Getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLibreGluten() {
        return libreGluten;
    }

    public void setLibreGluten(boolean libreGluten) {
        this.libreGluten = libreGluten;
    }

    public int getCantidadPorciones() {
        return cantidadPorciones;
    }

    public void setCantidadPorciones(int cantidadPorciones) {
        this.cantidadPorciones = cantidadPorciones;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
