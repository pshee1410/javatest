/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoaiSach;
import model.dao.LoaiSachDao;

/**
 *
 * @author Duc Le
 */
@WebServlet(name = "Lab9_3", urlPatterns = {"/lab9_3"})
public class Lab9_3 extends HttpServlet {
    private LoaiSachDao loaiSachDao;

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        loaiSachDao = new LoaiSachDao();
    }
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
        String action = request.getParameter("action");
        if (action!=null) {
            switch (action) {
                case "Add":
                    int ma_loai = Integer.parseInt(request.getParameter("ma_loai"));
                    String ten_loai = request.getParameter("ten_loai");
                    LoaiSach loai = new LoaiSach(ma_loai, ten_loai);
                    int code = loaiSachDao.insert(loai);
                    
                    break;
                case "delete":

                    break;
                case "update":

                    break;
            }
        }
        
        HttpSession ses = request.getSession(true);                
        List<LoaiSach> loais = loaiSachDao.getAll();
        ses.setAttribute("loais", loais);
        response.sendRedirect("./lab9_3.jsp");
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
