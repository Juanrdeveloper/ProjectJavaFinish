package TiendaElectronica;

import java.util.List;
import java.util.ArrayList;

public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private List<Producto> productos;

    public Proveedor(int idProveedor, String nombre, String direccion, String telefono, String email) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.productos = new ArrayList<>();
    }

    public int getIdProveedor() { return idProveedor; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }

    public void setIdProveedor(int idProveedor) { this.idProveedor = idProveedor; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setEmail(String email) { this.email = email; }

    public void asociarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println("ID Producto: " + producto.getId() + " - " + producto.getNombre());
        }
    }
}

