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
public class exercice4 {  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un réel x : ");
        double x = scanner.nextDouble();
        System.out.print("Entrez un entier n : ");
        int n = scanner.nextInt();

        double r = 1;
        for (int i = 0; i < n; i++) {
            r *= x;
        }

        System.out.println(x + " à la puissance " + n + " = " + r);
    }

    
}

