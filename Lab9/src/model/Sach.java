/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Duc Le
 */
public class Sach implements Serializable {
    private int maSach;
    private String tuaDe;
    private int gia;
    private int maLoai;

    public Sach(int maSach, String tuaDe, int gia, int maLoai) {
        this.maSach = maSach;
        this.tuaDe = tuaDe;
        this.gia = gia;
        this.maLoai = maLoai;
    }

    public Sach() {
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTuaDe() {
        return tuaDe;
    }

    public void setTuaDe(String tuaDe) {
        this.tuaDe = tuaDe;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }
    
    
}
