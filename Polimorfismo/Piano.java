public class Piano extends InstrumentoMusical{

    //Atributos
    String tipo;
    private String marca;
    
    //Constructor
    public Piano(String tipo, int identificador, int cantidad){
    super(identificador, cantidad);
    this.tipo = tipo;
    }
    
        public String getMarca() {
            return marca;
        }
    
        public void setMarca(String marca) {
            this.marca = marca;
        }
    
    @Override
    public void mostrarInformacion(){
    
            System.out.println("El intrumento con numero de identificacion: " + identificador + " , nos solicitan " + cantidad + " unidad" + " El tipo de piano es " + tipo + " y su marca es " +  getMarca());
        }
    
    }
    