/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_herencia;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Gato extends AnimalAbstracto{
    public void viveUnaHora(int hora){
        if(hora >= 22 || hora <= 6){//esta despierto
            if(hora % 6 == 0){
                System.out.println("El gato "+getNombre()+ " está comiendo");
            }else{
                if(hora % 2 == 0){
                    System.out.println("El gato "+getNombre()+ " está jugando");
                }else{
                    System.out.println("El gato "+getNombre()+ " está molestando");
                }
            }
        }else{//Duerme
            System.out.println("El gato "+getNombre()+ " está durmiendo");
        }
    }
    
}
