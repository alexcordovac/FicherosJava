/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Inventario;
import Modelos.Personal;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class ArchivoUtiles {

    String dirActual;

    public ArchivoUtiles() {
        dirActual = System.getProperty("user.dir");
    }

    /*Método para guardar en archivo una cadena de texto. En los modelos (Personal e Inventario)
    se sobrescribió el método toString a fin de que devuelva algo como:
        Personal            Inventario
        Alex                Sabritas
        22                  Doritos
        0000000             10
     */
    public void guardar(String dato) throws IOException, NullPointerException{
        /*La fecha se hace con el propósito de que el nombre de cada archivo que se guarde sea único*/
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String fecha = dtf.format(now);

        FileWriter fileWr = null;
        String ruta = "";
        
        //Si el usuario no indica el nombre del archivo o presiona "cancelar"
        String nombreArchivo = JOptionPane.showInputDialog("Nombre del archivo");
        if(nombreArchivo == null || ("".equals(nombreArchivo))) throw new NullPointerException();
        
        /*Se crea el archivo*/
        try {
            ruta = dirActual + "\\" + nombreArchivo.replaceAll("[^a-zA-Z0-9\\s]", "-") + " " + fecha.replaceAll("[:\\/]", "-") + ".txt";
            fileWr = new FileWriter(ruta);
        } catch (IOException ex) {
            throw new IOException();
        }

        /*Se escribe la información en el archivo*/
        try {
            BufferedWriter escritor = new BufferedWriter(fileWr);
            escritor.write(dato);
            escritor.close();
        } catch (IOException ex) {
             throw new IOException();
        }

        JOptionPane.showMessageDialog(null, "Archivo guardado correctamente en:\n" + ruta);
    }

    /*Método para abrir un archivo*/
    public Object abrir() throws Exception {
        /*En esta lista guardaremos las palabras*/
        ArrayList<String> lista = new ArrayList<>();

        File archivo;
        JFileChooser fc = new JFileChooser(dirActual);
        int fcResult = fc.showOpenDialog(null);
        archivo = fc.getSelectedFile();
        
         //Si no se seleccionó archivo o se pulsó el botón cancelar
        if(archivo==null|| fcResult == JFileChooser.CANCEL_OPTION) throw new NullPointerException();

        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        /*Leemos las lineas y las guardamos en la lista*/
        String linea;
        while (((linea = br.readLine()) != null)) {
            lista.add(linea);
        }

        /*Si encontró texto en el archivo entonces el primer elemento de la lista
        se refiere si es Personal o Inventario*/
        if (lista.size() > 0) {
            switch (lista.get(0)) {
                case "Personal":
                    return new Personal(lista.get(1), Integer.parseInt(lista.get(2)), lista.get(3));
                case "Inventario":
                    return new Inventario(lista.get(1), lista.get(2), Double.parseDouble(lista.get(3)));
            }
        }else{
            throw new NullPointerException();
        }
        return null;
    }

    /*Método para eliminar un archivo de texto*/
    public void eliminar() throws Exception {
        JFileChooser fc = new JFileChooser(dirActual);
        int resultado = fc.showOpenDialog(null);
        File archivo = fc.getSelectedFile();
        
        //Si no se seleccionó archivo o se pulsó el botón cancelar
        if(archivo==null || resultado == JFileChooser.CANCEL_OPTION) return;
        
        String tipoArchivo = obtenerExtension(archivo.getPath());
        if (tipoArchivo.equalsIgnoreCase("txt")) {
            if (archivo.delete()) {
                JOptionPane.showMessageDialog(null, "Archivo eliminado satisfactoriamente");
            } else {
                throw new Exception();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Advertencia: El archivo no es de texto (txt), no se ha eliminado.");
        }
    }

    /*Método para obtener la extensión de un archivo*/
    private String obtenerExtension(String archivo) {
        if (archivo.isEmpty()) {
            return "";
        }
        String fileName = new File(archivo).getName();
        int dotIndex = fileName.lastIndexOf('.');
        return (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);
    }

    public void renombrar() throws Exception, NullPointerException {
        JFileChooser fc = new JFileChooser(dirActual);
        int resultado = fc.showOpenDialog(null);
        File archivo = fc.getSelectedFile();
        
        //Si no se seleccionó archivo o se pulsó el botón cancelar
        if(archivo==null || resultado == JFileChooser.CANCEL_OPTION) return;
        
        String nombreArchivo = JOptionPane.showInputDialog("Nombre del archivo");
        
        //Si el nombre del archivo es vacío
        if(nombreArchivo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nombre no ingresado");
            return;
        }
        nombreArchivo = nombreArchivo.replaceAll("[^a-zA-Z0-9\\s]", "-")+".txt";
        File nvoArchivo = new File(nombreArchivo);
        boolean correcto = archivo.renameTo(nvoArchivo);
        
        if (correcto == true) {
            JOptionPane.showMessageDialog(null, "Archivo renombrado correctamente\n"+nvoArchivo.getPath());
        } else {
            throw new Exception();
        }
    }

}
