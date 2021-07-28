/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

/**
 * @author Ingrid Echeverri (https://github.com/Ingrid-E)
 * @version 0.1
 * Ejercicios propuestos en las diapositivas de 
 * la sesion #6: 27 de julio.
 * 
 * Clases y Objetos
 */
public class Sesion6 {
    public Sesion6(){
        Password password = new Password(20);
        System.out.println(password.esFuerte());
        //password.cambiarContraseña("Ingridddd");
        System.out.println(password.toString());
    }

}

