/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp12;
import java.util.Scanner;

/**
 *
 * @author le
 */
public class ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Entrez le premier entier : ");
        int n = s.nextInt();
        System.out.print("Entrez le deuxième entier : ");
        int m = s.nextInt();
        
        int sommeN = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sommeN += i;
            }
        }
        
        int sommeM = 1;
        for (int i = 2; i <= m / 2; i++) {
            if (m % i == 0) {
                sommeM += i;
            }
        }
        
        if (sommeN == m && sommeM == n) {
            System.out.println(n + " et " + m + " sont des nombres amis.");
        } else {
            System.out.println(n + " et " + m + " ne sont pas des nombres amis.");
        
        }
        
   }
    
}
