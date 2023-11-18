package modelos;

public class c_usuario {
    String Cedula;
    String Nombre;
    String Fecha_de_nacimiento;
    String Correo;
    String Cuenta;
    String Clave;
    String Genero;

    // ---------------------------------------------------------------------------------------------------------------------------------
    // Contructor vacio
    public c_usuario() {
    }

    // ---------------------------------------------------------------------------------------------------------------------------------
    // Constructores
    public c_usuario(String cedula, String nombre, String fecha_de_nacimiento, String correo, String cuenta,
            String clave, String genero) {
        Cedula = cedula;
        Nombre = nombre;
        Fecha_de_nacimiento = fecha_de_nacimiento;
        Correo = correo;
        Cuenta = cuenta;
        Clave = clave;
        Genero = genero;
    }

    // ---------------------------------------------------------------------------------------------------------------------------------
    // Metodos de acceso
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getFecha_de_nacimiento() {
        return Fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
        Fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String cuenta) {
        Cuenta = cuenta;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String clave) {
        Clave = clave;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    // ---------------------------------------------------------------------------------------------------------------------------------
    // Mostrar todo
    @Override
    public String toString() {
        return "c_usuario [Cedula=" + Cedula + ", Nombre=" + Nombre + ", Fecha_de_nacimiento=" + Fecha_de_nacimiento
                + ", Correo=" + Correo + ", Cuenta=" + Cuenta + ", Clave=" + Clave + ", Genero=" + Genero + "]";
    }

}// Fin del main
