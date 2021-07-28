/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 * @author Ingrid Echeverri ()
 * @version Description....
 */
public class Clase3 {

    public Clase3() {
        callIMC();
        String hola = (10 > 5) ? "Verdad" : "Falso";
        //callIMC();
        int saludar = 0;
        while(saludar > 0){
            System.out.println("Hola estudiantes");
            --saludar;
        }
        saludar = 0;
        do{
            System.out.println("Hola estudiantes");
            --saludar;
        }while(saludar > 0);
    }

    public void juego() {
        Scanner sc = new Scanner(System.in);
        int seleccionado = Integer.parseInt(sc.nextLine());
        switch (seleccionado) {
            case 1:
                print("Nuevo Juego");
                break;
            case 2:
                print("Cargar Juego");
                break;
            case 3:
                print("Estadisticas");
                break;
            case 4:
                print("Opciones");
                break;
            case 5:
                print("Salir");
                break;
        }
        char character = sc.nextLine().charAt(0);
        switch(character){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                print("Es una vocal");
                break;
            default:
                print("Es una consonante");
                break;
        }
    }

    public void callIMC() {
        //IMC
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el peso");
        double weight = Double.parseDouble(sc.nextLine());
        System.out.println("Digite la altura");
        double height = Double.parseDouble(sc.nextLine());
        double result = imc(weight, height);
        // IMC
        if (result <= 18.5) {
            System.out.println("Bajo Peso");
        } else if (result > 18.5 && result <= 25) {
            System.out.println("Adecuado");
        } else if (result > 25 && result <= 30) {
            System.out.println("Sobrepeso");
        } else if (result > 30 && result <= 35) {
            System.out.println("Obesidad grado 1");
        } else if (result > 35 && result <= 39) {
            System.out.println("Obesidad grado 2");
        } else {
            System.out.println("Obesidad grado 3");
        }
    }

    ;
    
    public static double imc(double peso, double altura) {
        System.out.println(peso / (altura * altura));
        return peso / (altura * altura);
    }

    ;
    
    public static void print(String palabra) {
        System.out.println(palabra);
    }
;
}
