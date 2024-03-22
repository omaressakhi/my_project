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
public class ex3 {public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Entrez un entier positif supérieur à 1 : ");
        int n = s.nextInt();
        int somme = 0;
        if (n <= 1) {
            System.out.println(n + " n'est pas un nombre parfait.");
        } else {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    somme += i;
                }
            }
            if (somme == n) {
                System.out.println(n + " est un nombre parfait.");
            } else {
                System.out.println(n + " n'est pas un nombre parfait.");
            }
        }
    }
    
}
