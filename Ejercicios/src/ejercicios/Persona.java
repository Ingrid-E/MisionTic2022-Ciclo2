package ejercicios;

/**
 * @author Ingrid Echeverri (https://github.com/Ingrid-E)
 * @date 28/07/2021
 * @version 0.1
 * Una clase para contruir un objeto de una persona. 
 * Contiene métodos sobre su peso, edad, e info general.
 */
public class Persona {
    //Atributos
    String nombre;
    int edad;
    char genero;
    double peso;
    double altura;
    //Constructor
    public Persona(String nombre, int edad, char genero, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }
    //Métodos
    /**
     * Calcula el indice de masa corporal.
     * @return String //=> Segun el peso.
     */
    public String calcularIMC(){
        double imc = this.peso/Math.pow((this.altura/100.0), 2);
        System.out.println("IMC es: " + imc);
        if(imc < 16.0){
            return "Infrapeso: Delgadez Severa";
        }else if(imc >= 16.0 && imc <= 16.99){
            return "Infrapeso: Delgadez moderada";
        }else if(imc >= 17.0 && imc <= 18.49){
            return "Infrapeso: Delgadez aceptable";
        }else if(imc >= 18.50 && imc <= 24.99){
            return "Peso Normal";
        }else if(imc >= 25.00 && imc <= 29.99){
            return "Sobrepeso";
        }else if(imc >= 30.00 && imc <= 34.99){
            return "Obesidad: Tipo 1";
        }else if(imc >= 35.00 && imc <= 40.00){
            return "Obesidad: Tipo 2";
        }else{
            return "Obesidad: TIpo 3";
        }
    }
    /**
     * True -> Es mayor de edad >18
     * False si es menor de edad <18
     * @return boolean 
     */
    public boolean esMayorDeEdad(){
        if(this.edad >= 18){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Imprime la información completa de la persona y 
     * retorna el string del objeto.
     * @param persona //Persona
     * @return string
     */
    public String toString(Persona persona){
        String informacion = "Nombre: " + this.nombre + "\n" +
                             "Edad: " + this.edad + "\n" + 
                             "Genero: " + this.genero + "\n" +
                             "Peso: " + this.peso + "\n" +
                             "Altura: " + this.altura;
        System.out.println(informacion);
        return persona.toString();
    }
}
