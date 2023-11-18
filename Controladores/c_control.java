package Controladores;

import java.awt.Desktop;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import modelos.c_barrio;
import modelos.c_ejes_tematicos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class c_control {
    // -----------------------------------------------------------------------------------------------------------------------------------
    // Lista de los ejes
    public static ArrayList<c_ejes_tematicos> leerListaEjesDesdeArchivo(String rutaArchivo) {
        ArrayList<c_ejes_tematicos> listaEjes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Procesar la línea y crear instancias de c_ejes_tematicos
                String[] partes = linea.split("\t");

                if (partes.length >= 2) {
                    // Crear instancia de c_ejes_tematicos y agregar a la lista
                    int codigoEje = Integer.parseInt(partes[0]);
                    String nombreEje = partes[1];

                    c_ejes_tematicos eje = new c_ejes_tematicos(nombreEje, "", codigoEje);
                    listaEjes.add(eje);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return listaEjes;
    }

    // -----------------------------------------------------------------------------------------------------------------------------------
    // Lista de los barrios
    public static ArrayList<c_barrio> leerListacomunasDesdeBlocDeNotas(String rutaArchivo) {
        ArrayList<c_barrio> listaBarrios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");

                // Verificar si hay suficientes partes para procesar
                if (partes.length >= 4) {
                    // Crear una instancia de c_barrio y establecer sus propiedades
                    String nombreComuna = partes[0];
                    String nombreBarrio = partes[1];
                    int estrato = Integer.parseInt(partes[2]);
                    int codigoBarrio = Integer.parseInt(partes[3]);

                    // Crear instancia de c_barrio y agregar a la lista
                    c_barrio barrio = new c_barrio();
                    barrio.setNombre_barrio(nombreBarrio);
                    barrio.setNombre_Comuna(nombreComuna);
                    barrio.setEstrato(estrato);
                    barrio.setCodigo_Barrio(codigoBarrio);

                    listaBarrios.add(barrio);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return listaBarrios;
    }

    // -----------------------------------------------------------------------------------------------------------------------------------
    // Leer y abrir archivo de los Ejes tematicos y Municipales
    public static void Ejes_Tematicos_y_Municipales(Object object) {
        String nomString = "C:/Users/Crist/OneDrive/Escritorio/Datos que se almacenan/Ejes y Tematicas municipales.txt";

        try {
            Desktop.getDesktop().open(new File(
                    "C:/Users/Crist/OneDrive/Escritorio/Datos que se almacenan/Ejes y Tematicas municipales.txt"));
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace(); // o registra el error
        }
    }

    // -----------------------------------------------------------------------------------------------------------------------------------
    // Leer y abrir archivo de las relaciones de los ejes con el plan de gobierno
    public static void Relaciones_Ejes_plan_gobierno(Object object) {
        String nomString = "C:/Users/Crist/OneDrive/Escritorio/Datos que se almacenan/Relacion del plan de gobierno con los Ejes.txt";

        try {
            Desktop.getDesktop().open(new File(
                    "C:/Users/Crist/OneDrive/Escritorio/Datos que se almacenan/Relacion del plan de gobierno con los Ejes.txt"));
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace(); // o registra el error
        }
    }

    // -----------------------------------------------------------------------------------------------------------------------------------
    // Leer y abrir archivo de los planes de gobierno del candidato 1
    public static void Candidato_1(Object object) {
        String nomString = "C:/Users/Crist/OneDrive/Escritorio/Datos que se almacenan/Plan de Gobierno de Candidato 1.txt";

        try {
            Desktop.getDesktop().open(new File(
                    "C:/Users/Crist/OneDrive/Escritorio/Datos que se almacenan/Plan de Gobierno de Candidato 1.txt"));
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace(); // o registra el error
        }
    }
}
