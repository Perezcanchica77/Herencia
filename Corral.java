/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_herencia;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Corral {
    private Animal[] animales;

    public Corral() {
        this.animales = new Animal[5];
        animales[0] = new Gallina();
        ((Gallina)animales[0]).setNombre("Federica");
        animales[1] = new Gallina();
        ((Gallina)animales[1]).setNombre("Manuela");
        animales[2] = new Perro();
        ((Perro)animales[2]).setNombre("Blacky");
        animales[3] = new Perro();
        ((Perro)animales[3]).setNombre("Dirty");
        animales[4] = new Gato();
        ((Gato)animales[4]).setNombre("Tonet");
        
    }
    public void simulaUnDia(){
        for(int i = 0; i < 24; i++){
            System.out.println("----------- "+i+"h -------------");
            for(int j = 0; j < animales.length; j++){
                animales[j].viveUnaHora(i);
            }
        }
    }
    
    
}
