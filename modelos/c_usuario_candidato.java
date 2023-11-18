package modelos;

public class c_usuario_candidato extends c_usuario {

    public c_usuario_candidato(String cedula, String nombre, String fecha_nacimiento, String correo,
            String cuentaCandidato,
            String claveCandidato, String genero) {
        super(cedula, nombre, fecha_nacimiento, correo, cuentaCandidato, claveCandidato, genero);

    }

    public boolean autenticar(String cuentaCandidato, String claveCandidato) {
        // Comparar la cuenta y la clave ingresadas con las almacenadas en la instancia
        return getCuenta().equals(cuentaCandidato) && getClave().equals(claveCandidato);
    }

}
