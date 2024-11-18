package teruelfj.model;

public class Alumno {
    private String dni;
    private String nombre;
    private String apellido;
    private Asignatura asignatura;


    public Alumno(String dni,String nombre,String apellido, Asignatura asignatura){
        if (Validator.dniValidator(dni)){
            this.dni = dni;
            this.nombre = nombre;
            this.apellido = apellido;
            this.asignatura = asignatura;
        }

    }
    public String getDni(){
        return this.dni;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public Asignatura getAsignatura(){
        return this.asignatura;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setAsignatura(Asignatura asignatura){
        this.asignatura = asignatura;
    }
    @Override
    public String toString(){
        return "DNI: " + this.dni + "\n" + "Nombre: " + this.nombre + "\nApellido: " +
                this.apellido + "\n" + "Asignatura: " + this.asignatura;
    }
}
