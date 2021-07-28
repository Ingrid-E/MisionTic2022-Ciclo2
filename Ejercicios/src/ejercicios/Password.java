/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

import java.util.Random;

/**
 * @author Ingrid Echeverri (https://github.com/Ingrid-E)
 * @date 28/07/2021
 * @version 0.1
 * Clase para generar una constraseña
 */
public class Password {
    //Atributos
    int size;
    String password;
    //Constructor
    public Password(){
        this.size = 8;
         generatePassword();
    }
    public Password(int size){
        this.size = size;
        generatePassword();
    }
    
    private void generatePassword(){
        Random random = new Random();
        password = "";
        for(int i = 0; i < size; i++){
            int value = random.nextInt(95) + 32;
            while(value <= 47 || (value >=58 && value <= 64) || (value >=91 && value <= 96)  || (value >= 123 && value <= 127)){
                value = random.nextInt(95) + 32;
            }
            password  += (char)value;
        }
        System.out.println(password);
    }
    
    public boolean esFuerte(){
        boolean mayuscula =false;
        boolean minuscula = false;
        boolean cincoNum = false;
        int contador = 0;
        for(int i = 0; i < size; i++){
            if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
                mayuscula = true;
            }else if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z'){
                minuscula = true;
            }else{
                contador++;
            }
            if(contador >= 5){
                cincoNum = true;
            }
            if(mayuscula && minuscula && cincoNum){
                return true;
            }
        }
        return false;
    }
    public void cambiarContraseña(String nuevaContraseña){
        this.password = nuevaContraseña;
    }

    @Override
    public String toString() {
        return "Password{" + "size=" + size + ", password=" + password + '}';
    }
    
}
