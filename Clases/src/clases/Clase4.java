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
public class Clase4 {
     public Clase4(){
         cadenas();
    }
    public static void ciclos(){
                int i = 10;
        while(i > 0){
            System.out.println(i);
            --i;
        }
        
        i = 10;
        do {
            System.out.println(i);
            --i;
        }while(i>0);
        
        for(int j = 10; j>0; --j){
            System.out.println(j);
        }
        
        for(int j = 0; j<= 10; j += 2){
            System.out.println(j);
        }
    }
    public static void patoGanso(){
        Scanner sc = new Scanner(System.in);
        while(true){
            byte word = Byte.parseByte(sc.nextLine());
            if(word == 1){
                System.out.println("Calvado y a correr");
                break;
            }
        }
    }
    
    public static void cadenas(){
        String a = "Hello";
        String b = "Hello";
        if( a == b){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        System.out.println(a + b);
        System.out.println(a.substring(0, 2));
    }
}
