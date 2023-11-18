package modelos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class c_usuario_administrador extends c_usuario {

    public c_usuario_administrador(String cedula, String nombre, String fecha_de_nacimiento, String correo,
            String cuenta,
            String clave, String genero) {
        super(cedula, nombre, fecha_de_nacimiento, correo, cuenta, clave, genero);

    }

    public boolean autenticar(String cuenta, String clave) {
        return this.getCuenta().equals(cuenta) && this.getClave().equals(clave);
    }

}// fin del main
