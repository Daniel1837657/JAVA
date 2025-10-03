//Son operadores que se aplican a un solo operando y realizan una operación específica sobre él.
//Ejemplos de operadores unarios en Java incluyen:
public class OperadoresUnarios {
    public static void main(String[] args) {
        int a = 5;
        int b = -10;

        // Operador unario positivo
        System.out.println("El valor de a es: " + (+a));

        // Operador unario negativo
        System.out.println("El valor de b es: " + (-b));

        // Operador de incremento
        a++;
        System.out.println("El valor de a después del incremento es: " + a); // 6, porque a se incrementa en 1

        // Operador de decremento
        b--;
        System.out.println("El valor de b después del decremento es: " + b); // -11, porque b se decrementa en 1
    }
}
