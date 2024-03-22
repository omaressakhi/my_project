/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;
import java.util.Scanner;

/**
 *
 * @author le
 */
public class ex2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez la valeur de X : ");
        int x = scanner.nextInt();
        
        System.out.print("Entrez la valeur de N : ");
        int n = scanner.nextInt();
        
        int resultat = 1;
        for (int i = 0; i < n; i++) {
            resultat *= x;
        }
        
        System.out.println(x + "^" + n + " = " + resultat);
        
        scanner.close();
    }
}
