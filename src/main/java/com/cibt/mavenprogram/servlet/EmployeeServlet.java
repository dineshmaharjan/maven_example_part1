/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.mavenprogram.servlet;

import com.cibt.mavenprogram.dao.EmployeeDAO;
import com.cibt.mavenprogram.dao.impl.EmployeeDAOImpl;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alucard
 */
@WebServlet(name = "empServlet", urlPatterns={"/employees/*"})
public class EmployeeServlet extends HttpServlet {

    private EmployeeDAO empDAO = new EmployeeDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            request.setAttribute("employees", empDAO.getAll());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        request.getRequestDispatcher("/WEB-INF/views/employees/index.jsp")
                .forward(request, response);
    }

}
