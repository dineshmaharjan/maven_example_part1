/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.mavenprogram.dao.impl;

import com.cibt.mavenprogram.dao.StudentDAO;
import com.cibt.mavenprogram.db.util.JdbcTemplate;
import com.cibt.mavenprogram.db.util.RowMapper;
import com.cibt.mavenprogram.entity.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alucard
 */
public class StudentDAOImpl implements StudentDAO {

    private JdbcTemplate<Student> template = new JdbcTemplate<>();

    @Override
    public int insert(Student t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Student t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getAll() throws Exception {
        return template.query("select * from student", new RowMapper<Student>() {

            @Override
            public Student mapRow(ResultSet rs) throws Exception {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setFirstName(rs.getString("first_name"));
                student.setLastName(rs.getString("last_name"));
                student.setEmail(rs.getString("email"));
                student.setContactNo(rs.getString("contact"));
                student.setAddedDate(rs.getDate("added_date"));
                student.setStatus(rs.getBoolean("status"));

                return student; 
            }
        });
    }

}
