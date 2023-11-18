package Proyecto_final;

import java.util.ArrayList;
import java.util.List;

import Arreglos.c_arr_candidato;
import Controladores.c_control;
import Vistas.Interfaz;
import modelos.c_barrio;
import modelos.c_ejes_tematicos;
import modelos.c_usuario_administrador;
import modelos.c_usuario_candidato;

public class Proyecto_final_programacion {

        public static c_control obj_control = new c_control();
        // -------------------------------------------------------------------------------------------------------------------------------------
        // Objeto administrador
        public static c_usuario_administrador obj_admin = new c_usuario_administrador("1096557489", "Mario",
                        "16/08/1995",
                        "mayito@gmail.com", "MarioP", "12345",
                        "Hombre");
        // -------------------------------------------------------------------------------------------------------------------------------------
        // Crear candidatos dentro del main
        public static c_usuario_candidato candidato1 = new c_usuario_candidato("48766525", "Juan Perez", "15/02/1980",
                        "juanp@gmail.com", "Juan P", "1425", "Hombre");
        public static c_usuario_candidato candidato2 = new c_usuario_candidato("135478965", "Maria Rodriguez",
                        "27/5/1972",
                        "MarR@gmail.com", "Maria R", "4758", "Femenino");
        public static c_usuario_candidato candidato3 = new c_usuario_candidato("17166875", "Juan Gonzales", "17/9/1977",
                        "Juancho@gmail.com", "Juan G", "3167", "Masculino");

        public static void main(String[] args) {
                Interfaz obj_inter = new Interfaz();

                // obj_inter.opcion_P_usu_can();
                obj_inter.opcion_login_interfaz_principal();
        }

        // -------------------------------------------------------------------------------------------------------------------------------------
        // Archivo con la lista de los barrios y comunas
        public static void Barrios(String[] args) {
                String rutaArchivo = "C:/Users/Crist/OneDrive/Escritorio/Datos que se almacenan/Lista de comunas.txt";

                // Llamar al método para leer la lista de comunas desde el bloc de notas
                ArrayList<c_barrio> listaBarrios = c_control.leerListacomunasDesdeBlocDeNotas(rutaArchivo);

        }

        // -------------------------------------------------------------------------------------------------------------------------------------
        // Archivo con la lista de los ejes
        public static void Ejes(String[] args) {
                String rutaArchivo = "C:/Users/Crist/OneDrive/Escritorio/Datos que se almacenan/Ejes y Tematicas municipales.txt";

                // Llamar al método para leer la lista de ejes desde el bloc de notas
                ArrayList<c_ejes_tematicos> listaEjes = c_control.leerListaEjesDesdeArchivo(rutaArchivo);

        }
}// Fin del Main PRINCIPAL
