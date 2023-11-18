package Arreglos;

import java.util.ArrayList;

import modelos.c_usuario_candidato;

public class c_arr_candidato {
    private static ArrayList<c_usuario_candidato> lista_candidatos = new ArrayList<>();

    public static void agregarCandidato(c_usuario_candidato candidato) {
        // Agregar el candidato a la lista
        lista_candidatos.add(candidato);
    }

    public static ArrayList<c_usuario_candidato> getListaCandidatos() {
        return lista_candidatos;
    }

}
