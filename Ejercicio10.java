//10-Solicitar al usuario 15 números y mostrar al final la suma total
import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner leedor = new Scanner(System.in);

        int suma=0;
        System.out.println("Ingrese 15 numeros");
      
        for(int i = 0; i < 15; i++) {
            int numero=leedor.nextInt();
           
            while(numero<=0){
                System.out.println("Erorr numero invalido.Digite otro numero");
                numero=leedor.nextInt();
            }
            suma+=numero;
        }
        System.out.println("El resultado total de los 15 numeros es:" +suma);
    }
}    