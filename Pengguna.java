/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author naufa
 */
abstract class Pengguna {
    protected String nama;

    public Pengguna(String nama) {
        this.nama = nama;
    }

    public abstract void lihatBuku();

}
