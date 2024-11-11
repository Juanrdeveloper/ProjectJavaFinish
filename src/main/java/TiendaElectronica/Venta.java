package TiendaElectronica;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Venta {
    String nombreCliente;
    double total;

    // Constructor
    public Venta(String nombreCliente, double total) {
        this.nombreCliente = nombreCliente;
        this.total = total;
    }

    // Getters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getTotal() {
        return total;
    }
}
