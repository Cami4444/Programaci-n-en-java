public class Usuario{

    //colocamos los atributos
    
    int idUsuario;
    String nombre;
    String correoElectronico;
    String rol;

    public Usuario(int idUsuario, String nombre, String correoElectronico, String rol){
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.rol = rol;
    }

    //aplicando getter y setter

    public int getidUsuario(){return idUsuario; }
    public void setidUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public String getnombre(){return nombre; }
    public void setnombre(String nombre) { this.nombre = nombre; }

    public String getcorreoElectronico(){return correoElectronico; }
    public void setcorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public String getrol(){return rol; }
    public void setrol(String rol) { this.rol = rol; }

    public void datos_usuario (){
        System.out.println("El id de su usuario es: " + idUsuario);
        System.out.println("El nombre de su usuario es: " + nombre);
        System.out.println("El correo de su usuario es: " + correoElectronico);
        System.out.println("El rol de su usuario es: " + rol);
    }
}