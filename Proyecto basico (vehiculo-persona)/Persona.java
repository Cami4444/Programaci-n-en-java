public class Persona{

    public String nombre;
    public int edad;

    public Persona(String nombre, int edad){
    this.nombre=nombre;
    this.edad=edad;
    }

    public void presentarse(){
        System.out.println("Hola! me presento soy "+ nombre +", tengo " + edad + " años");
    }

}

class Estudiante extends Persona{

    private String matricula;
    public String carrera;

    public Estudiante(String nombre, int edad, String carrera){
        super(nombre,edad);
        this.carrera = carrera;
    }

    public String getmatricula(){
        return matricula;
    }

    public void setmatricula(String matricula){
        this.matricula=matricula;
    }

    public void estudiar(){
        System.out.println("El estudiante "+ nombre + " está estudiando " + carrera);
    }

    public static void main(String[] args){
        Estudiante e1 = new Estudiante("Pepito ", 30, "Veterinaria");
        e1.setmatricula("ordinaria");
        System.out.println("El tipo de matricula es: " + e1.getmatricula());

        e1.presentarse();
        e1.estudiar();
    } 
}

   
