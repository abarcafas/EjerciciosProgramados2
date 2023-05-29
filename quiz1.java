//1-Solicitar al usuario filas y columnas las cuales deberá recorrer para rellenar con su nombre.
import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner leedor = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas");
        int filas=leedor.nextInt();
        while(filas<=0){
         System.out.println("Error numero invalido.Ingrese otro numero");
         filas=leedor.nextInt();
        }

        System.out.println("Ingrese la cantidad de columnas");
        int columnas=leedor.nextInt();
        while(columnas<=0){
         System.out.println("Error numero invalido.Ingrese otro numero");
         columnas= leedor.nextInt();
        }
        leedor.nextLine();
        System.out.println("Ingrese un nombre");
        String nombre=leedor.nextLine();
        
        for  (int i = 0; i < filas; i++){
             for  (int j = 0; j < columnas; j++){
             System.out.println("El nombre ingresado es:" +nombre);
            }        
        }           
    }
}    