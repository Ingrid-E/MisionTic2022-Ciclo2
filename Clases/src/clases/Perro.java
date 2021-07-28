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
public class Perro{
    //Atributos son variables en JAVA
    public int edad;
    public String raza,nombre;
    boolean esta_vacuando;
    public double peso;
    //Constructor
    public Perro(int edad, String raza, String nombre, boolean esta_vacunado, double peso){
        this.edad = edad;
        this.raza = raza;
        this.nombre = nombre;
        this.esta_vacuando = esta_vacunado;
        this.peso = peso;
    }
    //Métodos
    public void ladrar(){
        System.out.println("Guau");
    }
    public void correr(){
        System.out.println("Corriendo");
    }
    public int cumplirAnios(){
       ++edad;
        return edad;
    }
    public double aniosHumano(double factor){
        return edad*factor;
    }
    public String saludar(Perro otro_perro){
        return "Hola " + otro_perro.nombre + " soy " + this.nombre;
    }
}
