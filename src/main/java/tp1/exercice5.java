/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1;
import java.util.Scanner;

/**
 *
 * @author le
 */
public class exercice5 {   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int n = scanner.nextInt();

        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        System.out.println("Factorielle de " + n + " : " + f);
    }
    
}
