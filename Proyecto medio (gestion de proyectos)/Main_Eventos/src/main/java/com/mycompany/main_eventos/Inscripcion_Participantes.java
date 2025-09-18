package com.mycompany.main_eventos;

import java.util.Scanner;
//clase extendida de registro_eventos
public class Inscripcion_Participantes extends Registro_Eventos  {
    private  String Id;
    String nom_Participante;
    //metodo constructor que no devuelve ningun valor
    public Inscripcion_Participantes(){
       
   }
   //metodo 
    public void inscribirParticipante(){
        //metodo oara el registro de un participante
        Scanner dato= new Scanner (System.in);
        System.out.println("Ingrese ID PARTICIPANTE:" );
        Id=dato.nextLine();
        System.out.println("Ingrese el NOMBRE DEL PARTICIPANTE" );
        nom_Participante=dato.nextLine();

         System.out.println("ID:"+Id+" PARTICIPIANTE:"+nom_Participante);
         
    }
    
     public void verParticipantes(){
         //metodo para mostrar los datos del participante
         System.out.println("ID:"+Id+" PARTICPIANTE:"+nom_Participante);
         System.out.println(" ");
    }
    
}
