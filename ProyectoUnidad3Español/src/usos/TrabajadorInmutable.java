package usos;
public class TrabajadorInmutable {

    private  String nombre;
    private  int edad;
    private  int categoria;
    private  int antiguedad;

    public TrabajadorInmutable() {
    }

    public TrabajadorInmutable(String nombre, int edad, int categoria, int antiguedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.categoria = categoria;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }


    public int getCategoria() {
        return categoria;
    }


    public int getAntiguedad() {
        return antiguedad;
    }

}
