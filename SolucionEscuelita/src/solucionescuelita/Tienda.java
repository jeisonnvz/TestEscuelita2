/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionescuelita;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeison
 */
public class Tienda {

    private List<Producto> listaDeProductos;

    public Tienda(List<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public String toString() {
        return "=============================";
    }

    public Producto masBarato() {
        return listaDeProductos.stream().min(Producto::compareTo).get();
    }

    public Producto masCaro() {
        return listaDeProductos.stream().max(Producto::compareTo).get();
    }

    public List<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(List<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public static void cargarProductos() {
        List<Producto> compras = new ArrayList<>();
        compras.add(new Gaseosa("Coca-Cola Zero", 20, 1.5));
        compras.add(new Gaseosa("Coca-Cola", 18, 1.5));
        compras.add(new Higiene("Shampoo Sedal", "500ml", 19));
        compras.add(new Fruta("Frutillas", 64, "kilo"));
        Tienda compra = new Tienda(compras);

        for (Producto p : compras) {
            System.out.println(p.toString());

        }
        System.out.println("=============================");
        System.out.println("Producto más caro: " + compra.masBarato().getNombre());
        System.out.println("Producto más Barato: " + compra.masCaro().getNombre());

    }

}
