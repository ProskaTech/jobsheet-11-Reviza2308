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
public class pertama {
    private int a = 10;
    
    protected void terprotek(){
        System.out.println("Method ini hanya untuk anaknya");
    }
    
    public void info(){
        System.out.println("a = " + a);
        System.out.println("Dipanggil pada = " + this.getClass().getName());
    }
}