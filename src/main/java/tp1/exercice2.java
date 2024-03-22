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
public class exercice2 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le rayon du cercle : ");
        double r = scanner.nextDouble();

        double s = Math.PI * r * r;
        double p = 2 * Math.PI * r;

        System.out.println("Surface du cercle : " + s);
        System.out.println("Périmètre du cercle : " + p);
    }
}
