import teruelfj.model.Alumno;
import teruelfj.model.Asignatura;

public class Main {
    public static void main(String[] args) {
        Asignatura asig = new Asignatura("Progamacion");
        Alumno alu = new Alumno("68639664M","Lucas","Fernandez", asig);
        System.out.println("Asignatura: " + asig);
        System.out.println(alu);
    }
}