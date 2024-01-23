package usos;
public class Trabajador {

    private String nombre;
    private int edad;
    private int categoria;
    private int antiguedad;

    public Trabajador() {
    }

    public Trabajador(String nombre, int edad, int categoria, int antiguedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.categoria = categoria;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

}
