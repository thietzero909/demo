/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.DangNhap;
import InterFace.InterTK;
import Untils.QuanLyTK;
import java.util.ArrayList;

/**
 *
 * @author thiet
 */
public class SerVictTK implements InterTK{
    QuanLyTK QL  = new QuanLyTK();

    @Override
    public ArrayList<DangNhap> getListTK() {
        return this.QL.getArrList();
    }

    @Override
    public boolean getTK(String ten, String mk) {
        return this.QL.checkTK(ten, mk);
    }

    @Override
    public Integer DK(DangNhap dn) {
        return this.QL.DK(dn);
    }
    
}
