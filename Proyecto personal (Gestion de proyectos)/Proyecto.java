import java.util.Date;

public class Proyecto{

    //colocamos los atributos

    int idProyecto;
    String nombreProyecto;
    String descripcion;
    Date fechaInicio;
    Date fechaFin;
    String estado; 

    
    public Proyecto(int idProyecto, String nombreProyecto, String descripcion, Date fecha_inicio, Date fecha_fin, String estado){
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    //aplicamos el método getter and setter

    public int getidProyecto(){return idProyecto; }
    public void setidProyecto(int idProyecto) { this.idProyecto = idProyecto; }

    public String getnombreProyecto(){return nombreProyecto; }
    public void setnombreProyecto(String nombreProyecto){ this.nombreProyecto = nombreProyecto; }

    public String descripcion(){return descripcion; }
    public void descripcion(String descripcion){ this.descripcion = descripcion; }

    public Date fechaInicio(){return fechaInicio; }
    public void fechaInicio(Date fechaInicio){ this.fechaInicio = fechaInicio; }

    public Date fechaFin(){return fechaFin; }
    public void fechaFin(Date fechaFin){ this.fechaFin = fechaFin; }

    public String estado(){return estado; }
    public void estado(String estado){ this.estado = estado; }

    public void datos_proyecto (){
        System.out.println("El numero de su proyecto es:" + idProyecto);
        System.out.println("El nombre de su proyecto:" + nombreProyecto);
        System.out.println("La descripcion de su proyecto es:" + descripcion);
        System.out.println("La fecha de inicio de su proyecto es:" + fechaInicio);
        System.out.println("La fecha de finalización de su proyecto es:" + fechaFin);
        System.out.println("El estado de su proyecto es:" + estado);
    }
}