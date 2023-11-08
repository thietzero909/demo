/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Untils;
import Untils.DBConnect;
import Entity.DangNhap;
import Entity.SinhVien;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author thiet
 */
public class QuanLyTK {
    private ArrayList<DangNhap> arrList;
    Connection conn = DBConnect.getConnection();

    public QuanLyTK() {
        this.arrList = new ArrayList<>();
    }

    public ArrayList<DangNhap> getArrList() {
        this.arrList = new ArrayList<>();
        try {
            String sql = "select * from DANGNHAP";
            PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                DangNhap dn;
                String name = rs.getString(1);
                String pass = rs.getString(2);
                String cv = rs.getString(3);
                dn = new DangNhap(name, pass, cv);
                this.arrList.add(dn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrList;
    }

    public void setArrList(ArrayList<DangNhap> arrList) {
        this.arrList = arrList;
    }
    
    public Integer DK(DangNhap dn){
        try {
            String sql = "Insert into DANGNHAP values (?,?,?)";
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1, dn.getName());
            ps.setString(2, dn.getPass());
            ps.setString(3, dn.getChucVu());
            int row = ps.executeUpdate();
            if(row  > 0){
                return row;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean checkTK(String ten, String ma){
        this.arrList = new ArrayList<>();
        for (DangNhap dn : arrList) {
            if(ten.equals(dn.getName()) && ma.equals(dn.getPass())){
                return true;
            }
        }
        return false;
    }
    
}
