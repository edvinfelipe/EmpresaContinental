/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos_panels;

import Clases.Insertar_producto;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Etiqueta extends javax.swing.JPanel {

    /**
     * Creates new form Etiqueta
     */
    public Etiqueta() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtamaño = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();

        setBackground(new java.awt.Color(36, 41, 46));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agregar3.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agre2.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agre1.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cantidad");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtcantidad.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 160, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tamaño");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtamaño.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        add(txtamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 160, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txtmarca.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 160, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio Venta");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txtprecio.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Insertar_producto insertar = new Insertar_producto();
        
        int cantidad,tamaño;
        String marca;
        double precio;
        
        cantidad=Integer.valueOf(txtcantidad.getText());
        tamaño= Integer.valueOf(txtamaño.getText());
        marca = txtmarca.getText();
        precio = Double.valueOf(txtprecio.getText());
        
        insertar.insertar_producto("Etiqueta","", cantidad,0,"", marca, tamaño,0,0, precio,2);
        limpiar();
          JOptionPane.showMessageDialog(null,"Producto Ingresado Exitosamente");
        
    }//GEN-LAST:event_jButton1ActionPerformed
   
    public void limpiar(){
        
        txtamaño.setText("");
        txtcantidad.setText("");
        txtmarca.setText("");
        txtprecio.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtamaño;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
