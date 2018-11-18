/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.mavenprogram.db.util;

import com.cibt.mavenprogram.entity.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alucard
 */
public class JdbcTemplate<T> {
    
    public List<T> query(String sql,RowMapper<T> mapper) throws Exception{
         List<T> rows=new ArrayList<>();
        Class.forName("com.mysql.jdbc.cj.Driver");
        String url="jdbc:mysql//localhost/sje001";
        String user="root";
        String password="";
        
        
        Connection conn=DriverManager
                .getConnection(url, user, password);
        PreparedStatement stmt=conn.prepareStatement(sql);
        ResultSet rs=stmt.getResultSet();
        while (rs.next()) {
            rows.add(mapper.mapRow(rs));
        }
        
        return rows;
    }
    
}
