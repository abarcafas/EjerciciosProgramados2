// 6-Solicitar al usuario el día, mes y año de una fecha e indicar si la fecha es 
correcta. Suponiendo todos los meses de 30 días.
import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args){
        Scanner leedor = new Scanner(System.in);


        System.out.println("Ingrese un dia");
        int dia=leedor.nextInt();
           while(dia>30 || dia<=0){
            System.out.println("Error.Ingrese otro dia");
            dia=leedor.nextInt();
        }

        System.out.println("Ingrese un mes");
        int mes=leedor.nextInt();
          while(mes>12 || mes<=0){
            System.out.println("Error.Ingrese otro dia");
            mes=leedor.nextInt();
       }
        System.out.println("Ingrese un año");
        int año=leedor.nextInt();
       while(año!=2023||año!=2023){
        System.out.println("Error.Ingrese otro año");
        año=leedor.nextInt();
       }
       System.out.println("la fecha ingresada es valida: " +dia+"/"+mes+"/"+año);
    }
}