/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.mavenprogram.servlet;

import com.cibt.mavenprogram.dao.StudentDAO;
import com.cibt.mavenprogram.dao.impl.StudentDAOImpl;
import com.cibt.mavenprogram.entity.Student;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alucard
 */


public class HomeServlet extends HttpServlet {
    
    private StudentDAO studentDAO = null;
    
    @Override
    public void init() throws ServletException {
        studentDAO = new StudentDAOImpl();
    }
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setAttribute("students", studentDAO.getAll());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        request
                .getRequestDispatcher("/WEB-INF/views/home.jsp")
                .forward(request, response);
        
    }
    
}
