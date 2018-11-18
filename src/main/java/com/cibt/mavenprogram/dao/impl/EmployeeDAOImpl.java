/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.mavenprogram.dao.impl;

import com.cibt.mavenprogram.dao.EmployeeDAO;
import com.cibt.mavenprogram.db.util.JdbcTemplate;
import com.cibt.mavenprogram.db.util.RowMapper;
import com.cibt.mavenprogram.entity.Employee;
import com.cibt.mavenprogram.entity.Employee;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
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
public class EmployeeDAOImpl implements EmployeeDAO {

    private JdbcTemplate<Employee> template
            = new JdbcTemplate<>();

    @Override
    public int insert(Employee t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Employee t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee getById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> getAll() throws Exception {
         return template.query("select * from employee", new RowMapper<Employee>() {

            @Override
            public Employee mapRow(ResultSet rs) throws Exception {
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setFirstName(rs.getString("first_name"));
                employee.setLastName(rs.getString("last_name"));
                employee.setEmail(rs.getString("email"));
                employee.setContactNo(rs.getString("contact"));
                employee.setAddedDate(rs.getDate("added_date"));
                employee.setStatus(rs.getBoolean("status"));

                return employee; 
            }
        });
    }
}
