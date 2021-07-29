/*
 * La moneda de los Hititas cuatro años antes era el doble 
 * de la moneda Pesos y la quinta parte de la suma de la 
 * moneda de los Hititas y la moneda Pesos es igual a la 
 * moneda Libra (todas en números enteros). La categoría 
 * de la moneda es calculada teniendo que cuando el valor
 * de la moneda está entre 0 y 20 unidades la categoría es
 * 'uno' cuando está entre 21 y 30 unidades la categoría es
 * 'dos' cuando está entre 31 y 50 unidades la categoría es
 * 'tres' y cuando es más de 50 unidades la categoría es 
 * 'cuatro'. 
 * Calcular las unidades de las monedas de los Hititas y la
 * Libra desde un valor de moneda Pesos imprimiéndolas en una
 * línea separadas por espacio en orden Pesos Hititas Libra y 
 * una nueva línea imprimiendo la categoría de la moneda Libra.
 */

package retos;

import java.util.Scanner;

/**
 * @author Ingrid Echeverri (https://github.com/Ingrid-E)
 * @version 0.1
 * @date 29/07/2021
 * Calcular las unidades de las monedas.
 */
public class Reto1 {
    public Reto1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor del Peso: ");
        int pesos = Integer.parseInt(sc.nextLine());
        calcularMonedas(pesos);
    }
    
    public void calcularMonedas(int monedaPesos){
        int monedaHititas = 2 * monedaPesos + 4;
        int monedaLibra = (monedaHititas + monedaPesos)/5;
        System.out.println(monedaPesos + " " + monedaHititas + " " + monedaLibra);
        if(monedaLibra < 20){
            System.out.println("uno");
        }else if(monedaLibra >= 20 && monedaLibra < 30){
            System.out.println("dos");
        }else if(monedaLibra >= 30 && monedaLibra < 50){
            System.out.println("tres");
        }else{
            System.out.println("cuatro");
        }
    }
}
