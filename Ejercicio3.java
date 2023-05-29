//3-Solicitar dos números y determinar cuál es el mayor.
import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner leedor = new Scanner(System.in);

         System.out.println("Ingrese un numero");
         int valor1=leedor.nextInt();
          
        while(valor1<=0){
            System.out.println("Error numero invalido ingrese otro numero");
              valor1=leedor.nextInt();
        }
            System.out.println("Ingrese otro numero");
           int valor2=leedor.nextInt();
         
           while(valor2<=0){
           System.out.println("Error numero invalido ingrese otro numero");
            valor2=leedor.nextInt();
        }
        if(valor1>valor2){
          System.out.println("El numero: " +valor1+ " es mayor que: " +valor2);
        }else if(valor1<valor2){
             System.out.println("El numero: " +valor2+ " es mayo que: " +valor1);
        } else{
          System.out.println("El numero" +valor1+ " es igual que:" +valor2);
        }
    }
}