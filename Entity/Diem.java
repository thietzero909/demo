/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author thiet
 */
public class Diem {
    private SinhVien sv;
    private double tiengAnh, tin, GDTC;

    public Diem() {
    }

    public Diem(SinhVien sv, double tiengAnh, double tin, double GDTC) {
        this.sv = sv;
        this.tiengAnh = tiengAnh;
        this.tin = tin;
        this.GDTC = GDTC;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public double getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(double tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public double getTin() {
        return tin;
    }

    public void setTin(double tin) {
        this.tin = tin;
    }

    public double getGDTC() {
        return GDTC;
    }

    public void setGDTC(double GDTC) {
        this.GDTC = GDTC;
    }
    
    
}
