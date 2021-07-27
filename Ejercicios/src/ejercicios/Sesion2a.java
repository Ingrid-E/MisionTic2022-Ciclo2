/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

import java.util.Scanner;

/**
 * @author Ingrid Echeverri ()
 * @version
 * Description....
 */
public class Sesion2a {
    public Sesion2a(){
        System.out.println("Volumen del Solido");
        Scanner input = new Scanner(System.in);
        System.out.print("Escribe el radio de la esfera: ");
        double radioEsfera = Double.parseDouble(input.nextLine()); 
        System.out.print("Escribe el radio del cono: ");
        double radioCono = Double.parseDouble(input.nextLine());
        System.out.print("Escribe la altura del cono: ");
        double alturaCono = Double.parseDouble(input.nextLine());
        System.out.println(volumenSolido(radioEsfera,radioCono,alturaCono));
        double resultado = interesCompuesto(1000000, 2);
        System.out.println(resultado);
    }
    public static double volumenSolido(double radioEsfera, double radioCono, double alturaCono){
        double PI = Math.PI;
        double volumenEsfera = (4.0/3.0)*PI*Math.pow(radioEsfera,3);
        double volumenCono = (1.0/3.0)*PI*Math.pow(radioCono, 2)*alturaCono;
        return (volumenEsfera + volumenCono);
    }
    public static double cantidadCarne(int gallinas, int gallos, int pollitos){
        double pesoGallinas = gallinas * 6.0;
        double pesoGallos = gallos * 7.0;
        double pesoPollitos = pollitos * 1.0;
        return pesoGallinas + pesoGallos+ pesoPollitos;
    }
    public static double interesCompuesto(double cantidad, double tiempo){
        double interesCompuesto = cantidad*Math.pow((1 + 3.0/100.0),tiempo);
        return interesCompuesto-cantidad;
    }
}
