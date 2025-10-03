public class OperadoresMatematicos {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Suma
        int suma = a + b;
        System.out.println("Suma: " + suma);

        // Resta
        int resta = a - b;
        System.out.println("Resta: " + resta);

        // Multiplicación
        int multiplicacion = a * b;
        System.out.println("Multiplicación: " + multiplicacion);

        // División
        int division = a / b;
        System.out.println("División: " + division);

        // Módulo
        int modulo = a % b;
        System.out.println("Módulo: " + modulo);

        // Incremento
        a++;
        System.out.println("Incremento de a: " + a);
    
        // Decremento
        b--;
        System.out.println("Decremento de b: " + b);
    
        //Asignacion
        int c = 20;
        c+=5; // c = c + 5
        c-= 1; // c = c - 1
        c*= 2; // c = c * 2
        c/= 3; // c = c / 3
        c%= 4; // c = c % 4
        c+= 100; // c = c + 100
        System.out.println("Asignación de c: " + c);
    }
}
