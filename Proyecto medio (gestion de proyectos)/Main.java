import java.util.Date;

public class Main{
    public static void main(String[] args){
        Proyecto proyecto1 = new Proyecto (1,"proyecto1", "Descripcion del proyecto", new Date(), new Date(), Estado.Proyecto.ACTIVO);
        Tarea tarea1 = new Tarea(1, "Tarea 1", "Descripción de la Tarea 1", EstadoTarea.PENDIENTE, Prioridad.ALTA, new Date());
        Tarea tarea2 = new Tarea(2, "Tarea 1", "Descripción de la Tarea 2", EstadoTarea.COMPLETADA, Prioridad.BAJA, new Date());
        Usuario usuario1 = new Usuario(19201656, "Edgar Smith", "edgarsmith@gmail.com", rolAdmin);
        Usuario usuario2 = new Usuario(20564856, "Alicia Polo", "alicepolo@gmail.com", rolDesarrollador);
        Rol rolAdmin = new Rol(1, "Administrador", "Todos los permisos");
        Rol rolDesarrollador = new Rol(2, "Administrador", "Permisos de desarrollador");
    
        proyecto.agregarTarea(tarea1);
        proyecto.agregarTarea(tarea2);

        System.out.println("Proyecto: " + proyecto.getNombreProyecto());
        System.out.println("Estado: " + proyecto.getEstado());
        System.out.println("Tareas:");

        for (Tarea tarea : proyecto.obtenerTareas()) {
            System.out.println("- " + tarea.getNombreTarea() + " (" + tarea.getEstadoTarea() + ")");
        }
    }
}