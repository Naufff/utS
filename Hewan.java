/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author naufa
 */
public class Hewan {
    protected String jenisSuara;

    public Hewan() {
    }

    public Hewan(String jenisSuara) {
        this.jenisSuara = jenisSuara;
    }

    public void bersuara() {
        System.out.println("Hewan bersuara: " + jenisSuara);
    }

    public boolean isMamalia() {
        return true;
    }
}
