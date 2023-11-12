/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author naufa
 */
public class Anjing extends Hewan{
    public Anjing() {
        this.jenisSuara = "Guk Guk";
    }

    @Override
    public void bersuara() {
        System.out.println("Anjing bersuara: " + jenisSuara);
    }
}
