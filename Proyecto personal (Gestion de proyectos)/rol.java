public class rol{

    //colocamos los atributos

    int idRol;
    String nombreRol;
    String permisos; 

    public rol (int idRol, String nombreRol, String permisos){
        this.idRol=idRol;
        this.nombreRol=nombreRol;
        this.permisos=permisos;
    }

    //aplicamos getter y setter

    public int getidRol(){return idRol; }
    public void setidRol(int idRol) { this.idRol = idRol; }

    public String getnombreRol(){return nombreRol; }
    public void setnombreRol(String nombreRol) { this.nombreRol = nombreRol; }

    public String getpermisos(){return permisos; }
    public void setpermisos(String permisos) { this.permisos = permisos; }

    public void datos_rol (){
        System.out.println("El id de su rol es: " + idRol);
        System.out.println("El nombre de su rol es: " + nombreRol);
        System.out.println("El permiso de su rol es: " + permisos);
    }
}