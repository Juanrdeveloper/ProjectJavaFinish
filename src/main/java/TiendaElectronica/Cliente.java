package TiendaElectronica;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private List<Venta> ventas;
    private PuntosFidelidad puntosFidelidad;

    // Constructor
    public Cliente(int idCliente, String nombre, String direccion, String telefono, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.ventas = new ArrayList<>();
        this.puntosFidelidad = new PuntosFidelidad(this);
    }

    // Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void asociarVenta(Venta venta) {
        ventas.add(venta);
        // Asignamos puntos por la compra
        puntosFidelidad.asignarPuntos(venta.getTotal());
    }

    // Método para mostrar los puntos de fidelidad.
    public void mostrarPuntos() {
        puntosFidelidad.mostrarSaldo();
    }

    // Método para canjear puntos.
    public void canjearPuntos(int puntos) {
        puntosFidelidad.canjearPuntos(puntos);
    }
}
