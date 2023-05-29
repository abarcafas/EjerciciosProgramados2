//11-Solcitar al usuario un número N de sueldos, y mostrar el sueldo máximo.
import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner leedor = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de sueldos");
        int numeros=leedor.nextInt();
        while(numeros<=0){
                System.out.println("Error ingreso una cantidad invalido.Igrese otro cantidad de sueldos:");
                numeros=leedor.nextInt();
            }

        int maximo=0;
        for(int i = 0; i < numeros; i++){
            System.out.println("Ingrese los sueldos");
            int sueldos=leedor.nextInt();
            while(sueldos<=0){
                System.out.println("Error sueldo invalido.Igrese otro sueldo:");
                sueldos=leedor.nextInt();
            }
            
            if(sueldos>maximo){
            maximo=sueldos;
            }
        }
        System.out.println("El sueldo mayor es:" +maximo);
    }
}