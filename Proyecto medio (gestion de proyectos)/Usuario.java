import java.util.Date;

public class Usuario{

    //colocamos los atributos
    
    private int idUsuario;
    private String nombre;
    private String correoElectronico;
    private String rol;

    public Usuario(int idUsuario, String nombre, String correoElectronico, String rol){
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.rol = rol;
    }

    //aplicando getter y setter

    public int getidUsuario(){
        return idUsuario; 
    }
    public void setidUsuario(int idUsuario) { 
        this.idUsuario = idUsuario; 
    }

    public String getnombre(){
        return nombre; 
    }
    public void setnombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getcorreoElectronico(){
        return correoElectronico; 
    }
    public void setcorreoElectronico(String correoElectrónico) { 
        this.correoElectronico = correoElectrónico; 
    }

    public String getrol(){
        return rol; 
    }
    public void setrol(String rol) { 
        this.rol = rol; 
    }

  public static void main(String[] args){
        Usuario usuario1 = new Usuario(202, "Lalo Landa", "lalo@gmail.com", "Administrador");
        Usuario usuario2 = new Usuario(206, "Paco Suarez", "Paco@gmail.com", "Desarrollador");


        System.out.println("El id de su usuario es: " + usuario1.getidUsuario());
        System.out.println("El nombre de su usuario es: " + usuario1.getnombre());
        System.out.println("El correo de su usuario es: " + usuario1.getcorreoElectronico());
        System.out.println("El rol de su usuario es: " + usuario1.getrol());

        System.out.println("El id de su usuario es: " + usuario2.getidUsuario());
        System.out.println("El nombre de su usuario es: " + usuario2.getnombre());
        System.out.println("El correo de su usuario es: " + usuario2.getcorreoElectronico());
        System.out.println("El rol de su usuario es: " + usuario2.getrol());
        
    }
}