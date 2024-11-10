/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import Interfaz.Modelos.Administrador;
import Interfaz.Modelos.PlatoFuerte;
import Interfaz.Modelos.Postre;
import Interfaz.Modelos.Producto;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author angel
 */
public class GestionProductos extends javax.swing.JPanel {
    private Administrador administrador;
    private PlatoFuerte nuevoPlatoFuerte = new PlatoFuerte();
    private Postre nuevoPostre = new Postre();
    private Producto nuevoProducto = new Producto();
    


    /**
     * Creates new form GestionProductos
     */
    public GestionProductos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desicionGluten = new javax.swing.ButtonGroup();
        decisionTipoDePlato = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lectorCodigo = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        lectorNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        glutenSi = new javax.swing.JRadioButton();
        glutenNo = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        porciones = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        platoFuerteSi = new javax.swing.JRadioButton();
        postreSi = new javax.swing.JRadioButton();
        botonAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lectorPrecio = new javax.swing.JFormattedTextField();
        botonAgregarIngredientes = new javax.swing.JButton();
        lectorIngredientes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMostrarIngredientes = new javax.swing.JList<>();
        tipoSabor = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPlatosFuertes = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPostres = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("C�digo");

        lectorCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lectorCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("�Gl�ten?");

        desicionGluten.add(glutenSi);
        glutenSi.setText("S�");
        glutenSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glutenSiActionPerformed(evt);
            }
        });

        desicionGluten.add(glutenNo);
        glutenNo.setText("No");

        jLabel4.setText("Porciones");

        jLabel7.setText("Tipo de comida");

        decisionTipoDePlato.add(platoFuerteSi);
        platoFuerteSi.setText("Plato fuerte");
        platoFuerteSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platoFuerteSiActionPerformed(evt);
            }
        });

        decisionTipoDePlato.add(postreSi);
        postreSi.setText("Postre");
        postreSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postreSiActionPerformed(evt);
            }
        });

        botonAgregar.setText("Agregar producto");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        jLabel5.setText("Precio");

        lectorPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lectorPrecioActionPerformed(evt);
            }
        });

        botonAgregarIngredientes.setText("Agregar ingrediente");
        botonAgregarIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarIngredientesActionPerformed(evt);
            }
        });

        lectorIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lectorIngredientesActionPerformed(evt);
            }
        });

        jLabel6.setText("Agregue los ingredientes (M�nimo 3)");

        listaMostrarIngredientes.setToolTipText("");
        jScrollPane1.setViewportView(listaMostrarIngredientes);

        tipoSabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dulce", "Salado", "Amargo" }));
        tipoSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoSaborActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo de sabor");

        jScrollPane2.setViewportView(listaPlatosFuertes);

        jScrollPane3.setViewportView(listaPostres);

        jLabel10.setText("Lista de Platos Fuertes");

        jLabel11.setText("Lista de Postres");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(porciones, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lectorNombre)
                                    .addComponent(lectorPrecio)
                                    .addComponent(lectorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(glutenSi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(glutenNo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(postreSi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(platoFuerteSi))
                            .addComponent(botonAgregarIngredientes, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lectorIngredientes, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(67, 67, 67)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lectorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lectorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lectorPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postreSi)
                            .addComponent(platoFuerteSi)
                            .addComponent(jLabel7))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lectorIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAgregarIngredientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(glutenNo)
                                .addComponent(glutenSi)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(porciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lectorCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectorCodigoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lectorCodigoActionPerformed

    private void platoFuerteSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platoFuerteSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_platoFuerteSiActionPerformed

    private void postreSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postreSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postreSiActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
        guardarDatosProducto();
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void lectorPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectorPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lectorPrecioActionPerformed

    private void botonAgregarIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarIngredientesActionPerformed
        // TODO add your handling code here:
        //Se agregan los ingrtedientes
        String nuevoIngrediente = lectorIngredientes.getText();
        nuevoPlatoFuerte.agregarIngrediente(nuevoIngrediente);
        //this.listaIngredientes.add(nuevoIngrediente);
        lectorIngredientes.setText("");
        
        listaMostrarIngredientes.setListData(this.nuevoPlatoFuerte.getIngredientes().toArray(new String [0]));
            //System.out.println(indice);
        
    }//GEN-LAST:event_botonAgregarIngredientesActionPerformed
    
    private void lectorIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectorIngredientesActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_lectorIngredientesActionPerformed

    private void glutenSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glutenSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_glutenSiActionPerformed

    private void tipoSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoSaborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoSaborActionPerformed

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
    public void guardarDatosProducto(){
        
        boolean esPostre = postreSi.isSelected();
        boolean esPlatoFuerte = platoFuerteSi.isSelected();
        String mostrarPlatoFuerte;
        if(esPlatoFuerte){
            nuevoPlatoFuerte.setCodigo(Integer.parseInt(lectorCodigo.getText()));
            nuevoPlatoFuerte.setNombre(lectorNombre.getText());
            nuevoPlatoFuerte.setLibreGluten(glutenSi.isSelected());
            nuevoPlatoFuerte.setCantidadPorciones((int) porciones.getValue());
            nuevoPlatoFuerte.setPrecio((Double.parseDouble(lectorPrecio.getText())));
            //Los ingredientes ya se agregan en la funci�n de botonAgregarIngredientes
            System.out.println(nuevoPlatoFuerte);
            
            
            this.administrador.addNuevoPlatoFuerte(nuevoPlatoFuerte);
            ArrayList <String> nombresPlatosFuertes = new ArrayList();
            for(PlatoFuerte indice : this.administrador.getListaPlatosFuertes()){
            
                
                nombresPlatosFuertes.add(indice.getNombre());
            }
            listaPlatosFuertes.setListData(nombresPlatosFuertes.toArray(new String [0]));
            
        }
        
        if(esPostre){
            nuevoPostre.setCodigo(Integer.parseInt(lectorCodigo.getText()));
            nuevoPostre.setNombre(lectorNombre.getText());
            nuevoPostre.setLibreGluten(glutenSi.isSelected());
            nuevoPostre.setCantidadPorciones((int) porciones.getValue());
            nuevoPostre.setPrecio((Double.parseDouble(lectorPrecio.getText())));
            nuevoPostre.setTipoSabor((String)tipoSabor.getSelectedItem());
            
            System.out.println(nuevoPostre);
            
            this.administrador.addNuevoPostre(nuevoPostre);
            ArrayList <String> nombresPostres = new ArrayList();
            for(Postre indice : this.administrador.getListaPostres()){
                nombresPostres.add(indice.getNombre());
            }
            listaPostres.setListData(nombresPostres.toArray(new String [0]));


        }
    }
    public void escribirPlatoFuerte(){
        FileWriter archivoProductos = null;
        PrintWriter guardarPlatoFuerteArchivo = null;
        PrintWriter guardarIngredientes = null;

        try{
            archivoProductos = new FileWriter("Menu.txt", true);
            guardarPlatoFuerteArchivo = new PrintWriter(archivoProductos);
            
            //guardarPlatoFuerteArchivo.println("C�digo: " + String precioString = String.valueOf(nuevoPlatoFuerte.getCodigo()));
            //guardarPlatoFuerteArchivo.println("Nombre: " + nuevoPlatoFuerte.getNombre());
            //guardarPlatoFuerteArchivo.println("Gl�ten:" + nuevoPlatoFuerte.getPrecio());
            guardarPlatoFuerteArchivo.println("");
            guardarPlatoFuerteArchivo.println("Ingredientes");
            guardarPlatoFuerteArchivo.println("");
            for(String indice : nuevoPlatoFuerte.getIngredientes()){
                guardarIngredientes.write(indice);
                guardarIngredientes.println("");
                
            }
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Error al guardar el array.");
        }
        
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAgregarIngredientes;
    private javax.swing.ButtonGroup decisionTipoDePlato;
    private javax.swing.ButtonGroup desicionGluten;
    private javax.swing.JRadioButton glutenNo;
    private javax.swing.JRadioButton glutenSi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JFormattedTextField lectorCodigo;
    private javax.swing.JTextField lectorIngredientes;
    private javax.swing.JTextField lectorNombre;
    private javax.swing.JFormattedTextField lectorPrecio;
    private javax.swing.JList<String> listaMostrarIngredientes;
    private javax.swing.JList<String> listaPlatosFuertes;
    private javax.swing.JList<String> listaPostres;
    private javax.swing.JRadioButton platoFuerteSi;
    private javax.swing.JSpinner porciones;
    private javax.swing.JRadioButton postreSi;
    private javax.swing.JComboBox<String> tipoSabor;
    // End of variables declaration//GEN-END:variables
}
