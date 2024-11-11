package TiendaElectronica;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class VerificarFactura {

    // Leer y verificar contenido del archivo PDF
    public static void verificarFactura(String rutaFactura) {
        try {
            // Cargar el archivo PDF
            PDDocument document = PDDocument.load(new File(rutaFactura));

            // Usar PDFTextStripper para extraer el texto
            PDFTextStripper stripper = new PDFTextStripper();
            String texto = stripper.getText(document);

            // Imprimir el contenido del PDF
            System.out.println("Contenido de la factura: ");
            System.out.println(texto);

            // Aquí puedes agregar verificaciones específicas, por ejemplo:
            if (texto.contains("Factura") && texto.contains("Total de la venta:")) {
                System.out.println("La factura contiene la información esperada.");
            } else {
                System.out.println("La factura no contiene todos los detalles.");
            }

            // Cerrar el documento PDF
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

