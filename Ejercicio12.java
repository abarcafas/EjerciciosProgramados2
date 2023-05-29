//12-Solicitar al usuario 10 números, mostrando al final si se ha introducido alguno negativo.
import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner leedor = new Scanner(System.in);

        int c =0;
        for(int i = 0; i < 10; i ++){
            System.out.println ("Ingrese numero");
             int numero=leedor.nextInt();
             if(numero<0){
                contador++;
             }
        }


        if (contador>0){
            System.out.println("Se ingresaron:" +contador+ " numeros negativos");
        }
        else{
         System.out.println("No se ingreso numeros negativo");
        } 
    }
}
