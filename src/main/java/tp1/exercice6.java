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
public class exercice6 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez a : ");
        double a = scanner.nextDouble();
        System.out.print("Entrez b : ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("L'équation a une infinité de solutions.");
            } else {
                System.out.println("L'équation n'a pas de solution.");
            }
        } else {
            double x = -b / a;
            System.out.println("L'équation a une solution : " + x);
        }
    }
}
