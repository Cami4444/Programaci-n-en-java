public class Guitarra extends InstrumentoMusical{
//Atributos 
String modelo; 
private String estado; 

//Constructor
public Guitarra (String modelo,int identificador, int cantidad){
    super(identificador, cantidad);
    this.modelo = modelo;
}
 //Metodos
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

@Override
public void mostrarInformacion(){
    System.out.println("El intrumento con numero de identificacion: " + identificador + " nos solicitan " + cantidad + " unidad" + " El estado de la guitarra es " + getEstado() + " y su modelo es " + modelo);
}
}
