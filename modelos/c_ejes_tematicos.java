package modelos;

public class c_ejes_tematicos {
    String Nombre_tematico;
    String Componentes;
    int Numero_tema;

    // ---------------------------------------------------------------------------------------------------------------------------------
    // Contructor vacio
    public c_ejes_tematicos() {
    }

    // ---------------------------------------------------------------------------------------------------------------------------------
    // Constructores
    public c_ejes_tematicos(String nombre_tematico, String componentes, int numero_tema) {
        Nombre_tematico = nombre_tematico;
        Componentes = componentes;
        Numero_tema = numero_tema;
    }

    // ---------------------------------------------------------------------------------------------------------------------------------
    // Metodos de acceso
    public String getNombre_tematico() {
        return Nombre_tematico;
    }

    public void setNombre_tematico(String nombre_tematico) {
        Nombre_tematico = nombre_tematico;
    }

    public String getComponentes() {
        return Componentes;
    }

    public void setComponentes(String componentes) {
        Componentes = componentes;
    }

    public int getNumero_tema() {
        return Numero_tema;
    }

    public void setNumero_tema(int numero_tema) {
        Numero_tema = numero_tema;
    }

    // ---------------------------------------------------------------------------------------------------------------------------------
    // Mostrar Todo
    @Override
    public String toString() {
        return "c_ejes_tematicos [Nombre_tematico=" + Nombre_tematico + ", Componentes=" + Componentes
                + ", Numero_tema=" + Numero_tema + "]";
    }

}// fin del main
