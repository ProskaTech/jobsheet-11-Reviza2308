/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
    Created By : Muhammad Reviza Dekry - 21343031
*/
package latihan6_encapsulation;

/**
 *
 * @author HP
 */
public class UjiBus2 {
    public static void main(String args[]){
        bus2 busBesar = new bus2(40);
        busBesar.cetak();
        
       busBesar.addPenumpang(15);
        busBesar.cetak();
        
        busBesar.addPenumpang(5);
        busBesar.cetak();
        
        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
}
