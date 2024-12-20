package Interfaz.Modelos;

import java.io.BufferedReader;//Lectura de archivos
import java.io.File;//Para trabajar con archivos
import java.io.FileReader;//Lectura de archivos
import java.io.FileWriter;//Escritura de archivos
import java.io.IOException;//Exepci�n al trabajar con los archivos
import java.io.PrintWriter;//Escritura de archivo
import java.util.ArrayList;
import java.util.Arrays;

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
        inicializarProductos();
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
    public void addNuevoProducto(Producto productoIngresado) {
        this.listaProductos.add(productoIngresado);

    }

    //M�todo para agregar un nuevo plato fuerte a listaPlatosFuertes
    public void addNuevoPlatoFuerte(PlatoFuerte platoFuerteIngresado) {
        this.listaPlatosFuertes.add(platoFuerteIngresado);

    }

    //M�todo para agregar un nuevo postre a listaPostres
    public void addNuevoPostre(Postre postreIngresado) {
        this.listaPostres.add(postreIngresado);
    }

    //M�todo para escribir en el archivo Menu.txt
    public void escribirProducto() {
        FileWriter archivoProductos = null;//Se inicializa la variable del archivo en null
        PrintWriter guardarProductosArchivo = null;//PrintWriter como elemento para escribir en el archivo

        try {//Try catch para atrapar excepciones cuando el archivo se abre

            archivoProductos = new FileWriter("Menu.txt");
            guardarProductosArchivo = new PrintWriter(archivoProductos);

            for (PlatoFuerte indicePlatoFuerte : this.getListaPlatosFuertes()) {
                guardarProductosArchivo.println(indicePlatoFuerte.toString());
            }

            for (Postre indicePostre : this.getListaPostres()) {
                guardarProductosArchivo.println(indicePostre.toString());
            }
            guardarProductosArchivo.flush();
            guardarProductosArchivo.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al escribir");
        }
    }

    public void inicializarProductos() {
        try {

            File archivoProductos = new File("Menu.txt");
            FileReader lectorArchivoProductos = new FileReader(archivoProductos);
            BufferedReader lineaArchivoProductos = new BufferedReader(lectorArchivoProductos);

            String linea;
            while ((linea = lineaArchivoProductos.readLine()) != null) {
                leerLinea(linea);
                System.out.println(linea);
            }
            lectorArchivoProductos.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void leerLinea(String linea) {
        String[] datosSeparadosPorComa = linea.split("\\|");
        String tipoDeProducto = datosSeparadosPorComa[0];
        System.out.println(tipoDeProducto);
        switch (tipoDeProducto) {
            case "PlatoFuerte":
                // llamar a la funcion que lee platos fuertes
                leerPlatoFuerte(datosSeparadosPorComa);
                break;
            case "Postre":
                // llamar a la funcion que lee postres
                leerPostre(datosSeparadosPorComa);
                break;
            default:
                System.out.println("No se reconoce el producto");
                break;
        }

    }

    public void leerPlatoFuerte(String[] datos) {
        System.out.println(datos.length);
        PlatoFuerte platoFuerte = new PlatoFuerte();
        int codigo = Integer.parseInt(datos[1].split("\\:")[1]);
        String nombre = datos[2].split("\\:")[1];
        boolean libreDeGluten = Boolean.parseBoolean(datos[3].split("\\:")[1]);
        int cantidadPorciones = Integer.parseInt(datos[4].split("\\:")[1]);
        double precio = Double.parseDouble(datos[5].split("\\:")[1]);
        String[] ingredientes = datos[6].split("\\:")[1].replace("[", "").replace("]", "").split("\\,");

        platoFuerte.setCodigo(codigo);
        platoFuerte.setNombre(nombre);
        platoFuerte.setLibreGluten(libreDeGluten);
        platoFuerte.setCantidadPorciones(cantidadPorciones);
        platoFuerte.setPrecio(precio);
        platoFuerte.setIngredientes(new ArrayList<>(Arrays.asList(ingredientes)));
        this.listaPlatosFuertes.add(platoFuerte);

    }

    public void leerPostre(String[] datos) {
        Postre postre = new Postre();
        int codigo = Integer.parseInt(datos[1].split("\\:")[1]);
        String nombre = datos[2].split("\\:")[1];
        boolean libreDeGluten = Boolean.parseBoolean(datos[3].split("\\:")[1]);
        int cantidadPorciones = Integer.parseInt(datos[4].split("\\:")[1]);
        double precio = Double.parseDouble(datos[5].split("\\:")[1]);
        String tipoSabor = datos[2].split("\\:")[1];

        postre.setCodigo(codigo);
        postre.setNombre(nombre);
        postre.setLibreGluten(libreDeGluten);
        postre.setCantidadPorciones(cantidadPorciones);
        postre.setPrecio(precio);
        postre.setTipoSabor(tipoSabor);
        this.listaPostres.add(postre);

    }
    
    //M�todo para escribir en el archivo Orden.txt
    public void escribirOrdenes() {
        FileWriter archivoOrdenes = null; //Se inicializa la variable del archivo en null
        PrintWriter guardarOrdenesArchivo = null;//PrintWriter como elemento para escribir en el archivo

        try {//Try catch para atrapar excepciones cuando el archivo se abre

            archivoOrdenes = new FileWriter("Ordenes.txt");
            guardarOrdenesArchivo = new PrintWriter(archivoOrdenes);

            for (Orden orden : this.getListaOrdenes()) {
                guardarOrdenesArchivo.println(orden.toString());
            }


            guardarOrdenesArchivo.flush();
            guardarOrdenesArchivo.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al escribir");
        }
    }
    
    public void agregarOrden(Orden orden){
        this.listaOrdenes.add(orden);
    }
}
