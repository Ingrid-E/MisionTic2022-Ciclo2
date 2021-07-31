/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios.Futbol;

import java.util.ArrayList;

/**
 * @author Ingrid Echeverri ()
 * @version
 * Description....
 */
public class SeleccionFutbol {
    //Atributos
    String nombre;
    int antiguedad;
    ArrayList<Jugador> jugadores;
    Entrenador entrenador;
    String pais;
    //Constructor
    public SeleccionFutbol(){
        this.nombre = "";
        this.antiguedad = 0;
        this.pais = "";
        this.jugadores = new ArrayList<Jugador>();
    }
    public SeleccionFutbol(String nombre, int antiguedad, String pais){
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.pais = pais;
        this.jugadores = new ArrayList<Jugador>();
    }
    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    public void agregarEntrenador(Entrenador entrenador){
        this.entrenador = entrenador;
    }
}
