/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionescuelita;

/**
 *
 * @author Jeison Narvaez
 */
public class Higiene extends Producto {

    private String contenido;

    public Higiene(String nombre, String contenido, int precio) {
        super(nombre, precio);
        this.contenido = contenido;

    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Contenido: "
                + this.contenido + " /// Precio: $" + this.getPrecio();

    }

}
