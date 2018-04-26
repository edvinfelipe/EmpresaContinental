/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author igeni
 */
public class Inicio extends javax.swing.JFrame {

    Clases.InsertarEmpleado insercion = new Clases.InsertarEmpleado();
    Clases.Contrasena encriptado = new Clases.Contrasena();
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BTNInsertar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFNombres = new javax.swing.JTextField();
        TFApellidos = new javax.swing.JTextField();
        TFDireccion = new javax.swing.JTextField();
        TFUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PFContrasena = new javax.swing.JPasswordField();
        LBLUsuario1 = new javax.swing.JLabel();
        RBMascota = new javax.swing.JRadioButton();
        RBDeporte = new javax.swing.JRadioButton();
        RBMejorAmigo = new javax.swing.JRadioButton();
        LBLUsuario2 = new javax.swing.JLabel();
        TFRespuesta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(961, 330));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(36, 41, 46));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cont1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 360, 240));

        BTNInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ingresar1.png"))); // NOI18N
        BTNInsertar.setBorder(null);
        BTNInsertar.setBorderPainted(false);
        BTNInsertar.setContentAreaFilled(false);
        BTNInsertar.setFocusPainted(false);
        BTNInsertar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNInsertar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ingresar3.png"))); // NOI18N
        BTNInsertar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ingresar2.png"))); // NOI18N
        BTNInsertar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BTNInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(BTNInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salida2.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salida3.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida1.png"))); // NOI18N
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimiza2.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar3.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar1.png"))); // NOI18N
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mi contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hola, usted será el nuevo administrador.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        TFNombres.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TFNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFNombresKeyTyped(evt);
            }
        });
        jPanel1.add(TFNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 200, -1));

        TFApellidos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TFApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFApellidosKeyTyped(evt);
            }
        });
        jPanel1.add(TFApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 200, -1));

        TFDireccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TFDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFDireccionKeyTyped(evt);
            }
        });
        jPanel1.add(TFDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 200, -1));

        TFUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TFUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(TFUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 200, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Proceda a ingresar sus datos personales:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mis nombres son:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mis apellidos son:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Yo vivo en:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mi nick de usuario será:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        PFContrasena.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PFContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PFContrasenaKeyTyped(evt);
            }
        });
        jPanel1.add(PFContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 200, -1));

        LBLUsuario1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        LBLUsuario1.setText("Preguntas de respaldo:");
        jPanel1.add(LBLUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, -1));

        RBMascota.setBackground(new java.awt.Color(36, 41, 46));
        RBMascota.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RBMascota.setForeground(new java.awt.Color(255, 255, 255));
        RBMascota.setText("Mi mascota preferida sería:");
        RBMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBMascotaActionPerformed(evt);
            }
        });
        jPanel1.add(RBMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        RBDeporte.setBackground(new java.awt.Color(36, 41, 46));
        RBDeporte.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RBDeporte.setForeground(new java.awt.Color(255, 255, 255));
        RBDeporte.setText("Mi deporte favorito es:");
        RBDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBDeporteActionPerformed(evt);
            }
        });
        jPanel1.add(RBDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        RBMejorAmigo.setBackground(new java.awt.Color(36, 41, 46));
        RBMejorAmigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RBMejorAmigo.setForeground(new java.awt.Color(255, 255, 255));
        RBMejorAmigo.setText("Conocí a mi mejor amigo en la ciudad de:");
        RBMejorAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBMejorAmigoActionPerformed(evt);
            }
        });
        jPanel1.add(RBMejorAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, -1));

        LBLUsuario2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        LBLUsuario2.setText("Respuesta:");
        jPanel1.add(LBLUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, -1, -1));

        TFRespuesta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TFRespuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFRespuestaKeyTyped(evt);
            }
        });
        jPanel1.add(TFRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setState(General.ICONIFIED);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int sino = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null,"¿Desea Sallir del Sistema?","Exit",sino);
        if(resultado==0){

            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BTNInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNInsertarActionPerformed
        if (!TFNombres.getText().equals("")  && !TFApellidos.getText().equals("") && !TFDireccion.getText().equals("") && !TFUsuario.getText().equals("") 
                && !String.valueOf(PFContrasena.getPassword()).equals("") && (RBMascota.isSelected() || RBDeporte.isSelected() || 
                RBMejorAmigo.isSelected()) && !TFRespuesta.getText().equals(""))
        {
            try {
                if (RBMascota.isSelected())
                    insercion.Insertar(TFNombres.getText(), TFApellidos.getText(), TFDireccion.getText(), TFUsuario.getText(), encriptado.Encriptar(String.valueOf(PFContrasena.getPassword())), 1, RBMascota.getText(), TFRespuesta.getText());
                else if (RBDeporte.isSelected())
                    insercion.Insertar(TFNombres.getText(), TFApellidos.getText(), TFDireccion.getText(), TFUsuario.getText(), encriptado.Encriptar(String.valueOf(PFContrasena.getPassword())), 1, RBDeporte.getText(), TFRespuesta.getText());
                else if (RBMejorAmigo.isSelected())
                    insercion.Insertar(TFNombres.getText(), TFApellidos.getText(), TFDireccion.getText(), TFUsuario.getText(), encriptado.Encriptar(String.valueOf(PFContrasena.getPassword())), 1, RBMejorAmigo.getText(), TFRespuesta.getText());
                Login loguear = new Login();
                loguear.setVisible(true);
                this.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
    }//GEN-LAST:event_BTNInsertarActionPerformed

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped

    }//GEN-LAST:event_jPanel1KeyTyped

    private void TFNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNombresKeyTyped
        char c = evt.getKeyChar();
        
        if ((c<'a' || c>'z') && (c<'A')|c>'Z') evt.consume();
        if (TFNombres.getText().length() > 30) evt.consume();
    }//GEN-LAST:event_TFNombresKeyTyped

    private void TFApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFApellidosKeyTyped
        char c = evt.getKeyChar();
        
        if ((c<'a' || c>'z') && (c<'A')|c>'Z') evt.consume();
        if (TFApellidos.getText().length() > 30) evt.consume();
    }//GEN-LAST:event_TFApellidosKeyTyped

    private void TFDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFDireccionKeyTyped
        if (TFDireccion.getText().length() > 30) evt.consume();
    }//GEN-LAST:event_TFDireccionKeyTyped

    private void TFUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFUsuarioKeyTyped
        if (TFUsuario.getText().length() > 25) evt.consume();
    }//GEN-LAST:event_TFUsuarioKeyTyped

    private void PFContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PFContrasenaKeyTyped
        if (PFContrasena.getPassword().length > 45) evt.consume();
    }//GEN-LAST:event_PFContrasenaKeyTyped

    private void RBMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBMascotaActionPerformed
        if (RBMascota.isSelected())
        {
            RBDeporte.setSelected(false);
            RBMejorAmigo.setSelected(false);
        }
    }//GEN-LAST:event_RBMascotaActionPerformed

    private void RBDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBDeporteActionPerformed
        if (RBDeporte.isSelected())
        {
            RBMascota.setSelected(false);
            RBMejorAmigo.setSelected(false);
        }
    }//GEN-LAST:event_RBDeporteActionPerformed

    private void RBMejorAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBMejorAmigoActionPerformed
        if (RBMejorAmigo.isSelected())
        {
            RBMascota.setSelected(false);
            RBDeporte.setSelected(false);
        }
    }//GEN-LAST:event_RBMejorAmigoActionPerformed

    private void TFRespuestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFRespuestaKeyTyped
        if (TFRespuesta.getText().length() > 30) evt.consume();
    }//GEN-LAST:event_TFRespuestaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNInsertar;
    private javax.swing.JLabel LBLUsuario1;
    private javax.swing.JLabel LBLUsuario2;
    private javax.swing.JPasswordField PFContrasena;
    private javax.swing.JRadioButton RBDeporte;
    private javax.swing.JRadioButton RBMascota;
    private javax.swing.JRadioButton RBMejorAmigo;
    private javax.swing.JTextField TFApellidos;
    private javax.swing.JTextField TFDireccion;
    private javax.swing.JTextField TFNombres;
    private javax.swing.JTextField TFRespuesta;
    private javax.swing.JTextField TFUsuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
