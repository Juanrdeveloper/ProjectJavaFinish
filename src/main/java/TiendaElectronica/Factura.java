package TiendaElectronica;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.time.LocalDate;

public class Factura {

    // Método para generar factura PDF
    public static void generarFacturaPDF(Venta venta, List<Producto> productos, String nombreCliente) {
        Document document = new Document();
        try {
            // Definir el nombre y ubicación del archivo PDF
            String rutaFactura = "facturas/factura_" + System.currentTimeMillis() + ".pdf";
            PdfWriter.getInstance(document, new FileOutputStream(rutaFactura));

            // Abrir el documento para agregar contenido
            document.open();

            // Agregar título
            document.add(new Paragraph("Factura - Tienda de Electrónica"));
            document.add(new Paragraph("Fecha de emisión: " + LocalDate.now()));
            document.add(new Paragraph("Cliente: " + nombreCliente));
            document.add(new Paragraph("Email: " + venta.getNombreCliente()));

            // Crear tabla PDF
            PdfPTable table = new PdfPTable(4);  // 4 columnas en la tabla
            table.setWidthPercentage(100);  // Ajustar el tamaño al 100% del ancho de la página

            // Definir las celdas de la tabla (encabezado)
            PdfPCell cell = new PdfPCell(new Phrase("Producto"));
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("Cantidad"));
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("Precio Unitario"));
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("Precio Total"));
            table.addCell(cell);

            // Llenar la tabla con los productos
            for (Producto producto : productos) {
                table.addCell(producto.getNombreProducto());
                table.addCell(String.valueOf(producto.getCantidadStock()));
                table.addCell(String.valueOf(producto.getPrecio()));
                table.addCell(String.valueOf(producto.getPrecio() * producto.getCantidadStock()));
            }

            // Agregar tabla al documento
            document.add(table);

            // Agregar total de la venta
            document.add(new Paragraph("Total de la venta: " + venta.getTotal()));

            // Cerrar el documento PDF
            document.close();
            System.out.println("Factura generada correctamente: " + rutaFactura);

        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
