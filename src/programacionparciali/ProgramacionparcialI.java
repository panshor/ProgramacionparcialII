/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacionparciali;

import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class ProgramacionparcialI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Digite su divisa (dolar o peso): ");
        String divisa = leer.nextLine();
        if(divisa.equals("dolar")){
            System.out.println("Digite los dólares: ");
            int dolar = leer.nextInt();
            int conversion = dolar*4700;
            System.out.println("Su conversión es: "+conversion+" pesos");
            
        }
        if(divisa.equals("peso")){
            System.out.println("Digite los pesos: ");
            int peso = leer.nextInt();
            float conversionp = peso/4700;
            System.out.println("Su conversión es: "+conversionp+" dolares");
        }

    }
    }
    

