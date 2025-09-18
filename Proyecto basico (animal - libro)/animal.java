public class animal{

    public String nombre;
    public int edad;
    public String tipo;

    public animal(String nombre, int edad, String tipo){
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    public void comer(){
        System.out.println(nombre + "está comiendo");
    }

    public void dormir(){
        System.out.println(nombre + "está durmiendo");
    }


    public void Sonido1(){
        System.out.println(nombre + "está ladrando");
    }

    public void Sonido2(){
        System.out.println(nombre + "está Maullando");
    }


    public static void main(String[] args) {
        animal a1 = new animal("Shiva ", 2, "Perro");
        animal a2 = new animal("Capuchinno ", 10, "Gato");
        
        a1.comer();
        
        a2.Sonido2();
    }

    public static void main(String[] args) {
        animal a1 = new animal("Shiva ", 2, "Perro");
        animal a2 = new animal("Capuchinno ", 10, "Gato");
        
        a1.comer();
        
        a2.Sonido2();
    }
}
