
public class Rol{

    //Colocamos los atributos

    int idRol;
    String nombreRol;
    String permisos; 

    public Rol (int idRol, String nombreRol, String permisos){
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.permisos = permisos;
    }

    //Aplicamos getter y setter

    public int getidRol(){
        return idRol; 
    }
    public void setidRol(int idRol) { 
        this.idRol = idRol; 
    }

    public String getnombreRol(){
        return nombreRol; 
    }
    public void setnombreRol(String nombreRol) { 
        this.nombreRol = nombreRol; 
    }

    public String getpermisos(){
        return permisos; 
    }
    public void setpermisos(String permisos) { 
        this.permisos = permisos; 
    }

    //Imprimimos la información

    

    public static void main(String[] args){
        Rol rol1 = new Rol(2021, "Administrador", "Permisos de Administrador");
        Rol rol2 = new Rol(2020, "Desarrollador", "Permisos de Desarrollador");

    
        System.out.println("El id de su rol es: " + rol1.getidRol());
        System.out.println("El nombre de su rol es: " + rol1.getnombreRol());
        System.out.println("El permiso de su rol es: " + rol1.getpermisos());

        System.out.println("El id de su rol es: " + rol2.getidRol());
        System.out.println("El nombre de su rol es: " + rol2.getnombreRol());
        System.out.println("El permiso de su rol es: " + rol2.getpermisos());
        
    }
}