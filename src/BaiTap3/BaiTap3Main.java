/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author Trung_PC
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException{
        // TODO code application logic here
        SimpleDateFormat ns = new SimpleDateFormat("dd/MM/yyyy");
        SinhVien sv1 = new SinhVien("Ngô Quốc Trung", ns.parse("24/08/1999"), 7.0f);
        SinhVien sv2 = new SinhVien("Nguyễn Viết Hưng", ns.parse("08/08/1999"), 8.5f);
        SinhVien sv3 = new SinhVien("Nguyễn Ngọc Thanh", ns.parse("11/11/1999"), 7.5f);
        SinhVien sv4 = new SinhVien("Huỳnh Thế Minh", ns.parse("15/05/1999"), 8.6f);
        SinhVien sv5 = new SinhVien("Phan Tháu Tiến", ns.parse("25/02/1999"), 9.0f);
        SinhVien sv6 = new SinhVien("Trịnh Minh Nhật", ns.parse("19/04/1999"), 9.5f);
        QLSV DSSV = new QLSV();
        DSSV.themSV(sv1);
        DSSV.themSV(sv2);
        DSSV.themSV(sv3);
        DSSV.themSV(sv4);
        DSSV.themSV(sv5);
        DSSV.themSV(sv6);
        
        DSSV.setSoSanh(new SoSanhTheoTen());
        DSSV.sapXep();
        System.out.println("Sắp xếp danh sách sinh viên theo tên:"+"\n");
        DSSV.inDS();
        
        DSSV.setSoSanh(new SoSanhTheoDiem());
        DSSV.sapXep();
        System.out.println("Sắp xếp danh sách sinh viên theo điểm:"+"\n");
        DSSV.inDS();
    }
    
}