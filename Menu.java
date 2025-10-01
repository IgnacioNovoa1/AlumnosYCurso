import java.util.Scanner;

public class Menu {
    private Curso curso;
    private Scanner sc;

    public Menu(){
        this.curso = new Curso("POO", "INF101" );
        this.sc = new Scanner(System.in);
    }

    public void mostrarMenu(){
        int opcion;
        do {
            System.out.println("\n Menú");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Eliminar almuno");
            System.out.println("3. Verificar si alumno pertenece");
            System.out.println("4. Mostrar curso");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1 -> agregarAlumno();
                case 2 -> eliminarAlumno();
                case 3 -> verificarAlumno();
                case 4 -> mostrarCurso();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción invalida.");
            }
        } while (opcion != 0);
    }

    private void agregarAlumno() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Matricula: ");
        String matricula = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Carrera: ");
        String carrera = sc.nextLine();

        Alumno a = new Alumno(nombre, apellido, edad, matricula, carrera);
            if (curso.agregarAlumno(a)){
                System.out.println("Alumno agregado correctamente.");
            } else {
                System.out.println("Ya existe ese alumno.");
            }
    }
    private void eliminarAlumno(){
        System.out.print("Ingrese matricula del alumno a eliminar: ");
        String matricula = sc.nextLine();
        if (curso.eliminarAlumno(matricula)){
            System.out.println("Alumno eliminado.");
        } else {
            System.out.println("No se ha encontrado alumno.");
        }
    }
    private void verificarAlumno(){
        System.out.print("Ingrese matricula del alumno a verificar: ");
        String matricula = sc.nextLine();
        if (curso.perteneceAlumno(matricula)) {
            System.out.println("El alumno pertenece al curso.");
        } else {
            System.out.println("El alumno NO pertence al curso.");
        }
    }
    private void mostrarCurso(){
        System.out.println(curso);
    }
}

