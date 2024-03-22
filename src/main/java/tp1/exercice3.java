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
public class exercice3 {  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier entier : ");
        int a = scanner.nextInt();
        System.out.print("Entrez le deuxième entier : ");
        int b = scanner.nextInt();

        System.out.println("Avant permutation : a = " + a + ", b = " + b);

        int t = a;
        a = b;
        b = t;

        System.out.println("Après permutation : a = " + a + ", b = " + b);
    }
    
}
