/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author thiet
 */
public class SinhVien {
    private String ma, ten, email, sdt, dichi, hinh;
    private boolean gt;

    public SinhVien() {
    }
    
    public SinhVien(String ma, String ten){
        this.ma = ma;
        this.ten = ten;
    }
    
    public SinhVien(String ma, String ten, String email, String sdt, boolean gt, String dichi, String hinh) {
        this.ma = ma;
        this.ten = ten;
        this.email = email;
        this.sdt = sdt;
        this.dichi = dichi;
        this.hinh = hinh;
        this.gt = gt;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDichi() {
        return dichi;
    }

    public void setDichi(String dichi) {
        this.dichi = dichi;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }
    
    
}
