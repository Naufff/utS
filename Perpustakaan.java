/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author naufa
 */
public class Perpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pengguna pengguna;

        System.out.println("Masukkan jenis pengguna: ");
        String jenisPengguna = System.console().readLine();

        if (jenisPengguna.equals("user")) {
            pengguna = new User("Namanama");
        } else if (jenisPengguna.equals("admin")) {
            pengguna = new Admin("Adminadmin");
        } else {
            System.out.println("Jenis pengguna tidak valid");
            return;
        }

        pengguna.lihatBuku();

        if (pengguna instanceof Admin) {
            System.out.println("Anda adalah admin");
            System.out.println("Apakah Anda ingin menambahkan buku? (Y/N)");
            String input = System.console().readLine();

            if (input.equals("Y")) {
            }

            System.out.println("Apakah Anda ingin menghapus buku? (Y/N)");
            input = System.console().readLine();

            if (input.equals("Y")) {
            }
        }
    }
    
}
