package mx.unison;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Busqueda {
    public static void main(String[] args) {
        String palabraBuscada = "Missouri"; // La palabra que deseas buscar
        String archivoDat = "src\\main\\java\\mx\\unison\\vendors-data.dat";

        try (FileInputStream fis = new FileInputStream(archivoDat);
             InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {

            String linea;
            while ((linea = br.readLine()) != null) {
                // Eliminar caracteres no imprimibles y controlar que la línea contenga la palabra buscada
                String lineaLimpia = eliminarCaracteresNoImprimibles(linea);
                if (lineaLimpia.contains(palabraBuscada)) {
                    // La palabra buscada se encuentra en esta línea
                    System.out.println("Línea encontrada: " + lineaLimpia);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String eliminarCaracteresNoImprimibles(String input) {
        return input.replaceAll("[^\\x20-\\x7E]", ""); // Eliminar caracteres no imprimibles
    }
}
