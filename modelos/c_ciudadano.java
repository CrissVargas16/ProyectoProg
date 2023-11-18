package modelos;

public class c_ciudadano {

    String Barrio;
    // ---------------------------------------------------------------------------------------------------------------------------------
    // Constructor vacio

    public c_ciudadano() {
    }
    // ---------------------------------------------------------------------------------------------------------------------------------
    // Constructores

    public c_ciudadano(String barrio) {
        Barrio = barrio;
    }
    // ---------------------------------------------------------------------------------------------------------------------------------
    // Metodos de acceso

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String barrio) {
        Barrio = barrio;
    }
    // ---------------------------------------------------------------------------------------------------------------------------------
    // Mostrar Todo

    @Override
    public String toString() {
        return "c_ciudadano [Barrio=" + Barrio + "]";
    }

}// fin del main
