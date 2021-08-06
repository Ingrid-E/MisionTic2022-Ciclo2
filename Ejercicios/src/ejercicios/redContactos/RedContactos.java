/*
 * @author Ingrid Echeverri (https://github.com/Ingrid-E)
 * @version
 * @file ejercicios.redContactos
 * @date    
 */
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.redContactos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class RedContactos {
    //Personas
    public static HashMap<String, HashMap> contactos = new HashMap<>();
    //Edad y Relaciones
    public static HashMap<String, Object> datos = new HashMap<>();
    //Relaciones
    public static HashMap<String, ArrayList<String>> relaciones = new HashMap<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            String persona = sc.nextLine();
            String[] informacion = persona.split(",");
            ArrayList<String> personas = new ArrayList<>();
            for (int j = 3; j < informacion.length; j++) {
            personas.add(informacion[j]);
            }
             crearPersona(informacion[0], Integer.parseInt(informacion[1]), informacion[2], personas);
        }
    }

    public static void crearPersona(String name, int edad, String relacion, ArrayList<String> personas) {
        if (!contactos.containsKey(name)) {
            datos = new HashMap<>();
            relaciones = new HashMap<>();
            relaciones.put(relacion, personas);
            datos.put("Relaciones", relaciones);
            datos.put("Edad", edad);
            contactos.put(name, datos);
        }else{
            relaciones.put(relacion, personas);
        }
        System.out.println(contactos);
    }

}
