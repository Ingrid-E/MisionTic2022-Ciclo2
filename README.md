# MisionTic2022-Ciclo2

# Semana 1
## Introducción
19 JUL

### Java
Desarrollado por James Gosling de Sun Microsystems. Una **plataforma universal** que podía ejecutar la misma aplicación en cualquier máquina. <br>

JDK - Java Development Kit <br>

Para la clase vamos a utilizar NetBeans IDE. <br>

### Variables
Existen dos tipos de tipado de las variables.

*   Tipado estático : Definirse
*   Tipado dinámico: No se Define

Para identificar una variable de forma valida no puede comenzar con un digito y no ser una palabra reservada.<br>
Java es sensible a mayúsculas y minúsculas. dia-Dia-DIA son identificadores diferente. <br>

**Declarar variables en JAVA**<br>
tipo nombre;

### Datos Primitivos

#### Numericos
* byte: 1 solo byte, valores entre [-128, 127]
* short: El doble que un byte, valores entre [-32.768, 32.767]
* int: 4 bytes. Es el mas utilizado sus valores son mas amplios.
* long: 8 bytes. Mas rango que int.
* float: 32  bits precisión simple. Fatos con decimales.
* double: 64 bits tambien usa decimales.

Ejemplos de inicializar la variable:
* int i = 0;
* float numero = 2.5;

#### Booleanos
* boolean a = true;
* boolean b = false;
* 
#### Caracteres
Caracteres especiales 
* \n : Nueva linea.
* \t : Tabulador horizontal.
* \\ : Diagonal invertida (back slash).
* \’ : Imprime apostrofo.
* \" : Imprime Comillas.
* \b : Retroceso (retrocede un espacio el cursor).
* \v : Tabulador vertical (coloca el cursor justo debajo del  ́ultimo car ́acter de la linea actual).
* \r : Retorno de carro (coloca el cursor en el primer caracter de la linea actual y sobreescribe el texto de la linea).
* \? : Imprime el sımbolo de interrogacion.

Ejemplos:
* char = 'c';
* char value = 70;
* char nine = '9';

### Lectura de datos
Utilizamos Scanner para obtener datos del usuario por medio de la consola.<br>
**import java.util.Scanner** <br>

Segun el tipo de variable que se espera utilizamos Tipo.parseTipo();

```Java
Scanner sc = new Scanner(System.in);
boolean b = Boolean.parseBoolean(sc.nextLine());
```

