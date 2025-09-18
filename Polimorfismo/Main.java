public class Main {
    public static void main(String[] args) {
        Guitarra g1 = new Guitarra("acustica", 21, 1);
        g1.saludo("con todos");
        g1.saludo();
        g1.setEstado("nuevo");
        g1.mostrarInformacion();

        Piano p1 = new Piano("de cola", 123, 1);
        p1.setMarca("Yamaha");
        p1.mostrarInformacion();
        p1.despedida("Ingeniero y compañeros");
        

    }
}
