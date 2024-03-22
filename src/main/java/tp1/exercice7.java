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
public class exercice7 { public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez a : ");
        double a = scanner.nextDouble();
        System.out.print("Entrez b : ");
        double b = scanner.nextDouble();
        System.out.print("Entrez c : ");
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("L'équation a une infinité de solutions.");
                } else {
                    System.out.println("L'équation n'a pas de solution.");
                }
            } else {
                double x = -c / b;
                System.out.println("L'équation a une solution : " + x);
            }
        } else {
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("L'équation a deux solutions : " + x1 + " et " + x2);
            } else if (d == 0) {
                double x = -b / (2 * a);
                System.out.println("L'équation a une solution double : " + x);
            } else {
                System.out.println("L'équation n'a pas de solution réelle.");
            }
        }
    }
    
}
