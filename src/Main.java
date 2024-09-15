import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = Data.listaDeAlumnos();
        for (Alumno cadaAlumno : alumnos) {
            System.out.println(cadaAlumno);
        }
    }
}