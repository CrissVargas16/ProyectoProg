package modelos;

public class c_barrio {
    int Codigo_Barrio;
    String Nombre_barrio;

    // ---------------------------------------------------------------------------------------------------------------------------------
    // Constructor vacio
    public c_barrio() {
    }

    // ---------------------------------------------------------------------------------------------------------------------------------
    // Constructores
    public c_barrio(int codigo_Barrio, String nombre_barrio) {
        Codigo_Barrio = codigo_Barrio;
        Nombre_barrio = nombre_barrio;
    }
    // ---------------------------------------------------------------------------------------------------------------------------------
    // Metodos de acceso

    public int getCodigo_Barrio() {
        return Codigo_Barrio;
    }

    public void setCodigo_Barrio(int codigo_Barrio) {
        Codigo_Barrio = codigo_Barrio;
    }

    public String getNombre_barrio() {
        return Nombre_barrio;
    }

    public void setNombre_barrio(String nombre_barrio) {
        Nombre_barrio = nombre_barrio;
    }
    // ---------------------------------------------------------------------------------------------------------------------------------
    // Mostrar Todo

    @Override
    public String toString() {
        return "c_barrio [Codigo_Barrio=" + Codigo_Barrio + ", Nombre_barrio=" + Nombre_barrio + "]";
    }

    public void setNombre_Comuna(String nombreComuna) {
    }

    public void setEstrato(int estrato) {
    }

}// fin del main
