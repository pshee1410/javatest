/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.LoaiSach;

/**
 *
 * @author Duc Le
 */
public class LoaiSachDao {

    private final Connection con;

    public LoaiSachDao() {
        con = DbHelper.getConnection();
    }

    public List<LoaiSach> getAll() {
        List<LoaiSach> loais = new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            String sql = "select ma_loai, ten_loai from loai_sach";
            try (ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    loais.add(getLoaiSach(rs));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return loais;
    }

    public int insert(LoaiSach loai) {        
        try {
            PreparedStatement pstmt = con.prepareStatement("insert into loai_sach(ma_loai, ten_loai) values(?,?)");
            pstmt.setInt(1, loai.getMaLoai());
            pstmt.setString(2, loai.getTenLoai());
            int row = pstmt.executeUpdate();
            return row;
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSachDao.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
    private LoaiSach getLoaiSach(ResultSet rs) throws SQLException {
        LoaiSach loai = new LoaiSach();
        loai.setMaLoai(rs.getInt(1));
        loai.setTenLoai(rs.getString(2));
        return loai;
    }
}
