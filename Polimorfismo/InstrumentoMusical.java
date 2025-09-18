public abstract class InstrumentoMusical {
    //Atributos
    int identificador;
    int cantidad;

    //Constructor 
    public InstrumentoMusical(int identificador, int cantidad){
        this.identificador = identificador;
        this.cantidad = cantidad;
    }

    public void mostrarInformacion(){

        System.out.println("El intrumento con numero de identificacion: " + identificador + " nos solicitan " + cantidad + " unidad");
    }

    public void saludo(String nombre){
        System.out.println("Buenas tardes " + nombre );
    }

    public void saludo(){
        System.out.println("Aqui tenemos una sobrecarga de metodo");
    }

     public void despedida(String nombre ){
        System.out.println("Gracias por su atencion " + nombre );
    }

}

