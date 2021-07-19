/*
 * @author Ingrid Echeverri (https://github.com/Ingrid-E)
 * @version 0.1
 * @file hola.mundo
 * @date 19/07/2021
 */
package hola.mundo;

import java.util.Scanner;

/**
 * Main class que retorna
 * 'Hola Mundo!'
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        String word = sc.nextLine();
        System.out.println(word);
        int n = sc.nextInt();
        int m = n*2;
        System.out.println("Resultado: " + m);
    }

}
