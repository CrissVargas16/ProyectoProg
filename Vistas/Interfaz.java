package Vistas;

import Proyecto_final.Proyecto_final_programacion;
import javax.swing.*;

import Controladores.c_control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz {
    public Interfaz() {

    }

    public int showOptionsVertically(String title, String[] options) {
        JPanel optionPanel = new JPanel();
        optionPanel.setLayout(new BoxLayout(optionPanel, BoxLayout.Y_AXIS));

        for (String option : options) {
            JButton button = new JButton(option);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    handleOptionSelected(option);
                }
            });
            optionPanel.add(button);
        }

        int result = JOptionPane.showConfirmDialog(
                null,
                optionPanel,
                title,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        return result;
    }

    public void handleOptionSelected(String option) {
        // Implement functionality for each button
        switch (option) {
            case "Administrador":
                opcion_princpial_administrador();
                break;
            case "Candidato":
                opcion_princpial_candidato();
                break;
            case "Ciudadano":
                opcion_princpial_ciudadano();
                break;
            case "Ver Reportes":
                break;
        }
    }

    public int opcion_login_interfaz_principal() {
        String[] opciones = {
                "Administrador",
                "Candidato",
                "Ciudadano",
                "Ver Reportes", };

        int selectedOption = showOptionsVertically("Votaciones Alcaldia", opciones);

        return selectedOption;

    }

    // -----------------------------------------------------------------------------------------------------------------------------------

    public int opcion_princpial_ciudadano() { // Variables donde se identifica lo que puede realizar el ciudadano
        int opc = -1;

        Object[] opciones = { "Ver Ejes y Tematicas Municipales", "Ver Pogramas de Gobierno de cada Candidatos",
                "Relacioen de los Ejes y Programas de los Candidatos", "VOLVER" };
        do {
            opc = JOptionPane.showOptionDialog(null,
                    "¡Bienvenido Ciudadano, Que desea conocer o hacer?:\n"
                            + "\n" + "1. Conocer los Ejes y Temanicas Municipales: Conocer informacion\n"
                            + "2. Ver Porgramas de Gobieno y de Los candidatos por individual: Accede a los planes y proyectos\n"
                            + "3. Relaciones de los Candidatos con los Ejes y sus Programas: Explora las relaciones de los ejes con cada programa\n",
                    "LOGIN",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]);

            switch (opc) {
                case 0:

                    break;
                case 1:
                    opciones_candidatos();

                    // Proyecto_final_programacion.obj_relaciones.mostrar_programa_gobierno_candidato();
                    break;
                case 2:
                    c_control.Relaciones_Ejes_plan_gobierno(null);
                    break;
            }
            ;
        } while (opc != 3);

        return opc;

    }// Fin de opciones de Ciudadanos

    private void opciones_candidatos() {
        Object[] opcionesProgramas = { "Candidato 1: Juan Perez", "Candidato 2:",
                "Candidato 3:", "VOLVER" };

        int opcionProgramas = JOptionPane.showOptionDialog(null,
                "Seleccione un candidato para ver el programa de gobierno:",
                "Programas de Gobierno",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, opcionesProgramas, opcionesProgramas[0]);

        // Puedes agregar lógica adicional según la opción seleccionada
        switch (opcionProgramas) {
            case 0:
                c_control.Candidato_1(null);
                break;
        }
    }

    // -----------------------------------------------------------------------------------------------------------------------------------

    public int opcion_princpial_candidato() { // Variable donde se observa lo que puede hacer el candidato
        int opc = -1;

        // Solicitar la cuenta y la clave al candidato
        String cuentaCandidato = JOptionPane.showInputDialog("Ingrese la cuenta del candidato:");
        String claveCandidato = JOptionPane.showInputDialog("Ingrese la clave del candidato:");

        // Autenticar al candidato utilizando los datos predeterminados
        if (Proyecto_final_programacion.candidato1.autenticar(cuentaCandidato, claveCandidato) ||
                Proyecto_final_programacion.candidato2.autenticar(cuentaCandidato, claveCandidato) ||
                Proyecto_final_programacion.candidato3.autenticar(cuentaCandidato, claveCandidato)) {

            // El candidato ha sido autenticado correctamente, permitir acceso
            Object[] opciones = { "Ver Recomendaciones", "Ver valoraciones",
                    "Ver planes de los otros candidatos", "Salir" };

            do {
                opc = JOptionPane.showOptionDialog(null,
                        "¡Bienvenido Candidato, ¿Qué desea consultar?:\n"
                                + "\n"
                                + "Aquí puedes conocer información respecto a cómo va tu candidatura y la opinión pública\n"
                                + "También puedes conocer los planes o propuestas de los otros candidatos",
                        "LOGIN",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null, opciones, opciones[0]);

                switch (opc) {
                    case 0:
                        // Proyecto_final_programacion.obj_control.mostrar_ejes_tematicas();
                        break;
                    case 1:
                        // Proyecto_final_programacion.obj_relaciones.mostrar_programa_gobierno_candidato();
                        break;
                    case 2:
                        // opcion_secundaria_ciudadana_relaciones();
                        break;
                }
            } while (opc != 3);
        } else {
            JOptionPane.showMessageDialog(null, "Cuenta o clave incorrectas. Acceso denegado.");
        }

        return opc;
    }// fin de opciones principales de usu candidado

    // -----------------------------------------------------------------------------------------------------------------------------------

    public int opcion_princpial_administrador() { // Variable donde se observa lo que puede hacer el administrador
        String cuenta = JOptionPane.showInputDialog("Ingrese la cuenta del administrador:");
        String clave = JOptionPane.showInputDialog("Ingrese la clave del administrador:");

        if (Proyecto_final_programacion.obj_admin.autenticar(cuenta, clave)) {
            // El administrador ha sido autenticado correctamente, permitir acceso
            int opc = -1;
            Object[] opciones = { "Cargar Ejes y Temas municipales", "Cargar la lista de los Candidatos",
                    "Cargar Listado de barrios y comunas", "Salir" };
            do {
                opc = JOptionPane.showOptionDialog(null,
                        "¡Bienvenido Administrador, Que desea hacer?:\n"
                                + "\n"
                                + "Aqui puedes gestionar datos fijos respecto a las candidaturas\n"
                                + "Tambien puede subir o cargar archivos de datos faltantes o nuevos",
                        "LOGIN",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null, opciones, opciones[0]);

                switch (opc) {
                    case 0:
                        // Proyecto_final_programacion.obj_control.mostrar_ejes_tematicas();
                        break;
                    case 1:
                        // Proyecto_final_programacion.obj_relaciones.mostrar_programa_gobierno_candidato();
                        break;
                    case 2:
                        // opcion_secundaria_ciudadana_relaciones();
                        break;
                }
                ;
            } while (opc != 3);
        } else {
            JOptionPane.showMessageDialog(null, "Cuenta o clave incorrectas. Acceso denegado.");
        }

        return -1;
    }// fin de opciones principales del administrador
}// Fin del main
