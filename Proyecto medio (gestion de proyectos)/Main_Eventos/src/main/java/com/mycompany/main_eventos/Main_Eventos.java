package com.mycompany.main_eventos;
 import java.util.Scanner;

public class Main_Eventos {

    public static void main(String[] args) {
        //Instancia de objetos
        Registro_Eventos R1=new Registro_Eventos( );
        Inscripcion_Participantes Ins= new Inscripcion_Participantes();
        
        System.out.println("SISTEMA DE EVENTOS:");
        
        int opcion;
        Scanner dato= new Scanner (System.in);
        
        do{
        System.out.println("|     GESTION DE EVENTOS       |"); 
        System.out.println("|______________________________|"); 
        System.out.println("|  1.REGISTRAR EVENTO:         |");
        System.out.println("|  2.INSCRIBIR PARTICIPANTE:   |");
        System.out.println("|  3.CANCELAR EVENTO:          |");
        System.out.println("|  4.VER PARTICIPANTES         |");
        System.out.println("| SELECCIONE LA OPCION DEL MENU:");
        opcion= dato.nextInt();
        switch (opcion){
            case 1:
                //llamada de los metodos de la clase Registro_Eventos
                 R1.registrarEvento();
                 R1.Mostrar_registrarEvento();

                 break;
            case 2:
                 //llamada de los metodos de la clase Inscripcion_Participantes y Registro_Eventos 
                 System.out.println("****Inscribir participantes");
                 Ins.inscribirParticipante();
                 System.out.println(" ***El evento al que ud se inscribio fue:...");
                 R1.Mostrar_registrarEvento();                 
                 break;
                 
            case 3:
                //llamada del metodo de cancelar evento de la clase Registro_Eventos
                System.out.println("*****Cancelacion del evento"); 
                  R1.cancelarEvento();
                 break;
            case 4:  
                 //llamada de los metodos de la clase Inscripcion_Participantes y Registro_Eventos 
                 System.out.println("****Mostrar participantes y evento inscrito");
                 Ins.verParticipantes();
                 R1.Mostrar_registrarEvento();
                 break;
                 default: System.out.println("Numero incorrecto, el programa se cerrara");
                      
        }
        }while(opcion <= 4);  
    }
}
