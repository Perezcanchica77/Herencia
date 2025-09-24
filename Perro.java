/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_herencia;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Perro extends AnimalAbstracto{
    public void viveUnaHora(int hora){
        if(hora >= 8 && hora <=22){//esta despierto
            if(hora % 9 == 0){
                System.out.println("El perro "+getNombre()+ " está comiendo");
            }else{
                if(hora % 2 == 0){
                    System.out.println("El perro "+getNombre()+ " está paseando");
                }else{
                    System.out.println("El perro "+getNombre()+ " está descansando");
                }
            }
        }else{//Duerme
            System.out.println("El perro "+getNombre()+ " está durmiendo");
        }
    }
}
