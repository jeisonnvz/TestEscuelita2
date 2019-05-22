/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionescuelita;

/**
 *
 * @author Eliezer
 */
public class Fruta extends Producto {

    private String unidadDeVenta;

    public Fruta(String nombre, int precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Precio: "
                + this.getPrecio() + " /// Unidad de Venta: " + this.unidadDeVenta;
    }

}
