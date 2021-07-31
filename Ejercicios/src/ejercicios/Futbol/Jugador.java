
package ejercicios.Futbol;

import java.util.ArrayList;

public class Jugador extends SeleccionFutbol{
    //Atributos
    String nombre;
    int edad;
    int salario;
    ArrayList<String> posiciones;
    String dorsal;
    int minutosJugados;
    ArrayList<String> equiposAnteriores;
    //Constructor
    public Jugador(String nombre, int edad, int salario, String dorsal){
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.dorsal = dorsal;
        this.posiciones = new ArrayList<String>();
        this.equiposAnteriores = new ArrayList<String>();
        
    }
}
