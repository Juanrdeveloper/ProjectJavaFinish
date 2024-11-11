package TiendaElectronica;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Producto {
    private String nombreProducto;
    private double precio;
    private int cantidadStock;

    // Constructor
    public Producto(String nombreProducto, double precio, int cantidadStock) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    // Getters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }
}
