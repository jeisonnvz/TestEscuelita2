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
public class Gaseosa extends Producto {

    private double litros;

    public Gaseosa(String nombre, int precio, double litros) {
        super(nombre, precio);

        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Litros: "
                + this.litros + " /// Precio: $" + this.getPrecio();
    }

}
