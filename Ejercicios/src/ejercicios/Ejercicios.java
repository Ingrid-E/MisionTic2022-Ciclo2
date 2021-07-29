/*
 * @author Ingrid Echeverri (https://github.com/Ingrid-E)
 * @version
 * @file ejercicios
 * @date    
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

/**
 * Main class
 * @returns
 */
public class Ejercicios {
    public static void main(String[] args) {
        sonLetras("Minso dia");
    }
    
    public static void sonLetras(String cadena){
        //Solucion 1
        System.out.println(cadena.matches("[\' 'a-zA-Z]+"));
        for(int i = 0; i< cadena.length(); i++){
            //Solucion 2
            if(!((cadena.charAt(i) >= 'A' && cadena.charAt(i) <= 'Z') || (cadena.charAt(i) >= 'a' && cadena.charAt(i) <= 'z')) && cadena.charAt(i) != ' '){
                System.out.println("rango: FALSO");
            }
            //Solucion 3
            if(!Character.isLetter(cadena.charAt(i)) && cadena.charAt(i) != ' '){
                System.out.println("isLetter: FALSO");
            }
        }
        System.out.println("TRUE");
    }

}
