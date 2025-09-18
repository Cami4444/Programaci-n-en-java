public class Producto{
    private String nombre;
    private double precio;

    public String getnombre(){
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre=nombre;
    }

    public double getprecio(){
        return precio;
    }

    public void setprecio(double precio){
        this.precio=precio;
    }
}

class Electronico extends Producto{
    private int garantia;

    public int getgarantia(){
        return garantia;
    }

    public void setgarantia(int garantia){
        this.garantia=garantia;
    }

    public void mostrarinformacion(){
        System.out.println("El nombre del producto es " + getnombre() + ", el precio es " + getprecio() + " y la garantia de " + garantia + " meses");
    }
    
}

class Telefono extends Electronico{
    private String numeroTelefono;

    public String getnumeroTelefono(){
        return numeroTelefono;
    }

    public void setnumeroTelefono(String numeroTelefono){
        this.numeroTelefono=numeroTelefono;
    }

    public void mostrarinformacionCompleta(){
        System.out.println("El nombre del producto es de " + getnombre() + ", el precio es de " + getprecio() + ", la garantia de " + getgarantia() + " meses" + " y el número de telefono es " + numeroTelefono);
    }

    public static void main(String[] args){
        Telefono t1 = new Telefono();
        t1.setnombre("Xiaomi");
        t1.setprecio( 300);
        t1.setgarantia(  36);
        t1.setnumeroTelefono( "264654564");

        t1.mostrarinformacionCompleta();
    }
}
