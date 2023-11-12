/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author naufa
 */
import java.util.Scanner;
public class HewanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis hewan: ");
        String jenisHewan = scanner.next();

        Hewan hewan;
        if (jenisHewan.equals("Kucing")) {
            hewan = new Kucing();
        } else if (jenisHewan.equals("Anjing")) {
            hewan = new Anjing();
        } else {
            System.out.println("Bukan jenis hewan mamalia Kucing atau Anjing");
            return;
        }

        hewan.bersuara();

        if (hewan.isMamalia()) {
            System.out.println("Hewan tersebut adalah mamalia");
        } else {
            System.out.println("Hewan tersebut bukan mamalia");
        }
    } 
}
