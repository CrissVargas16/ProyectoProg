package modelos;

public class c_comuna {
    String Nombre_Comuna;
    int Estrato;

    // ---------------------------------------------------------------------------------------------------------------------------------
    // Constructor vacio
    public c_comuna() {
    }

    // ---------------------------------------------------------------------------------------------------------------------------------
    // Constructores
    public c_comuna(String nombre_Comuna, int estrato) {
        Nombre_Comuna = nombre_Comuna;
        Estrato = estrato;
    }
    // ---------------------------------------------------------------------------------------------------------------------------------
    // Metodos de acceso

    public String getNombre_Comuna() {
        return Nombre_Comuna;
    }

    public void setNombre_Comuna(String nombre_Comuna) {
        Nombre_Comuna = nombre_Comuna;
    }

    public int getEstrato() {
        return Estrato;
    }

    public void setEstrato(int estrato) {
        Estrato = estrato;
    }

    // ---------------------------------------------------------------------------------------------------------------------------------
    // Mostrar Todo

    @Override
    public String toString() {
        return "c_comuna [Nombre_Comuna=" + Nombre_Comuna + ", Estrato=" + Estrato + "]";
    }

}// Fin del main
