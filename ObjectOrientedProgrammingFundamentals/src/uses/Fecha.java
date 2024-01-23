package uses;
public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        dia = 1;
        mes = 1;
        anio = 2019;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    //Metodo público, que devuelva true  si el mes está comprendido entre 1 y 12; en caso contrario devuelve false. 
    public boolean mesCorrecto() {
        return (mes >= 1 && mes <= 12) ? true : false;
    }

    //Metodo público, que devuelva el nombre del mes. Si el mes es 1 devuelve “Enero”, si es 2 devuelve “Febrero”, si es 3 devuelve “Marzo”, etc, y a si sucesivamente. Si no tiene un valor de 1 a 12 que devuelva “Error”. 
    public String nombreMes() {
        String nombre;
        nombre =  switch (mes) {
        
        case 1 -> "Enero";
        case 2 ->  "Febrero";
        case 3 ->"Marzo" ;
        case 4 -> "Abril" ;
        case 5 -> "Mayo" ;
        case 6 ->   "Junio" ;
        case 7 ->   "Julio" ;
        case 8 ->   "Agosto" ;
        case 9 ->   "Septiembre" ;
        case 10 ->  "Octubre";
        case 11 -> "Noviembre";
        case 12 ->  "Diciembre";
        default -> "Error";

        };
        return nombre;
    }

//Método público que devuelva la fecha en formato String, por ejemplo si el día es 29, el mes s es 1 y el año es 2020, este método debe devolver: “29 de Enero de 2020”. 
    public String laFechaEs() {
        return dia + " del mes de " + nombreMes() + " de " + anio;
    }

}