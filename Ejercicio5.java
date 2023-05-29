//5-Solicitar al usuario un número entre 0 y 9999 y decir cuantas cifras tiene.
import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner leedor = new Scanner(System.in);

        System.out.println("Ingrese un entre 0 entre 9999");
        int numero=leedor.nextInt();

        while(numero<1 || numero>9999){
            System.out.println("Error numero invalido.Ingrese otro numero");
            numero=leedor.nextInt();
        }
        if(numero<10){
            System.out.println("El numero tiene una cifra");
        }
        else if(numero>=10 && numero<100){
            System.out.println("El numero tiene dos cifras");
        }
        else if (numero >=100 && numero<1000){
         System.out.println("El numero tiene tres cifras");
        }
        else if (numero >=1000 && numero<10000){
            System.out.println("El numero tiene cuatro cifras");
        }
    }
}