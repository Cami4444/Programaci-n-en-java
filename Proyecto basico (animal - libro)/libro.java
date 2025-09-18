public class libro{

    public String título;
    public String autor;
    public int páginas;

    public libro(String título, String autor, int páginas){
        this.título = título;
        this.autor = autor;
        this.páginas = páginas;
    }

    public void abrir(){
        System.out.println(título + "está abierto");
    }

    public void leer(){
        System.out.println(título + "está siendo leído");
    }

    public void cerrar(){
        System.out.println(título + "está cerrado");
    }

    public static void main(String[] args){
        libro l1 = new libro("Harry Potter y el prisionero de Azkaban ", "J.K Rowling", 360);
        libro l2 = new libro("Una corte de rosas y espinas ", "Sarah J Maas", 456); 

        l1.abrir();
    
        l2.cerrar();


    }
}