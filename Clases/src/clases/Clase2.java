/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 * @author Ingrid Echeverri ()
 * @version
 * Description....
 */
public class Clase2 {
    
    public static double alCuadrado(double num){
       return num * num; 
    }
    
    public Clase2(){
        System.out.println("21 JUL");
        int x = 10;
        int y = 5;
        x += y; //15
        System.out.println(x);
        double number = 5.6;
        int number2 = (int)number; //No da error
        System.out.println(number2); //5.0
        System.out.println("Operadores Logicos");
        boolean isRaining = false;
        boolean isSunny = true;
        System.out.println(!isRaining && isSunny);
        System.out.println(alCuadrado(5));
    }
}
