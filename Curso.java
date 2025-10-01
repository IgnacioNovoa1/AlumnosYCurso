import java.util.ArrayList;

public class Curso {
    private String nombre;
    private String codigo;
    private ArrayList<Alumno> alumnos;

    public Curso (String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
        this.alumnos = new ArrayList<>();
    }

    public boolean agregarAlumno(Alumno alumno){
        for (Alumno a : alumnos) {
            if (a.getMatricula().equals(alumno.getMatricula())){
                return false;
            }
        }
        alumnos.add(alumno);
        return true;
    }

    public boolean eliminarAlumno(String matricula){
        for (Alumno a : alumnos){
            if (a.getMatricula().equals(matricula));{
                alumnos.remove(a);
                return true;
            }
        }
        return false;
    }
    public boolean perteneceAlumno(String matricula){
        for (Alumno a : alumnos){
            if (a.getMatricula().equals(matricula)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        String texto = "Curso: " + nombre + "(" + codigo + ")\n";
        if (alumnos.isEmpty()){
            texto += "No existen alumnos inscritos. \n";
        } else {
            texto += "Alumnos: \n";
            int i = 1;
            for (Alumno a : alumnos){
                texto += i + ". " + a.getNombre() + " " + a.getApellido() + "\n" + "[Matricula: " + a.getMatricula() + "]\n" + "[Carrera: " + a.getCarrera() + "]\n";
                i++;
            }
        }
        return texto;
    }
    
}