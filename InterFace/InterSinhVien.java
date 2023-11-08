/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterFace;

import Entity.SinhVien;
import java.util.ArrayList;

/**
 *
 * @author thiet
 */
public interface InterSinhVien {
    public ArrayList<SinhVien> getListSV();
    public Integer them(SinhVien sv);
    public Integer sua(String ma, SinhVien sv);
    public Integer xoa(String ma);
}
