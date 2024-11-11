package TiendaElectronica;

import java.time.LocalDateTime;
import java.util.List;

public class Promocion {
    private int idPromocion;
    private String descripcion;
    private double descuento;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private List<Producto> productos;

    public Promocion(int idPromocion, String descripcion, double descuento, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        this.idPromocion = idPromocion;
        this.descripcion = descripcion;
        this.descuento = descuento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.productos = productos;
    }

    // Métodos Getters y Setters
    public void aplicarDescuento(Producto producto) {
        if (productos.contains(producto)) {
            double precioConDescuento = producto.getPrecio() * (1 - descuento / 100);
            producto.setPrecio(precioConDescuento);
        }
    }

    public boolean estaVigente() {
        LocalDateTime now = LocalDateTime.now();
        return now.isAfter(fechaInicio) && now.isBefore(fechaFin);
    }
}

