//9- Solicitar al usuario números hasta que se teclee un 0, mostrar la suma de todos 
los números introducidos.
import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args){
        Scanner leedor = new Scanner(System.in);
 
        int suma=0;
        int numero=1;
        while(numero!=0){
            System.out.println("Ingrese un numero");
            numero=leedor.nextInt();
            while(numero<=-1){
                System.out.println("Error numero invalido.Ingrese otro");
                numero=leedor.nextInt();
            }
            suma+=numero;
        }
        System.out.println("La suma de los numero ingresado es:" +suma);
    }
}   