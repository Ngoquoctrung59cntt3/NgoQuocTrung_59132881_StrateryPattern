/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Trung_PC
 */
public class QLSV {
    List<SinhVien> dssv = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;
    
    public void themSV(SinhVien sinhvien) {
        dssv.add(sinhvien);
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }
    
    public void sapXep() {
        SinhVien sv = new SinhVien();
        for(int i=0; i<dssv.size(); i++) {
            for(int j=i+1; j<dssv.size(); j++) {
                if(soSanh.soSanh(dssv.get(i), dssv.get(j)) <= 0) {
                    sv = dssv.get(i);
                    dssv.set(i, dssv.get(j));
                    dssv.set(j, sv);
                }
            }
        }
        
    }
    
    public void inDS() {
        for(SinhVien sinhVien: dssv) {
            System.out.println(sinhVien.inTT()+"\n");
        }
    }
}