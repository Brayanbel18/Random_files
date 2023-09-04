package mx.unison;

import java.io.*;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String fileName = "src\\main\\java\\mx\\unison\\vendors.csv";
        //final String fileName = "D:\\data\\vendors-data.csv";

        // Crear una instancia de VendorCSVFile y asignarla a la variable csvFile
        VendorCSVFile csvFile = new VendorCSVFile(fileName);

        Scanner input = new Scanner(System.in);

        System.out.println("Número de empleado a eliminar:");
        int codigoEliminar = input.nextInt();

        // Llama al método delete para eliminar el vendedor con el código proporcionado
        csvFile.delete(codigoEliminar);

        input.close();
    }


}