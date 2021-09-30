/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;


import Formularios.formInventarioAltas;
import Formularios.VistaPrincipal;
import Formularios.formPersonalAltas;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class Abarrotes extends javax.swing.JFrame implements MouseListener {

    /*Los menus pricipales y anidados los declaro global para poder acceder a ellos
    y mantenerlos en memoria, detectar su click para cambiar de color, etc.*/
    
    MenuItem menuPrincipal;
    MenuItem menuPersonal;
    MenuItem menuPersonalAltas;
    MenuItem menuInventario;
    MenuItem menuInventarioAltas;

    //Declaro un hash para poder guardar el estado del JPanel (formulario) y su respectivo menu que lo invoca
    HashMap<MenuItem, JPanel> menusEnMemoria;

    //Proporciona cuál menu fue clickeado al método mouseclicked()
    MenuItem clicked = null;

    /**
     * Creates new form VistaHome
     */
    public Abarrotes() {
        initComponents();
        initMenuItems();
        initHashMap();
        
        //Mostramos por defecto el menu principal
        menuPrincipal.setColor();
        menuPrincipal.showMenu();
        menuPrincipal.turnOffHidingMenu = true;
        dibujarVista(menusEnMemoria.get(menuPrincipal));
        clicked = menuPrincipal;
    }

    private void initMenuItems() {
        try{
            //Iconos
            ImageIcon icoInventario = new ImageIcon(getClass().getResource("/iconos/IcoInventario.png"));
            ImageIcon icoAgregar = new ImageIcon(getClass().getResource("/iconos/IcoAgregar.png"));
            ImageIcon icoHome = new ImageIcon(getClass().getResource("/iconos/IcoHome.png"));
            ImageIcon icoPersonal = new ImageIcon(getClass().getResource("/iconos/IcoPersonal.png"));

            //Submenu personal
            menuPersonalAltas = new MenuItem(icoAgregar, "Altas", null,0);

            //Submenu inventario
            menuInventarioAltas = new MenuItem(icoAgregar, "Altas", null,0);

            //Asigamos los subemnus a los menus principales (icono, titulo, evento, borde, menus...)
            menuPersonal = new MenuItem(icoPersonal, "Personal", null, 40, menuPersonalAltas);
            menuInventario = new MenuItem(icoInventario, "Inventario", null, 40, menuInventarioAltas);
            menuPrincipal = new MenuItem(icoHome, "Principal", null, 20, menuPersonal, menuInventario);
            
            //Pitamos los menus en el jpanel izquierdo
            pintarMenuItems(menuPrincipal);
        }catch(Exception e){
            System.out.println("Error cargando los menus: "+e);
        }
    }

    private void initHashMap() {
        menusEnMemoria = new HashMap();
        
        //Relacionamos los menus con su vista
        menusEnMemoria.put(menuPrincipal, new VistaPrincipal());
        menusEnMemoria.put(menuPersonalAltas, new formPersonalAltas());
        menusEnMemoria.put(menuInventarioAltas, new formInventarioAltas());
    }

    /*Función que "imprime" los menus en el Jpanel izquierdo llamado "menus"*/
    private void pintarMenuItems(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            menu[i].addMouseListener(this);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                pintarMenuItems(m);
            }
        }
        menus.revalidate();
    }
    
    /*Función que "imprime" los formularios en el Jpanel "panelCuerpo"*/
    private void dibujarVista(JPanel vista){
        vista.setVisible(true);
        this.panelCuerpo.removeAll();
        this.panelCuerpo.add(vista);
        this.panelCuerpo.repaint();
        this.panelCuerpo.revalidate();
    }
    
     /*Función que "controla" cuando se hace click en un menu y cambia la vista*/
    private void controlarVista(MouseEvent e){

        MenuItem tmp = (MenuItem) e.getSource();
        JPanel hashFound = this.menusEnMemoria.get(tmp);

        if (tmp != this.clicked) {

            if (this.clicked != null) {
                this.clicked.resetColor();
            }

            tmp.setColor();
            this.clicked = tmp;

            //Si el menu ya está registrado en el hashmap con su JPanel lo traemos y lo pintamos
            if (hashFound != null) {
                dibujarVista(hashFound);
            }
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        controlarVista(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraLateral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barraSuperior = new javax.swing.JPanel();
        panelCuerpo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraLateral.setBackground(new java.awt.Color(23, 35, 51));

        jScrollPane1.setBackground(new java.awt.Color(23, 35, 51));
        jScrollPane1.setBorder(null);

        menus.setBackground(new java.awt.Color(23, 35, 51));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Abarrotes");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout barraLateralLayout = new javax.swing.GroupLayout(barraLateral);
        barraLateral.setLayout(barraLateralLayout);
        barraLateralLayout.setHorizontalGroup(
            barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(barraLateralLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        barraLateralLayout.setVerticalGroup(
            barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLateralLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(barraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 400));

        barraSuperior.setBackground(new java.awt.Color(71, 120, 197));
        barraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraSuperiorMouseDragged(evt);
            }
        });
        barraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraSuperiorMousePressed(evt);
            }
        });
        barraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 50));

        panelCuerpo.setBackground(new java.awt.Color(255, 255, 255));
        panelCuerpo.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelCuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 480, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /*Funciones para poder mover el programa arrastrando el JPanel superior*/
    int xx, xy;
    private void barraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_barraSuperiorMousePressed

    private void barraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_barraSuperiorMouseDragged
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Abarrotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Abarrotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Abarrotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Abarrotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Abarrotes ab = new Abarrotes();
                ab.setLocationRelativeTo(null);
                ab.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraLateral;
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelCuerpo;
    // End of variables declaration//GEN-END:variables
}
