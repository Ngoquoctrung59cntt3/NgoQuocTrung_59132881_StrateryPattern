/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Trung_PC
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context ct=new context();
        ct.setTinhtoan(new Cong());
        System.out.println("Tổng của 75 + 12 là: "+ct.tinh(75, 12));
        ct.setTinhtoan(new Tru());
        System.out.println("Hiệu của 54 - 78 là: "+ct.tinh(54, 78));
    }
}