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
public class ex4 {  public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Entrez le nombre de lignes N : ");
            int N = scanner.nextInt();
            
            
            for (int i = 1; i <= N; i++) {
                
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
               
                System.out.println();
            }
        }
    }

    
}
