/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
    Created By : Muhammad Reviza Dekry - 21343031
*/

package latihan1_inheritance;

/**
 *
 * @author HP
 */
public class kedua extends pertama {
    private int b = 8;
    
    protected void BacaSuper(){
        System.out.println("Nilai b = " + b);
        terprotek();
        info();
    }
}
