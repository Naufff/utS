/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author naufa
 */
public class Kucing extends Hewan {
    public Kucing() {
        this.jenisSuara = "Meong";
    }

    @Override
    public void bersuara() {
        System.out.println("Kucing bersuara: " + jenisSuara);
    }
}
