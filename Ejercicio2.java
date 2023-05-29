//2-Solictar al usuario dos números y decir si uno es múltiplo del otro
import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner leedor = new Scanner(System.in);
         
         System.out.println("Ingrese el primer numero");
         int valor1=leedor.nextInt();

         System.out.println("Ingrese el segundo numero");
         int valor2=leedor.nextInt();

         if(valor1%valor2==0){
        System.out.println("El numero: " +valor1+ " es multiplo de:" +valor2);
        }else if (valor2%valor1==0){
            System.out.println("El numero:" +valor2+ " es multiplo de:" +valor1);
        }else{
            System.out.println("Los numero no son multiplos");
        }
    }
} 