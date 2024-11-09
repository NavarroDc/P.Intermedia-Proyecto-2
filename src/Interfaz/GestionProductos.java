/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import Interfaz.Modelos.Administrador;
import Interfaz.Modelos.PlatoFuerte;
import Interfaz.Modelos.Producto;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonAgregar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                                    .addComponent(lectorNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(lectorCodigo)
                                    .addComponent(lectorPrecio)))
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
                        .addGap(149, 149, 149)
                        .addComponent(jLabel9)
                        .addContainerGap(669, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lectorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAgregar)
                .addContainerGap(46, Short.MAX_VALUE))
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
        String numCodigo = lectorCodigo.getText();
        String nombreProducto = lectorNombre.getText();
        boolean gluten = glutenSi.isSelected();
        int cantPorciones = (int) porciones.getValue();
        boolean esPostre = postreSi.isSelected();
        boolean esPlatoFuerte = platoFuerteSi.isSelected();
        double precioProducto = (double) lectorPrecio.getValue();
        String saborElegido = (String) tipoSabor.getSelectedItem();
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void lectorPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectorPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lectorPrecioActionPerformed

    private void botonAgregarIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarIngredientesActionPerformed
        // TODO add your handling code here:
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
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAgregarIngredientes;
    private javax.swing.ButtonGroup decisionTipoDePlato;
    private javax.swing.ButtonGroup desicionGluten;
    private javax.swing.JRadioButton glutenNo;
    private javax.swing.JRadioButton glutenSi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField lectorCodigo;
    private javax.swing.JTextField lectorIngredientes;
    private javax.swing.JTextField lectorNombre;
    private javax.swing.JFormattedTextField lectorPrecio;
    private javax.swing.JList<String> listaMostrarIngredientes;
    private javax.swing.JRadioButton platoFuerteSi;
    private javax.swing.JSpinner porciones;
    private javax.swing.JRadioButton postreSi;
    private javax.swing.JComboBox<String> tipoSabor;
    // End of variables declaration//GEN-END:variables
}
