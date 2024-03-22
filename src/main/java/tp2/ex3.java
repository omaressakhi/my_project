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
public class ex3 { public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
           
            System.out.print("Entrez un entier N : ");
            int N = scanner.nextInt();
            
            double somme = 0;
            
            
            for (int i = 1; i <= N; i++) {
                somme += 1.0 / i;
            }
            
           
            System.out.println("La somme des " + N + " premiers termes de la série harmonique est : " + somme);
        }
    }
    
}
