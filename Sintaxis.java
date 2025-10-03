//! Introducción a la sintaxis básica de Java
//* La sintaxis de Java es similar a C y C++, y usa paradigma POO
//* Todo programa en Java necesita al menos una clase pública y el método main

public class Sintaxis { // La clase debe llamarse como el archivo .java
    public static void main(String[] args) {
        //! Ejemplo 1: Hola Mundo
        System.out.println("Hola, Mundo!"); // Imprime un mensaje en consola

        //! Ejemplo 2: Variables y tipos de datos
        int numero = 10;             // Entero
        double decimal = 5.5;        // Decimal
        char letra = 'A';            // Carácter
        boolean esVerdadero = true;  // Booleano
        String texto = "Hola";       // Cadena de texto
        int[] arreglo = {1, 2, 3};   // Arreglo de enteros

        System.out.println("Número: " + numero);
        System.out.println("Decimal: " + decimal);
        System.out.println("Letra: " + letra);
        System.out.println("Booleano: " + esVerdadero);
        System.out.println("Texto: " + texto);
        System.out.print("Arreglo: ");
        for (int val : arreglo) {
            System.out.print(val + " ");
        }
        System.out.println();

        //! Ejemplo 3: Operadores
        int a = 5;
        int b = 10;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (b - a));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (b / a));
        System.out.println("Módulo: " + (b % a));

        //! Ejemplo 4: Condicionales
        if (numero > 5) {
            System.out.println("Número mayor que 5");
        } else if (numero == 5) {
            System.out.println("Número igual a 5");
        } else {
            System.out.println("Número menor que 5");
        }

        //! Ejemplo 5: Bucles for
        System.out.println("Bucle for:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        //! Ejemplo 6: Bucle while
        System.out.println("Bucle while:");
        int j = 0;
        while (j < 5) {
            System.out.println("j = " + j);
            j++;
        }

        //! Ejemplo 7: Bucle do-while
        System.out.println("Bucle do-while:");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 5);

        //! Ejemplo 8: For-each
        System.out.println("For-each con arreglo:");
        for (int valor : arreglo) {
            System.out.println(valor);
        }

        //! Ejemplo 9: Operadores lógicos
        boolean x = true;
        boolean y = false;
        if (x || y) {
            System.out.println("Al menos una condición es verdadera");
        }
        if (!y) {
            System.out.println("y es falso");
        }

        //! Ejemplo 10: Constantes
        final String CONTRASEÑA = "admin123"; // final = constante, debe ir en MAYUSCULA
        System.out.println("La contraseña es: " + CONTRASEÑA);

        //! Ejemplo 10: Variables sin tipado fuerte, inferencia de tipos (desde Java 10)
        var contraseña = "admin123"; // var = variable, puede ir en minuscula, no lleva delante un tipado(var tiene tipado debil que se infiere)
        System.out.println("La contraseña es: " + contraseña);
    }
}
