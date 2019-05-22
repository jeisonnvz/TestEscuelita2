/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionescuelita;
public class Producto implements Comparable <Producto>{
	private String nombre;
	private int precio;
	
	public Producto(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

        @Override
    public int compareTo(Producto o) {   
		return o.precio - this.precio;
    }
    @Override
    public String toString() {
        return "nombre=" + nombre + ", precio=" + precio ;
    }
}
