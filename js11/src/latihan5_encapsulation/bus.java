/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
    Created By : Muhammad Reviza Dekry - 21343031
*/
package latihan5_encapsulation;

/**
 *
 * @author HP
 */
public class bus {
    public int penumpang;
    public int maxPenumpang;
    
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }
}
