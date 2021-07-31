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

import ejercicios.Futbol.Jugador;
import ejercicios.Futbol.SeleccionFutbol;

/**
 * Main class
 * @returns
 */
public class Ejercicios {
    public static void main(String[] args) {
        SeleccionFutbol colombia = new SeleccionFutbol("Colombia", 5, "Colombia");
        Jugador pikachu = new Jugador("Pika", 16, 5000, "9");
        colombia.agregarJugador(pikachu);
        
    }
    

}
