/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.util.Scanner;

/**
 * @author Ingrid Echeverri ()
 * @version
 * Description....
 */
//Clase dentro de un archivo

class Pais{
    String nombre;
    int poblacion;
    String moneda;
    String[] bandera;
    boolean salida_al_mar;
}

public class Clase6 { //El nombre de la clase siempre comienza en mayuscula
    public Clase6(){
        Pais colombia = new Pais();
        Perro luky = new Perro(4,"French Puddle", "Luky", true, 2);
        Perro lucas = new Perro(7,"French Puddle", "Lucas", true, 5);
        luky.peso = 7;
        System.out.println(luky.nombre + " pesa " + luky.peso);
        luky.ladrar();
        System.out.println(luky.nombre + " tiene " + luky.edad + " años");
        luky.cumplirAnios();
        System.out.println(luky.nombre + " tiene " + luky.edad + " años");
        System.out.println(luky.saludar(lucas));
    }
}
