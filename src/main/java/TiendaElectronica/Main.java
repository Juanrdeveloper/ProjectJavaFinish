package TiendaElectronica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear algunos productos de ejemplo
        Producto producto1 = new Producto("Laptop", 500.00, 1);
        Producto producto2 = new Producto("Smartphone", 300.00, 2);
        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);

        // Crear una venta
        Venta venta = new Venta("Juan Perez", 1100.00); // Total de la venta

        // Generar factura en PDF
        Factura.generarFacturaPDF(venta, productos, "Juan Perez");

        // Verificar el contenido de la factura generada
        VerificarFactura.verificarFactura("facturas/factura_" + System.currentTimeMillis() + ".pdf");
    }
}

