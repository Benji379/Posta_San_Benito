package Procesos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Proceso {

    public static void mostrarPanel(JPanel contenedor, JPanel panel) {
//        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(contenedor);
        contenedor.removeAll();
//        contenedor.setSize(0, 0);
        contenedor.add(panel, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

    public static String FECHA_ACTUAL() {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(fecha);
    }

    public static Date fecha(String dateString) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            formatter.setLenient(false);  // Esto hace que el analizador sea estricto en el análisis de fechas
            return formatter.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Error de conversion de fecha: " + e.getMessage());
        }
        return null;
    }

    public static boolean validoSinEspacios(String... txt) {
        for (String t : txt) {
            if (t == null || t.trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static void limitacionNumeros(JTextField txtField, KeyEvent evt, int CantNumeros) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean espacio = key == KeyEvent.VK_SPACE;
        if (!numeros || espacio) {
            evt.consume();
        } else {
            if (txtField.getText().length() >= CantNumeros) {
                evt.consume();
            }
        }
    }

    public static void error(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static int confirmacion(String mensaje) {
        int confirmacion = JOptionPane.showConfirmDialog(null, mensaje, "Confirmacion", 0, JOptionPane.WARNING_MESSAGE);
        return confirmacion;
    }

    public static void ventanaEmergente(JPanel panel, String titulo, int alto, int ancho) {
        JDialog dialog = new JDialog();
        panel.repaint();
        panel.revalidate();
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setSize(alto, ancho);
        dialog.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        dialog.setModal(true); // Hacer que el diálogo sea modal (bloquear otras interacciones)
        dialog.setContentPane(panel); // Establecer el JPanel recibido como contenido del JDialog
        dialog.setTitle(titulo);
//        dialog.setResizable(false);
        dialog.setDefaultCloseOperation(0);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                int result = Proceso.confirmacion("Confirmar cierre");
                if (result == 0) {
                    dialog.setVisible(false);
                }
            }
        });
        dialog.setVisible(true); // Mostrar el JDialog
    }

    // Método que convierte un texto a mayúsculas
    public static String mayuscula(String texto) {
        // Verifica si el texto no es nulo para evitar errores
        if (texto == null) {
            return null;
        }
        // Convierte el texto a mayúsculas y lo retorna
        return texto.toUpperCase();
    }

    public Icon icono(String path, int width, int heigth) {
        path = "/Img/" + path;
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    public Icon icono(String path) {
        path = "/Img/" + path;
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    public static void mensaje(String mensaje, String nombreIcono) {
        JOptionPane.showMessageDialog(null, mensaje, "Mensaje", JOptionPane.INFORMATION_MESSAGE, new Proceso().icono(nombreIcono));
    }

    public static void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void vaciarTextFields(JTextField... txt) {
        for (JTextField t : txt) {
            t.setText("");
        }
    }

    public static Object input(String mensaje) {
        Object dato = JOptionPane.showInputDialog(null, mensaje, "Input", JOptionPane.INFORMATION_MESSAGE, new Proceso().icono("buscar.png"), null, null);
        return dato;
    }
    // Método que retorna la fecha y hora en un solo String en el formato especificado

    public static String getDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ssa");
        return now.format(formatter);
    }

    // Método que retorna solo la hora en el formato especificado
    public static String getTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ssa");
        return now.format(formatter);
    }

    public static String evitarNull(Object dato) {
        if (dato == null) {
            return "";
        } else {
            return dato.toString();
        }
    }

    public static String formatDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(date);
    }

    public static void abrirArchivo(String filePath) {
        if (Desktop.isDesktopSupported()) {
            try {
                File file = new File(filePath);
                Desktop.getDesktop().open(file);
            } catch (IOException ex) {
                Proceso.error("Error al abrir el archivo: " + ex.getMessage());
            }
        } else {
            Proceso.error("No se puede abrir el archivo, la función de escritorio no es compatible.");
        }
    }
}
