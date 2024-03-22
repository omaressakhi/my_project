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
public class exercice1 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier entier : ");
        int a = scanner.nextInt();
        System.out.print("Entrez le deuxième entier : ");
        int b = scanner.nextInt();

        int s = a + b;
        int d = a - b;
        int p = a * b;
        double q = b != 0 ? (double) a / b : Double.POSITIVE_INFINITY;

        System.out.println("Somme : " + s);
        System.out.println("Différence : " + d);
        System.out.println("Produit : " + p);
        System.out.println("Quotient : " + q);
    }
}
    

