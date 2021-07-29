/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

/**
 * @author Ingrid Echeverri ()
 * @version
 * Description....
 */
public class Triki {
    //Atributos
    public char[][] matriz;
    //Constructor
    public Triki(){
        //Inicializando los valores
        matriz = new char[][]{{'a','a','a'},
                              {'a','a','a'},
                              {'a','a','a'}};
    }
    public char verificarGanador(){
        for(int i = 0; i < 3; i++){
            boolean horizontal = (matriz[0][i] == matriz[1][i]) && (matriz[0][i] == matriz[2][i]);
            boolean vertical = (matriz[i][0] == matriz[i][1]) && (matriz[i][0] == matriz[i][2]);
            boolean diagonalL = (matriz[0][0] == matriz[1][1]) && (matriz[0][0] == matriz[2][2]);
            boolean diagonalR = (matriz[0][2] == matriz[1][1]) && (matriz[0][2] == matriz[2][0]);
            boolean checkX = matriz[1][1] != 'a';
            if(horizontal && matriz[0][i] != 'a'){
                return matriz[0][i];
            }
            if(vertical && matriz[i][0] != 'a'){
                return matriz[i][0];
            }
            if(diagonalL && checkX){
                return matriz[0][0];
            }
            if(diagonalR && checkX){
                return matriz[0][2];
            }
        }
        return 'a';
    }
    
    public void marcarCasilla(char letra, int x, int y){
        this.matriz[x][y] = letra;
    }
    
    public void imprimirMatriz(){
        for(int i= 0; i < 3; i++){
            for(int j= 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
