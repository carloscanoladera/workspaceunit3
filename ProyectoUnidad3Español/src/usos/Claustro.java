package usos;
    class Profesor {

        String nombre;
        String asignatura;
        
        public Profesor() {
        }
    }

    class Alumno {

        String nombre;
        String curso;
        
        public Alumno() {
        }
    }

   class Personal {

        String nombre;
        String curso;
        
        public Personal() {
        }
    }

public class Claustro {
    private Profesor catedratico, titular, rector;
    private Alumno alumno;
    private Personal responsableAdmon;

    // Construcción de los objetos
    // en el constructor de la clase contenedora

    public Claustro(Profesor catedratico, Profesor titular, Profesor rector, Alumno alumno, Personal responsableAdmon) {

        this.catedratico = catedratico;
        this.titular = titular;
        this.rector = rector;
        this.alumno = alumno;
        this.responsableAdmon = responsableAdmon;
    }



}
