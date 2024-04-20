package ejerciciosueldos;

import java.util.Scanner;

public class EjercicioSueldos {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Ingrese el número de su tipo de puesto. 1-repositor, 2-cajero o 3-supervisor.");
       int tipoPuesto = scanner.nextInt();
       
       double sueldo = 0;
       
       if(tipoPuesto == 1){
           sueldo = 15890 + (15890 * 0.10);
       } else if(tipoPuesto == 2){
           sueldo = 25630.89;
       } else if(tipoPuesto == 3){
           sueldo = 35560.20 - (35560.20 * 0.11);
       } else {
           System.out.println("Tipo de puesto inválido. Intente de nuevo.");
       }
       if(tipoPuesto == 1 || tipoPuesto == 2 || tipoPuesto == 3){
        System.out.println("Su sueldo de acuerdo a su tipo de puesto seleccionado que es:  " + tipoPuesto + " es de: " + sueldo);
       }
    }
    
}
