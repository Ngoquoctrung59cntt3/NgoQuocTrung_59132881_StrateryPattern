/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Trung_PC
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HangHoa hanghoa1 = new HangHoa("Dell 7559", 2445000, "Laptop Dell-7559 BLACK RAM-8GB, GTX960");
        HangHoa hanghoa2 = new HangHoa("HP Pavilion G4", 1500000, "Laptop HP Pavilion G4 WHILTE RAM-4GB, GTX660");
        HangHoa hanghoa3 = new HangHoa("Dell G7", 2530000, "Laptop Dell G7 BLUE RAM-8GB, GTX1080");
        
        GioHang gh1 = new GioHang();
        gh1.themHH(hanghoa1);
        gh1.themHH(hanghoa2);
        gh1.themHH(hanghoa3);
        gh1.setHinhThucTT(new ThanhToanCOD());
        gh1.inDSHH();
        System.out.println("Tiền khách phải thanh toán trên COD: "+gh1.getThanhToan(gh1.getTienHang())+"\n");
        
        GioHang gh2 = new GioHang();
        gh2.themHH(hanghoa1);
        gh2.themHH(hanghoa2);
        gh2.themHH(hanghoa3);
        gh2.setHinhThucTT(new ThanhToanOnline());
        gh2.inDSHH();
        System.out.println("Tiền khách phải thanh toán trên Online: "+gh2.getThanhToan(gh2.getTienHang())+"\n");
    }
    
}