import java.util.Date;

public class Proyecto{

    //colocamos los atributos

    int idProyecto;
    String nombreProyecto;
    String descripcion;
    Date fechaInicio;
    Date fechaFin;
    
    public Proyecto(int idProyecto, String nombreProyecto, String descripcion, Date fechaInicio, Date fechaFin){
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    //aplicamos el método getter and setter

    public int getidProyecto(){
        return idProyecto; 
    }
    public void setidProyecto(int idProyecto) { 
        this.idProyecto = idProyecto; 
    }

    public String getnombreProyecto(){
        return nombreProyecto; 
    }
    public void setnombreProyecto(String nombreProyecto){ 
        this.nombreProyecto = nombreProyecto; 
    }

    public String getdescripcion(){
        return descripcion; 
    }
    public void setdescripcion(String descripcion){ 
        this.descripcion = descripcion; 
    }

    public Date getfechaInicio(){
        return fechaInicio; 
    }
    public void setfechaInicio(Date fechaInicio){ 
        this.fechaInicio = fechaInicio; 
    }

    public Date getfechaFin(){
        return fechaFin; 
    }
    public void setfechaFin(Date fechaFin){ 
        this.fechaFin = fechaFin; 
    }

    public void Activo(){
        System.out.println(nombreProyecto + "esta activo");
    }

    public void en_pausa(){
        System.out.println(nombreProyecto + "esta en pausa");
    }

    public void completado(){
        System.out.println(nombreProyecto + "esta completado");
    }

    public static void main(String[] args){
        Proyecto proyecto1 = new Proyecto(20223, "Exposición de algebra", "Exponer acerca de matrices",new Date(125,03,23) ,new Date(125, 4, 27));

        proyecto1.en_pausa();

        System.out.println("El id de su Proyecto es: " + proyecto1.getidProyecto());
        System.out.println("El nombre de su Proyecto es: " + proyecto1.getnombreProyecto());
        System.out.println("La descripción de su Proyecto es: " + proyecto1.getdescripcion());
        System.out.println("La fecha de inicio de su Proyecto es: " + proyecto1.getfechaInicio());
        System.out.println("La fecha de finalización de su Proyecto es: " + proyecto1.getfechaFin());
    }
}   




