public class Alumno {
    private String nombre;
    private String apellido;
    private int edad ;
    private String carrera;
    private String matricula;

    public Alumno(){
        this.nombre = "Alumno";
        this.apellido = "Alumno";
        this.edad = NULL;
        this.carrera = NULL;
        this.matricula = NULL;
    }

    public Alumno(String nombre, String apellido, int edad, String carrera, String matricula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.matricula = matricula;
    }
    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public String getCarrera(){
        return carrera;
    }
    public String getMatricula(){
        return matricula;
    }
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    //ToString para la clase Alumno
    @Override
    public String toString(){
        return "Alumno "+ nombre ":"
        "Apellido: " + apellido
        "Edad: " + edad
        "Carrera: " + carrera
        "Matricula: " + matricula;
    }
}

