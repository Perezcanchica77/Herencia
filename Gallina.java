/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_herencia;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Gallina extends AnimalAbstracto{
    public void viveUnaHora(int hora){
        if(hora >= 6 && hora <=20){//esta despierta
            if(hora % 3 == 0){
                System.out.println("La gallina "+getNombre()+ " está comiendo");
            }
            if(hora % 6 == 1){
                System.out.println("La gallina "+getNombre()+ " pone un huevo");
            }
        }else{//Duerme
            System.out.println("La gallina "+getNombre()+ " está durmiendo");
        }
    }
}
