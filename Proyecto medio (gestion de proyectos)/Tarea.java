import java.util.Date;

public class Tarea{

    //colocamos los atributos

    int idTarea;
    String nombreTarea;
    String descripcion;
    Date fechaVencimiento;

    public Tarea (int idTarea,String nombreTarea, String descripcion, Date fechaVencimiento){
        this.idTarea=idTarea;
        this.nombreTarea=nombreTarea;
        this.descripcion=descripcion;
        this.fechaVencimiento=fechaVencimiento;
    }

    //aplicamos métodos getter and setter

    public int getidTarea(){
        return idTarea; 
    }
    public void setidTarea(int idTarea) { 
        this.idTarea = idTarea; 
    }

    public String getnombreTarea(){
        return nombreTarea; 
    }
    public void setnombreTarea(String nombreTarea) { 
        this.nombreTarea = nombreTarea; 
    }

    public String getdescripcion(){
        return descripcion; 
    }
    public void setdescripcion(String descripcion) { 
        this.descripcion = descripcion;
    }

    public Date getfechaVencimiento(){
        return fechaVencimiento; 
    }
    public void setfechaVencimiento(Date fechaVencimiento) { 
        this.fechaVencimiento = fechaVencimiento; 
    }

    //métodos de estadoTarea

    public void pendiente(){
        System.out.println(nombreTarea + "esta pendiente");
    }

    public void en_progreso(){
        System.out.println(nombreTarea + " esta en progreso");
    }

    public void completada(){
        System.out.println(nombreTarea + "esta completada");
    }

    //métodos de Prioridad
    public void Alta(){
        System.out.println(nombreTarea + "es de alta prioridad");
    }

    public void Media(){
        System.out.println(nombreTarea + "es de media prioridad");
    }

    public void Baja(){
        System.out.println(nombreTarea + "es de baja prioridad");
    }


    public static void main(String[] args){
        Tarea tarea1 = new Tarea(202, "Tarea de algebra", "Esta tarea no se culminó completamente", new Date(125, 4, 27));

        tarea1.en_progreso();

        System.out.println("El nombre de su tarea es: " + tarea1.getnombreTarea());
        System.out.println("La descripcion de su tarea es: " + tarea1.getdescripcion());
        System.out.println("La fecha de vencimiento de su tarea es: " + tarea1.getfechaVencimiento());
        
    }
}