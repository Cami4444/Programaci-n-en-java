/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main_eventos;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Registro_Eventos {
     
      
        String nombre_Evento,Fecha,nom_organizador;
        //metodo constructor que no devuelve ningun valor
        public Registro_Eventos(){

        }
      

  //metodo
  public void registrarEvento(){
        //metodo para el registro de un evento
        Scanner dato= new Scanner (System.in);
        System.out.println("Ingrese ID EVENTO:" );
        nombre_Evento=dato.nextLine();
        System.out.println("Ingrese el NOMBRE DEL EVENTO" );
        Fecha=dato.nextLine();
        System.out.println("Ingrese el NOMBRE DEL ORGANIZADOR:" );
        nom_organizador =dato.nextLine();
        System.out.println("Registrado:" );
  }    
    
  public void Mostrar_registrarEvento(){
    //metodo para mostrar los datos del evento
         System.out.println("ID:"+nombre_Evento+" EVENTO:"+Fecha+" ORGANIZADOR:"+nom_organizador);
  }     
     
    public void cancelarEvento(){
        //metodo para cancelar el evento
         Scanner d= new Scanner (System.in); 
         String Reso;
         //ciclo de repiticion  para eliminar un evento
         do{
             System.out.println("Desea cancelar el evento...");
             System.out.println("Escriba SI/NO...");
             Reso = d.nextLine();
         }while(Reso.equals ("no"));
         
         
         
  }
    
}
