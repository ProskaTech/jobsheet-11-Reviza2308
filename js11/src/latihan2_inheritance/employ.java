/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
    Created By : Muhammad Reviza Dekry - 21343031
*/
package latihan2_inheritance;

/**
 *
 * @author HP
 */
public class employ extends person {
    private String noKaryawan;
    
    public employ (String noKaryawan, String name, int age){
        super(name, age);
        this.noKaryawan = noKaryawan;
    }
    
    public void info(){
        System.out.println("No. Karyawan : " + this.noKaryawan);
        super.info();
    }
}
