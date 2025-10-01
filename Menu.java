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

            while (!sc.hasNextInt()){
                System.out.println("Debes ingresar un número.");
                sc.next();
                System.out.println("Selecciona una opcion: ");
            }
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

        String nombre;
        do {
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            if (nombre.isBlank()) {
                System.out.println("Debes ingresar un nombre.");
            }
        } while (nombre.isBlank());

        String apellido;
        do {
            System.out.print("Apellido: ");
            apellido = sc.nextLine();
            if (apellido.isBlank()) {
                System.out.println("Debes ingresar un apellido.");
            }
        } while (apellido.isBlank());

        String matricula;
        do {
            System.out.print("Matricula: ");
            matricula = sc.nextLine();
            if (matricula.isBlank()) {
                System.out.println("Debes ingresar una matricula.");
            }
        } while (matricula.isBlank());

        int edad;
        do {
            System.out.print("Edad: ");
            while (!sc.hasNextInt()) {
                System.out.println("Debes ingresar un número entero.");
                sc.next();
                System.out.println("Edad: ");
            }
            edad = sc.nextInt();
            sc.nextLine();
            if ( edad <= 0) {
                System.out.println("Debes ingresar un número positivo.");
            }
        } while (edad <=0);

        String carrera;
        do {
            System.out.print("Carrera: ");
            carrera = sc.nextLine();
            if (carrera.isBlank()) {
                System.out.println("Debes ingresar una carrera.");
            }
        } while (carrera.isBlank());

        Alumno a = new Alumno(nombre, apellido, edad, carrera, matricula);
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
        System.out.println(curso.toString());
    }
}

