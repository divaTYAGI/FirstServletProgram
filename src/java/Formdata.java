/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tejasv Pratap Tyagi
 */
public class Formdata extends HttpServlet {

   
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
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      Enumeration e= request.getParameterNames();
      while(e.hasMoreElements()){
      String pname= (String) e.nextElement();
      String[] pval=request.getParameterValues(pname);
      out.println(pname +" : ");
          for (int i = 0; i < pval.length; i++) {
              out.println(pval[i]);
          }
          out.println("<br>");
      }
      out.close();
    }

   
}
