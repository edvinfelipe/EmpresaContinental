/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modificar;

import Clases.Conexion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Metiqueta extends javax.swing.JPanel {
    Conexion con = new Conexion();
    Connection cn= con.ConectarBaseDatos();
    public int id_producto;

    /**
     * Creates new form Metiqueta
     */
    public Metiqueta(int id) {
        initComponents();
        mostrar(id);
        id_producto=id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtamaño = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(36, 41, 46));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cantidad");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txtcantidad.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });
        add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 160, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tamaño");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        txtamaño.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtamaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtamañoKeyTyped(evt);
            }
        });
        add(txtamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 160, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txtmarca.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtmarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmarcaKeyTyped(evt);
            }
        });
        add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 160, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio Venta");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtprecio.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });
        add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 160, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cambios.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cambios2.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cambios1.png"))); // NOI18N
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(verificar()!=0){
            modificar();
        }else{
            JOptionPane.showMessageDialog(null,"Debe de completar los campor para modificar");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();

            if(Character.isDigit(validar)){
                getToolkit().beep();
                evt.consume();
            }
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void txtamañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtamañoKeyTyped
        // TODO add your handling code here:
          char validar=evt.getKeyChar();

            if(Character.isDigit(validar)){
                getToolkit().beep();
                evt.consume();
            }
    }//GEN-LAST:event_txtamañoKeyTyped

    private void txtmarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmarcaKeyTyped
        // TODO add your handling code here:
        char validar =evt.getKeyChar();
            if(Character.isLetter(validar)){
                getToolkit().beep();
                evt.consume();
            }
    }//GEN-LAST:event_txtmarcaKeyTyped

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        // TODO add your handling code here:
        char c= evt.getKeyChar();
        
        if((c<'0'||c>'9') && (c!= KeyEvent.VK_BACK_SPACE) && (c!='.')) evt.consume();
    }//GEN-LAST:event_txtprecioKeyTyped

    public void mostrar(int idproducto){
        String sql="SELECT cantidad,tamaño,marca,precio_venta FROM producto WHERE id_producto='"+idproducto+"'";
        Statement st;
        
        try {
            st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while (rs.next()) {
            txtcantidad.setText(rs.getString(1));
            txtamaño.setText(rs.getString(2));
            txtmarca.setText(rs.getString(3));
            txtprecio.setText(rs.getString(4));
            
            
         }
        } catch (SQLException ex) {
            Logger.getLogger(Metiqueta.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public void modificar(){
        
       
        int cantidad,tamaño;
       String marca;
       float precio;
       
       cantidad=Integer.valueOf(txtcantidad.getText());
       tamaño=Integer.valueOf(txtamaño.getText());
       marca=txtmarca.getText();
       precio=Float.valueOf(txtprecio.getText());
       
       String sql="UPDATE producto SET cantidad='"+cantidad+"',tamaño='"+tamaño+"',marca='"+marca+"',precio_venta='"+precio+"' WHERE id_producto='"+id_producto+"'";
       PreparedStatement preparado;
       
        try {
            preparado = cn.prepareStatement(sql);
            preparado.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Metiqueta.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

     public int verificar(){
         
         if(!"".equals(txtcantidad.getText()) && !"".equals(txtamaño.getText())&&!"".equals(txtmarca.getText())&&!"".equals(txtprecio.getText())){
             
             return 1;
         }else{
             
             return 0;
         }
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
