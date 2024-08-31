/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.proyectojds.registroEmpleados;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
@WebServlet(name = "registroEmpleado", urlPatterns = {"/registroEmpleado"})
public class registroEmpleado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String documento= request.getParameter("documento");
        String nombre= request.getParameter("nombre");
        String edad= request.getParameter("edad");
        String correo_electronico= request.getParameter("correo_electronico");
        String direccion= request.getParameter("direccion");
        String telefono= request.getParameter("telefono");
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registroEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        String url="jdbc:mysql://localhost:8111/proyecto";//direccion de la conexion
        Connection conexion;//parametro de conexion
        Statement statement;//declaracion para realizar las consultas
        ResultSet rs;//variable para almacenar las consultas
        
        try {
            conexion=DriverManager.getConnection(url,"root", "");
            statement=conexion.createStatement();// creo la conexion
            rs=statement.executeQuery("SELECT INTO usuarios (documento,nombre,edad,correo_electronico,direccion,telefono) VALUES(?,?,?,?,?,?)");
            
        } catch (SQLException ex) {
            Logger.getLogger(registroEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
