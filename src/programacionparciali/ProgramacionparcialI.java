
package programacionparciali;
import java.util.Scanner;

public class ProgramacionparcialI {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " +(i+1) + ": ");
            array[i] = sc.nextLine();
        }
        System.out.println("Números originales:");
        nums(array);
        String[] invertido = inverso(array);
        System.out.println("Números invertidos:");
        nums(invertido);
    }
    public static String[] inverso(String[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }
    public static void nums(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}