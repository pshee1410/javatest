/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Sach;

/**
 *
 * @author Duc Le
 */
public class SachDao {
    private final Connection con;

    public SachDao() {
        con = DbHelper.getConnection();
    }
    
    public List<Sach> getAll() {
        List<Sach> sachs = new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            String sql = "select ma_sach, tua_de, gia, ma_loai from sach";
            try (ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    sachs.add(getSach(rs));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sachs;
    }

    private Sach getSach(ResultSet rs) throws SQLException {
        Sach sach = new Sach();
        sach.setMaSach(rs.getInt(1));
        sach.setTuaDe(rs.getString(2));
        sach.setGia(rs.getInt(3));
        sach.setMaLoai(rs.getInt(4));
        return sach;
    }
}
