//4-Solicitar al usuario tres números y mostrarlos ordenados de mayor a menor
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leedor = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int valor1 = leedor.nextInt();

        System.out.println("Ingrese el segundo numero");
        int valor2 = leedor.nextInt();

        System.out.println("Ingrese el tercer numero");
        int valor3 = leedor.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {
            if (valor2 > valor3) {
                System.out.println("El numero mayor es: " + valor1 + " " + valor2 + " " + valor3);
            } else {
                System.out.println("El numero mayor es: " + valor1 + " " + valor3 + " " + valor2);
            }
        } else if (valor2 > valor1 && valor2 > valor3) {
            if (valor1 > valor3) {
                System.out.println("El numero mayor es: " + valor2 + " " + valor1 + " " + valor3);
            } else {
                System.out.println("El numero mayor es: " + valor2 + " " + valor3 + " " + valor1);
            }
        } else if (valor3 > valor1 && valor3 > valor2) {
            if (valor1 > valor2) {
                System.out.println("El numero mayor es: " + valor3 + " " + valor1 + " " + valor2);
            } else {
                System.out.println("El numero mayor es: " + valor3 + " " + valor2 + " " +valor1);
            }
        }
    }
}