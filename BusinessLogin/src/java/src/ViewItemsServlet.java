/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class ViewItemsServlet extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String phone=request.getParameter("phone");
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DessertsOnTime_Database","srikar","sharan");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM ITEMS WHERE PHONE = '"+phone+"'");
        while(rs.next())
        {
                        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");
            out.println("<link rel=\"stylesheet\" href=\"assets/css/style-liberty.css\">");
            out.println("</head>");
            out.println("<body><header id=\"site-header\" class=\"fixed-top\">\n" +
"        <div class=\"container\">\n" +
"            <nav class=\"navbar navbar-expand-lg navbar-light stroke py-lg-0\">\n" +
"                <h1><a class=\"navbar-brand pe-xl-5 pe-lg-4\" href=\"index.jsp\">\n" +
"                        <span class=\"w3yellow\">Desserts</span> On Time\n" +
"                    </a></h1>\n" +
"                <button class=\"navbar-toggler collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarScroll\" aria-controls=\"navbarScroll\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"                    <span class=\"navbar-toggler-icon fa icon-expand fa-bars\"></span>\n" +
"                    <span class=\"navbar-toggler-icon fa icon-close fa-times\"></span>\n" +
"                </button>\n" +
"                <div class=\"collapse navbar-collapse\" id=\"navbarScroll\">\n" +
"				</div>\n" +
"                <ul class=\"header-search me-lg-4 d-flex\">\n" +
"                    <li class=\"get-btn me-2\">\n" +
"                        <a href=\"index.jsp\" class=\"btn btn-style btn-primary\" title=\"search\"><i class=\"fas fa-user me-lg-2\"></i> <span class=\"btn-texe-inf\">Admin</span></a>\n" +
"                    </li>\n" +
"                </ul>\n" +
"                <!-- toggle switch for light and dark theme -->\n" +
"                <div class=\"mobile-position\">\n" +
"                    <nav class=\"navigation\">\n" +
"                        <div class=\"theme-switch-wrapper\">\n" +
"                            <label class=\"theme-switch\" for=\"checkbox\">\n" +
"                                <input type=\"checkbox\" id=\"checkbox\">\n" +
"                                <div class=\"mode-container\">\n" +
"                                    <i class=\"gg-sun\"></i>\n" +
"                                    <i class=\"gg-moon\"></i>\n" +
"                                </div>\n" +
"                            </label>\n" +
"                        </div>\n" +
"                    </nav>\n" +
"                </div>\n" +
"                <!-- //toggle switch for light and dark theme -->\n" +
"            </nav>\n" +
"        </div>\n" +
"    </header><br><br><br><br><br><br>");
            out.println("<center>");
            out.println("<h1>");
            out.println(rs.getString(2));
            out.println("</h1>");
            out.println("<br><a href='index.jsp' class=\"btn btn-style btn-primary\"><i class=\"fas fa-arrow-left ms-lg-3 ms-2\">&nbsp;&nbsp;&nbsp;&nbsp;</i> Orders Page</a>");
            out.println("</center>");
            out.println("<br><br><br><footer class=\"w3l-footer-29-main\">\n" +
"        <div class=\"footer-29 py-5\">\n" +
"            <div class=\"container py-lg-4\">\n" +
"                <h2>Special Offer For All Students <br>Flat 50% Discount (Walk-in store)</h2>\n" +
"                \n" +
"                <div class=\"row bottom-copies\">\n" +
"                    <p class=\"copy-footer-29 col-lg-8\">© 2022 DessertsOnTime. All rights reserved | Designed by <a href=\"srikarsharan097.github.io\" target=\"_blank\">Srikar Sharan</a></p>\n" +
"                    <div class=\"col-lg-4 main-social-right mt-lg-0 mt-4\">\n" +
"                        <div class=\"main-social-footer-29\">\n" +
"                            <a href=\"#facebook\" class=\"facebook\"><span class=\"fab fa-facebook-f\"></span></a>\n" +
"                            <a href=\"#twitter\" class=\"twitter\"><span class=\"fab fa-twitter\"></span></a>\n" +
"                            <a href=\"#instagram\" class=\"instagram\"><span class=\"fab fa-instagram\"></span></a>\n" +
"                            <a href=\"#linkd\" class=\"linkd\"><span class=\"fab fa-linkedin-in\"></span></a>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"\n" +
"        <!-- move top -->\n" +
"        <button onclick=\"topFunction()\" id=\"movetop\" title=\"Go to top\">\n" +
"            <span class=\"fa fa-angle-up\"></span>\n" +
"        </button>\n" +
"        <script>\n" +
"            // When the user scrolls down 20px from the top of the document, show the button\n" +
"            window.onscroll = function() {\n" +
"                scrollFunction()\n" +
"            };\n" +
"\n" +
"            function scrollFunction() {\n" +
"                if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {\n" +
"                    document.getElementById(\"movetop\").style.display = \"block\";\n" +
"                } else {\n" +
"                    document.getElementById(\"movetop\").style.display = \"none\";\n" +
"                }\n" +
"            }\n" +
"\n" +
"            // When the user clicks on the button, scroll to the top of the document\n" +
"            function topFunction() {\n" +
"                document.body.scrollTop = 0;\n" +
"                document.documentElement.scrollTop = 0;\n" +
"            }\n" +
"\n" +
"        </script>\n" +
"        <!-- //move top -->\n" +
"    </footer>\n" +
"    <!-- Template JavaScript -->\n" +
"    <script src=\"assets/js/jquery-3.3.1.min.js\"></script>\n" +
"    <script src=\"assets/js/theme-change.js\"></script></body>");
            out.println("</html>");
        }
        rs.close();
        st.close();
        con.close();
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewItemsServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ViewItemsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewItemsServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ViewItemsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
