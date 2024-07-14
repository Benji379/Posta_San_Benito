package Procesos;

import Modelo.Atencion;
import Modelo.HistoriaPdf;
import Modelo.Paciente;
import Modelo.Usuario;
import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.property.AreaBreakType;
import java.util.ArrayList;

public class HistoriaClinicaPDF {

    private static void generarHistoriaClinica(Document document, HistoriaPdf historiaPdf, String direccionImagen, Color colorFondoEncabezados, Color colorBordes,
            float imagenAncho, float imagenAlto, float imagenTransparencia) throws Exception {
        Atencion atencion = historiaPdf.getAtencion();
        Paciente paciente = historiaPdf.getPaciente();
        Usuario doctor = historiaPdf.getDoctor();

        // Cargar la fuente personalizada
        PdfFont font = PdfFontFactory.createFont("CenturyGothic.ttf", PdfEncodings.WINANSI, true);

        // Agregar la imagen del logo si es necesario
        ImageData logoData = ImageDataFactory.create(direccionImagen);
        Image logo = new Image(logoData);
        logo.scaleToFit(imagenAncho, imagenAlto);
        logo.setFixedPosition((PageSize.A4.getWidth() - imagenAncho) / 2, PageSize.A4.getHeight() - imagenAlto - 50);
        logo.setOpacity(imagenTransparencia);
        document.add(logo);

        // Título del documento
        Paragraph title = new Paragraph("HISTORIA CLINICA - " + paciente.getDni())
                .setTextAlignment(TextAlignment.CENTER)
                .setFontSize(24) // Cambiar el tamaño del título
                .setFont(font) // Asignar la fuente al título
                .setBold();
        document.add(title);
        document.add(new Paragraph("\n"));

        // Información de Identificación
        Table table = new Table(UnitValue.createPercentArray(new float[]{2, 2, 1, 2}))
                .useAllAvailableWidth();
        table.setBorder(new SolidBorder(colorBordes, 1));
        addHeaderCell(table, "IDENTIFICACIÓN", 4, colorFondoEncabezados, colorBordes, font);
        addRow(table, "Fecha y hora:", Proceso.formatDate(atencion.getFecha()) + " " + atencion.getHora(), "Medico:", doctor.getCodigo() + " - " + doctor.getNombres(), colorBordes, font);
        addRow(table, "Documento de ID:", paciente.getDni(), "Nacimiento:", paciente.getFechaNacimiento(), colorBordes, font);
        addRow(table, "Nombres:", paciente.getNombres(), "Especialidad:", atencion.getEspecialidad(), colorBordes, font);
        addRow(table, "Apellido Paterno:", paciente.getApellidoPaterno(), "Apellido Materno:", paciente.getApellidoMaterno(), colorBordes, font);
        addRow(table, "Sexo:", paciente.getSexo(), "Procedencia:", paciente.getProcedencia(), colorBordes, font);
        addRow(table, "Ocupación:", paciente.getOcupacion(), "Escolaridad:", paciente.getEscolaridad(), colorBordes, font);
        addRow(table, "Estado Civil:", paciente.getEstadoCivil(), "# Hijos:", String.valueOf(paciente.getHijos()), colorBordes, font);
        addRow(table, "Grupo Sanguíneo:", paciente.getGrupoSanguineo(), "Rh:", paciente.getRh(), colorBordes, font);
        addRowNoDivision(table, "Residencia:", paciente.getResidencia(), colorBordes, font);
        document.add(table);
        document.add(new Paragraph("\n"));

        // Motivo de Consulta
        addCenteredSectionHeader(document, "MOTIVO DE CONSULTA", atencion.getMotivoConsulta(), colorFondoEncabezados, colorBordes, font);

        // Enfermedad Actual
        document.add(new Paragraph("\n"));
        addCenteredSectionHeader(document, "ENFERMEDAD ACTUAL", atencion.getEnfermedadActual(), colorFondoEncabezados, colorBordes, font);

        // Cualquier otro contenido necesario
        document.add(new Paragraph("\n"));
    }

    public static void generarCitaPdf(ArrayList<HistoriaPdf> historiasPdf, String direccionDescarga, String direccionImagen, Color colorFondoEncabezados, Color colorBordes,
            float imagenAncho, float imagenAlto, float imagenTransparencia) throws Exception {
        PdfWriter writer = new PdfWriter(direccionDescarga);
        PdfDocument pdfDoc = new PdfDocument(writer);
        try (Document document = new Document(pdfDoc, PageSize.A4)) {
            document.setMargins(20, 20, 20, 20);

            for (HistoriaPdf historiaPdf : historiasPdf) {
                generarHistoriaClinica(document, historiaPdf, direccionImagen, colorFondoEncabezados, colorBordes, imagenAncho, imagenAlto, imagenTransparencia);
                // Asegúrate de no añadir una página en blanco al final
                if (historiasPdf.indexOf(historiaPdf) != historiasPdf.size() - 1) {
                    document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
                }
            }
        }
    }

    private static void addHeaderCell(Table table, String content, int colspan, Color backgroundColor, Color borderColor, PdfFont font) {
        Cell cell = new Cell(1, colspan)
                .add(new Paragraph(content).setFont(font))
                .setBackgroundColor(backgroundColor)
                .setTextAlignment(TextAlignment.CENTER)
                .setBold()
                .setBorder(new SolidBorder(borderColor, 1));
        table.addHeaderCell(cell);
    }

    private static void addRow(Table table, String label1, String value1, String label2, String value2, Color borderColor, PdfFont font) {
        addLabelCell(table, label1, borderColor, font);
        addValueCell(table, value1, borderColor, font);
        addLabelCell(table, label2, borderColor, font);
        addValueCell(table, value2, borderColor, font);
    }

    private static void addRow(Table table, String label1, String value1, String label2, String value2, String label3, String value3, Color borderColor, PdfFont font) {
        addLabelCell(table, label1, borderColor, font);
        addValueCell(table, value1, borderColor, font);
        addLabelCell(table, label2, borderColor, font);
        addValueCell(table, value2, borderColor, font);
        addLabelCell(table, label3, borderColor, font);
        addValueCell(table, value3, borderColor, font);
    }

    private static void addRowNoDivision(Table table, String label, String value, Color borderColor, PdfFont font) {
        addLabelCell(table, label, borderColor, font);
        addValueCell(table, value, 3, borderColor, font);
    }

    private static void addLabelCell(Table table, String content, Color borderColor, PdfFont font) {
        Cell cell = new Cell()
                .add(new Paragraph(content).setFont(font))
                .setBorderTop(new SolidBorder(borderColor, 1))
                .setBorderLeft(new SolidBorder(borderColor, 1))
                .setBorderRight(Border.NO_BORDER)
                .setBorderBottom(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);
        table.addCell(cell);
    }

    private static void addLabelCell(Table table, String content, int colspan, Color borderColor, PdfFont font) {
        Cell cell = new Cell(1, colspan)
                .add(new Paragraph(content).setFont(font))
                .setBorderTop(new SolidBorder(borderColor, 1))
                .setBorderLeft(new SolidBorder(borderColor, 1))
                .setBorderRight(Border.NO_BORDER)
                .setBorderBottom(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);
        table.addCell(cell);
    }

    private static void addValueCell(Table table, String content, Color borderColor, PdfFont font) {
        Cell cell = new Cell()
                .add(new Paragraph(content).setFont(font))
                .setBorderTop(new SolidBorder(borderColor, 1))
                .setBorderLeft(Border.NO_BORDER)
                .setBorderRight(new SolidBorder(borderColor, 1))
                .setBorderBottom(new SolidBorder(borderColor, 1))
                .setTextAlignment(TextAlignment.LEFT);
        table.addCell(cell);
    }

    private static void addValueCell(Table table, String content, int colspan, Color borderColor, PdfFont font) {
        Cell cell = new Cell(1, colspan)
                .add(new Paragraph(content).setFont(font))
                .setBorderTop(new SolidBorder(borderColor, 1))
                .setBorderLeft(Border.NO_BORDER)
                .setBorderRight(new SolidBorder(borderColor, 1))
                .setBorderBottom(new SolidBorder(borderColor, 1))
                .setTextAlignment(TextAlignment.LEFT);
        table.addCell(cell);
    }

    private static void addCenteredSectionHeader(Document document, String header, String content, Color backgroundColor, Color borderColor, PdfFont font) {
        Table table = new Table(UnitValue.createPercentArray(new float[]{1})).useAllAvailableWidth();
        Cell cellHeader = new Cell()
                .add(new Paragraph(header)
                        .setBold()
                        .setTextAlignment(TextAlignment.CENTER)
                        .setFont(font))
                .setBackgroundColor(backgroundColor)
                .setBorderTop(new SolidBorder(borderColor, 1))
                .setBorderLeft(new SolidBorder(borderColor, 1))
                .setBorderRight(new SolidBorder(borderColor, 1))
                .setBorderBottom(new SolidBorder(borderColor, 1));
        table.addCell(cellHeader);

        Cell cellContent = new Cell()
                .add(new Paragraph(content).setFont(font))
                .setBorderLeft(new SolidBorder(borderColor, 1))
                .setBorderRight(new SolidBorder(borderColor, 1))
                .setBorderBottom(new SolidBorder(borderColor, 1))
                .setBorderTop(Border.NO_BORDER);
        table.addCell(cellContent);

        document.add(table);
    }
}
