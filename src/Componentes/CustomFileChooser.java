package Componentes;

import jnafilechooser.api.JnaFileChooser;

public class CustomFileChooser {

    public static String chooseFile(java.awt.Window parentWindow, String defaultName, String extension, String titulo) {
        try {
            JnaFileChooser fileChooser = new JnaFileChooser();
            fileChooser.addFilter(titulo, extension);
            fileChooser.setMultiSelectionEnabled(false); // Cambia a true si deseas habilitar la selecci�n m�ltiple
            fileChooser.setMode(JnaFileChooser.Mode.Files); // Cambia el modo seg�n tus necesidades
            // Establece el nombre de archivo por defecto
            if (defaultName != null && !defaultName.isEmpty()) {
                fileChooser.setDefaultFileName(defaultName + "." + extension);
            }
            boolean save = fileChooser.showOpenDialog(parentWindow);

            if (save) {
                String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();
//            System.out.println("Archivo seleccionado: " + selectedFilePath);
                return selectedFilePath;
            } else {
//            System.out.println("Selecci�n de archivo cancelada.");
                return null;
            }
        } catch (Exception e) {
        }
        return null;
    }

//    public static void main(String[] args) {
//        String defaultFileName = "archivo_excel";
//        String fileExtension = "xlsx"; // Cambia la extensi�n si es necesario
//
//        String selectedFilePath = CustomFileChooser.chooseFile(defaultFileName, fileExtension);
//        System.out.println(selectedFilePath);
//    }
}
