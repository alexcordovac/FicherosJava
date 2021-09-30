/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Alex
 */
public class Inventario {
    String marca;
    String producto;
    double precio;
    
    /*Constructors*/
    public Inventario() {
    }

    public Inventario(String marca, String producto, double precio) {
        this.marca = marca;
        this.producto = producto;
        this.precio = precio;
    }
    
    /*Getters and Setters*/
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Inventario\n"+marca + "\n" +producto+ "\n"+ precio;
    }
    
}
