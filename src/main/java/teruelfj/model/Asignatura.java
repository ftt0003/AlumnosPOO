package teruelfj.model;


public class Asignatura {
    private String nombre;

    public Asignatura(){

    }
    public Asignatura(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return  this.nombre;
    }
}
