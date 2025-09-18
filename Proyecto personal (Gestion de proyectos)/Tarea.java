import java.util.Date;

public class Tarea{

    //colocamos los atributos

    int idTarea;
    String nombreTarea;
    String descripcion;
    String estadoTarea;
    String prioridad;
    Date fechaVencimiento;

    public Tarea (int idTarea,String nombreTarea, String descripcion, String estadoTarea, String prioridad, Date fechaVencimiento){
        this.idTarea=idTarea;
        this.nombreTarea=nombreTarea;
        this.descripcion=descripcion;
        this.estadoTarea=estadoTarea;
        this.prioridad=prioridad;
        this.fechaVencimiento=fechaVencimiento;
    }

    //aplicamos métodos getter and setter

    public int getidProyecto(){return getidProyecto(); }
    public void setidTarea(int idTarea) { this.idTarea = idTarea; }

    public String getnombreTarea(){return nombreTarea; }
    public void setnombreTarea(String nombreTarea) { this.nombreTarea = nombreTarea; }

    public String getdescripcion(){return descripcion; }
    public void setdescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getestadoTarea(){return estadoTarea; }
    public void setestadoTarea(String estadoTarea) { this.estadoTarea = estadoTarea; }

    public String getprioridad(){return prioridad; }
    public void setprioridad(String prioridad) { this.prioridad = prioridad; }

    public Date getfechaVencimiento(){return fechaVencimiento; }
    public void setfechaVencimiento(Date fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    public void datos_tarea (){
        System.out.println("El id de su tarea es: " + idTarea);
        System.out.println("El nombre de su tarea es: " + nombreTarea);
        System.out.println("La descripcion de su tarea es: " + descripcion);
        System.out.println("El estado de su tarea es: " + estadoTarea);
        System.out.println("La prioridad de su tarea es: " + prioridad);
        System.out.println("La fecha de vencimiento de su tarea es: " + fechaVencimiento);
    }
}