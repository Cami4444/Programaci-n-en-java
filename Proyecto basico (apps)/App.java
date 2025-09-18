import java.util.ArrayList;
import java.util.Scanner;

class Tarea {
    private String nombre;
    private String descripcion;
    private boolean completada;

    public string getnombre(){
        return nombre;
    }
    public void setnombre(string nombre){
        this.nombre = nombre;
    }
    public string  getdescripcion(){
        return descripcion;
    }
    public void setdescripcion(string descripcion){
        this.descripcion = descripcion;
    }
    public  boolean getcompletada(){
        return completada;
    }
    public void setcompletada(boolean completada){
        this.completada=completada;
    }

    // Método para marcar como completada
    public void completar() {
        this.completada = true;
    }

    @Override
    public String toString() {
        return (completada ? "[X] " : "[ ] ") + nombre + ": " + descripcion;
    }
}

class GestorDeTareas {
    private ArrayList<Tarea> tareas = new ArrayList<>();

    public void agregarTarea(String nombre, String descripcion) {
        tareas.add(new Tarea(nombre, descripcion));
        System.out.println("Tarea agregada!");
    }

    public void listarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas.");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }
    }

    public void completarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.get(indice).completar();
            System.out.println("Tarea completada!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
            System.out.println("Tarea eliminada!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorDeTareas gestor = new GestorDeTareas();

        while (true) {
            System.out.println("\n--- Gestor de Tareas ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Completar tarea");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la tarea: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    gestor.agregarTarea(nombre, descripcion);
                    break;
                case 2:
                    gestor.listarTareas();
                    break;
                case 3:
                    System.out.print("Número de tarea a completar: ");
                    int completar = scanner.nextInt() - 1;
                    gestor.completarTarea(completar);
                    break;
                case 4:
                    System.out.print("Número de tarea a eliminar: ");
                    int eliminar = scanner.nextInt() - 1;
                    gestor.eliminarTarea(eliminar);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
