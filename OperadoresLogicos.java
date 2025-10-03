//Si se usa AND (&&), ambas condiciones deben ser verdaderas para que el resultado sea verdadero, si no, es falso.
//Si se usa OR (||), al menos una de las condiciones debe ser verdadera para que el resultado sea verdadero.
//Si se usa NOT (!), invierte el valor de verdad de la condición, o para convertir en verdadero el falso.
public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // Operadores lógicos
        System.out.println("x AND y: " + (x && y)); // AND lógico
        System.out.println("x OR y: " + (x || y));  // OR lógico
        System.out.println("NOT x: " + (!x));        // NOT lógico

        // Combinación de operadores lógicos
        System.out.println("x AND (NOT y): " + (x && !y));

        //Ejemplos: 
        int a = 10;
        int b = 5;
        System.out.println("a es mayor que b AND x es verdadero: " + ((a > b) && x));
        System.out.println("a es menor que b OR y es verdadero: " + ((a < b) || y));
        System.out.println("a es mayor que b AND (NOT y) es verdadero: " + ((a > b) && !y));

        //Anidaciones de operadores lógicos
        x = true;
        y = false;
        boolean z = true;
        System.out.println("x AND (y OR z): " + (x && (y || z))); //x es verdadero y (y o z) es verdadero, entonces el resultado es verdadero.
    }
}