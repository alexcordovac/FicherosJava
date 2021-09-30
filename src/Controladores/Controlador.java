/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import javax.swing.JTextField;

/**
 *
 * @author Alex
 */
public class Controlador {

    public Controlador() {
    }
    
    /*Método que estable el texto de un arreglo de JTextFields en vacio o ""*/
    public void limpiarCampos(JTextField... txtFields) {
        for (JTextField txtField : txtFields) {
            txtField.setText("");
        }
    }

}
