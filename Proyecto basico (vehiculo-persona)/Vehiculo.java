public class Vehiculo{
    public String marca;
    public String modelo;

    public Vehiculo(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }

    public void detalle(){
        System.out.println("La marca del vehículo es: " + marca + " y el modelo es: " + modelo);
    }
}

class Coche extends Vehiculo{
    
    private int num_puertas;

    public Coche(String marca, String modelo, int num_puertas){

        super(marca,modelo);
        this.num_puertas=num_puertas;
    }  

    public int getnum_puertas(){
        return num_puertas;
    }

    public void setnum_puertas(int num_puertas){
        this.num_puertas=num_puertas;
    }

    public void mostrarDetalle(){
        System.out.println("Tiene " + num_puertas + " puertas");
    }
    public static void main(String[] args){
        Coche c1 = new Coche("Toyota", "4Runner", 5);

        c1.detalle();
        c1.mostrarDetalle();
    } 
}
