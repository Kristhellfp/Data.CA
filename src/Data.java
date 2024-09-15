import java.util.ArrayList;
import java.util.List;

public class Data {
    public static ArrayList<Alumno> listaDeAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Alejandra", "Rodríguez", 18));
        alumnos.add(new Alumno("Josué", "Castillo", 25));
        alumnos.add(new Alumno("Vanessa", "Herrera", 20));
        alumnos.add(new Alumno("Diego", "Paz", 21));
        alumnos.add(new Alumno("Sebastián", "Mendoza", 22));

        return alumnos;
    }
}
