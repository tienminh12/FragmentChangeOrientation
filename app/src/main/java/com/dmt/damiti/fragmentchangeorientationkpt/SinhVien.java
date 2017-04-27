package com.dmt.damiti.fragmentchangeorientationkpt;

import java.io.Serializable;

/**
 * Created by TienMinh on 12-Apr-17.
 */

public class SinhVien implements Serializable{
    private String HoTen;
    private int NamSinh;
    private String DiaChi;
    private String Email;

    public SinhVien(String hoTen, int namSinh, String diaChi, String email) {
        HoTen = hoTen;
        NamSinh = namSinh;
        DiaChi = diaChi;
        Email = email;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
