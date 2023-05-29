//1-Solicitar al usuario un número e indicar si es positivo o negativo
import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
     
        System.out.println("Ingrese un numero");
        int numero=input.nextInt();

        while(numero==0){
            System.out.println("Error de numero ingrese otro numero");
            numero=input.nextInt();
        }
        if(numero>=0){
            System.out.println("El numero:" +numero +  "es positivo");
        }else{
            System.out.println("El numero:" +numero + " es negativo");
        }
    }       
}     