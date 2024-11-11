package TiendaElectronica;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Usuario {
    private String nombreUsuario;
    private String correoElectronico;
    private String direccion;

    // Logger de Log4j
    private static final Logger logger = LogManager.getLogger(Usuario.class);

    public Usuario(String nombreUsuario, String correoElectronico, String direccion) {
        this.nombreUsuario = nombreUsuario;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
    }

    public static void generarUsuarios() {
        // Crear usuario (ejemplo)
        Usuario usuario = new Usuario("juan123", "juan@example.com", "Calle Ficticia 123");
        logger.info("Usuario creado: " + usuario.nombreUsuario + " | Correo: " + usuario.correoElectronico);
    }
}
