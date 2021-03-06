/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Controladores.ArchivoUtiles;
import Controladores.Controlador;
import Modelos.Inventario;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class formInventarioAltas extends javax.swing.JPanel {
    
    /*Variables globales*/
    Inventario inventarioTmp;
    ArchivoUtiles manejadorArchivos;
    Controlador ctlr;

 
    public formInventarioAltas() {
        initComponents();
        manejadorArchivos = new ArchivoUtiles();
        ctlr = new Controlador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnRenombrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(71, 120, 197));
        setMinimumSize(new java.awt.Dimension(480, 350));
        setPreferredSize(new java.awt.Dimension(480, 350));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setForeground(new java.awt.Color(71, 120, 197));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 55, 238, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 11, 211, -1));

        txtMarca.setBackground(new java.awt.Color(71, 120, 197));
        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));
        txtMarca.setBorder(null);
        txtMarca.setCaretColor(new java.awt.Color(255, 255, 255));
        txtMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 34, 238, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Producto:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 83, 211, -1));

        txtProducto.setBackground(new java.awt.Color(71, 120, 197));
        txtProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtProducto.setBorder(null);
        txtProducto.setCaretColor(new java.awt.Color(255, 255, 255));
        txtProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 106, 238, -1));

        jSeparator4.setForeground(new java.awt.Color(71, 120, 197));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 127, 238, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 155, 211, -1));

        txtPrecio.setBackground(new java.awt.Color(71, 120, 197));
        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setBorder(null);
        txtPrecio.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 178, 238, -1));

        jSeparator5.setForeground(new java.awt.Color(71, 120, 197));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 199, 238, 10));

        btnSalir.setBackground(new java.awt.Color(0, 102, 102));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icoSalir.png"))); // NOI18N
        btnSalir.setToolTipText("");
        btnSalir.setAlignmentX(0.5F);
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.setFocusable(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icoSalirHover.png"))); // NOI18N
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 60, 58));

        btnGuardar.setBackground(new java.awt.Color(0, 102, 102));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icoGuardar.png"))); // NOI18N
        btnGuardar.setToolTipText("");
        btnGuardar.setAlignmentX(0.5F);
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icoGuardarHover.png"))); // NOI18N
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 60, 58));

        btnBuscar.setBackground(new java.awt.Color(0, 102, 102));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icoAbrir.png"))); // NOI18N
        btnBuscar.setToolTipText("");
        btnBuscar.setAlignmentX(0.5F);
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.setFocusable(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icoAbrirHover.png"))); // NOI18N
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 60, 58));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Guardar");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 60, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Buscar");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 60, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Salir");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 60, -1));

        btnRenombrar.setBackground(new java.awt.Color(0, 102, 102));
        btnRenombrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRenombrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icoRenombrar.png"))); // NOI18N
        btnRenombrar.setToolTipText("");
        btnRenombrar.setAlignmentX(0.5F);
        btnRenombrar.setBorder(null);
        btnRenombrar.setBorderPainted(false);
        btnRenombrar.setContentAreaFilled(false);
        btnRenombrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRenombrar.setFocusable(false);
        btnRenombrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRenombrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icoRenombrarHover.png"))); // NOI18N
        btnRenombrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRenombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenombrarActionPerformed(evt);
            }
        });
        add(btnRenombrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 60, 58));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Renombrar");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 60, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 102, 102));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconEliminar.png"))); // NOI18N
        btnEliminar.setToolTipText("");
        btnEliminar.setAlignmentX(0.5F);
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconEliminarHover.png"))); // NOI18N
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 60, 58));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Eliminar");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 60, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    /*Acci??n del bot??n salir*/
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        ctlr.limpiarCampos(txtMarca, txtProducto, txtPrecio);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed
    
    /*Acci??n del bot??n guardar*/
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Si alguno de los campos est?? vac??o no se guarda
        if(txtMarca.getText().isEmpty() 
                || txtProducto.getText().isEmpty() 
                || txtPrecio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese todos los campos");
            return;
        }
        
        try{
            inventarioTmp = new Inventario();
            inventarioTmp.setMarca(txtMarca.getText());
            inventarioTmp.setProducto(txtProducto.getText());
            inventarioTmp.setPrecio(Double.parseDouble(txtPrecio.getText()));
            manejadorArchivos.guardar(inventarioTmp.toString());
            ctlr.limpiarCampos(txtMarca, txtProducto, txtPrecio);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "El precio debe ser num??rico");
        }catch(NullPointerException ex){
        }catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar: Intenta con otro nombre");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    /*Acci??n del bot??n buscar*/
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            inventarioTmp = (Inventario) manejadorArchivos.abrir();
            txtMarca.setText(inventarioTmp.getMarca());
            txtProducto.setText(inventarioTmp.getProducto());
            txtPrecio.setText(String.valueOf(inventarioTmp.getPrecio()));
        } catch (NullPointerException | ClassCastException ex) {
             JOptionPane.showMessageDialog(null, "Archivo no es del tipo Inventario");
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir: "+ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    /*Acci??n del bot??n renombrar*/
    private void btnRenombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenombrarActionPerformed
        try {
            manejadorArchivos.renombrar();
        }   catch (NullPointerException ex) {
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al renombrar: Intenta con otro nombre");
        }
    }//GEN-LAST:event_btnRenombrarActionPerformed
    
    /*Acci??n del bot??n eliminar*/
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            manejadorArchivos.eliminar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar archivo: "+ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRenombrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
