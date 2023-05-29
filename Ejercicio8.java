//8-Solicitar un número e indicar si es positivo o negativo. El proceso se repetirá 
hasta que se introduzca un 0.
import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args){
        Scanner leedor = new Scanner(System.in);
 
        int numero=1;
        while(numero!=0){
            System.out.println("Ingrese un numero");
            numero=leedor.nextInt();
            if(numero>0){
             System.out.println("El numero:"  +numero+ " es positivo");
            }else if(numero<0){
             System.out.println("El numero:" +numero+ " es negativo");
            }else{
                System.out.println("Programa cerrado");
            }
        }
    }
}

