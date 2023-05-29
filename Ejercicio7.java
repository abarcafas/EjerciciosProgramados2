//7-Solicitar un número al usuario y mostrar su cuadrado, repetir el proceso hasta 
que se introduzca un número negativo.
import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner leedor = new Scanner(System.in);

        int numero=0;
        while(numero>=0){
            System.out.println("Ingrese un numero");
            numero=leedor.nextInt();
            while(numero==0){
                System.out.println("Error numero invalido.Ingrese otro numero");
                numero=leedor.nextInt();
            }
            if (numero<0){
                System.out.println("Haz salido del programa");
            }else{
                int cuadrado=numero*numero;
                System.out.println("El cuadrado de:" +numero+ " es:" +cuadrado);
            }
        } 
    }       
}      
