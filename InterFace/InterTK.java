/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterFace;

import Entity.DangNhap;
import java.util.ArrayList;

/**
 *
 * @author thiet
 */
public interface InterTK {
    public ArrayList<DangNhap> getListTK();
    public boolean getTK(String ten, String mk);
    public Integer DK(DangNhap dn);
}
