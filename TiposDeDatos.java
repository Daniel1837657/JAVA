//! Archivo: TiposDeDatos.java
public class TiposDeDatos {
    public static void main(String[] args) {
        //! ===== Tipos de datos primitivos =====
        
        // Enteros con distintos tamaños
        byte numeroByte = 120;          // 8 bits, -128 a 127
        short numeroShort = 32000;      // 16 bits, -32,768 a 32,767
        int numeroInt = 100000;         // 32 bits, rango amplio
        long numeroLong = 1000000000L;  // 64 bits, muy grande, lleva "L" al final

        // Números de punto flotante
        float numeroFloat = 10.5f;      // 32 bits, decimal, necesita "f"
        double numeroDouble = 20.99;    // 64 bits, decimal más preciso

        // Carácter y booleano
        char caracter = 'A';            // Un solo carácter Unicode
        boolean booleano = true;        // true o false

        //! ===== Tipos de datos no primitivos =====
        
        // Cadenas de texto
        String nombre = "Daniel";       
        String saludo = "Hola, Mundo!";

        // Arrays
        int[] numeros = {1, 2, 3, 4, 5};
        String[] nombres = {"Ana", "Luis", "Pedro"};

        // Clases Wrapper (permiten usar métodos sobre primitivos)
        Integer numeroObj = 42;         // int pero como objeto
        Double decimalObj = 99.99;      // double como objeto
        Boolean boolObj = Boolean.FALSE;

        // Null (único valor posible para objetos no inicializados)
        String nulo = null;

        //! ===== Imprimir los valores =====
        
        System.out.println("=== PRIMITIVOS ===");
        System.out.println("byte: " + numeroByte);
        System.out.println("short: " + numeroShort);
        System.out.println("int: " + numeroInt);
        System.out.println("long: " + numeroLong);
        System.out.println("float: " + numeroFloat);
        System.out.println("double: " + numeroDouble);
        System.out.println("char: " + caracter);
        System.out.println("boolean: " + booleano);

        System.out.println("\n=== NO PRIMITIVOS ===");
        System.out.println("String nombre: " + nombre);
        System.out.println("String saludo: " + saludo);

        System.out.print("Array de enteros: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Array de nombres: ");
        for (String n : nombres) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("Integer objeto: " + numeroObj);
        System.out.println("Double objeto: " + decimalObj);
        System.out.println("Boolean objeto: " + boolObj);
        System.out.println("Valor nulo: " + nulo);
    }
}
