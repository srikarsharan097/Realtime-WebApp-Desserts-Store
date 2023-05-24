package src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
/**
 *
 * @author HP
 */
public class AddressServlet extends HttpServlet {

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
        String fullname=request.getParameter("fullname");
        String phone=request.getParameter("phone");
        String housenumber=request.getParameter("housenumber");
        String city=request.getParameter("city");
        String postcode=request.getParameter("postcode");
        Random rand = new Random();
        int orderref = rand.nextInt(1000000);
        String status="";
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DessertsOnTime_Database","srikar","sharan");
        Statement st = con.createStatement();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title></title>");
        out.println("<link rel=\"stylesheet\" href=\"assets/css/style-liberty.css\">");
        out.println("</head>");
        out.println("<body><header id=\"site-header\" class=\"fixed-top\">\n" +
"        <div class=\"container\">\n" +
"            <nav class=\"navbar navbar-expand-lg navbar-light stroke py-lg-0\">\n" +
"                <h1><a class=\"navbar-brand pe-xl-5 pe-lg-4\" href=\"index.html\">\n" +
"                        <span class=\"w3yellow\">Desserts</span> On Time\n" +
"                    </a></h1>\n" +
"                <button class=\"navbar-toggler collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarScroll\" aria-controls=\"navbarScroll\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"                    <span class=\"navbar-toggler-icon fa icon-expand fa-bars\"></span>\n" +
"                    <span class=\"navbar-toggler-icon fa icon-close fa-times\"></span>\n" +
"                </button>\n" +
"                <div class=\"collapse navbar-collapse\" id=\"navbarScroll\">\n" +
"                    \n" +
"                    <!--/search-right-->\n" +
"\n" +
"                </div>\n" +
"                <ul class=\"header-search me-lg-4 d-flex\">\n" +
"                    <li class=\"get-btn me-2\">\n" +
"                        <a href=\"#account\" class=\"btn btn-style btn-primary\" title=\"search\"><i class=\"fas fa-user me-lg-2\"></i> <span class=\"btn-texe-inf\">Account</span></a>\n" +
"                    </li>\n" +
"                </ul>\n" +
"                <!--//search-right-->\n" +
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
"    </header><div style=\"margin: 8px auto; display: block; text-align:center;\">\n" +
"\n" +
"<!---728x90--->\n" +
"\n" +
" \n" +
"</div><br><br><br>");
        out.println("<center>");
        st.executeUpdate("INSERT INTO ADDRESS_DETAILS VALUES ('"+fullname+"','"+phone+"','"+housenumber+"','"+city+"','"+postcode+"','"+status+"','"+orderref+"')");
        out.println("<br><br><h1>Your order has been placed successfully. </h1>");
        out.println("<br><br><h3>Reference ID: </h2><h1>["+orderref+"]</h3>");
        out.println("<br><br><h5>To check your order status, </h5>");
        out.println("<br><br><a href='status.html' class=\"btn btn-style btn-primary\">Click here</a>");
        out.println("</center>");
        out.println("<br><br><br><footer class=\"w3l-footer-29-main\">\n" +
"        <div class=\"footer-29 py-5\">\n" +
"            <div class=\"container py-lg-4\">\n" +
"                <h2>Special Offer For All Students <br>Flat 50% Discount (Promo Code - Student50)</h2>\n" +
"                <div class=\"row footer-top-29 mt-md-5\">\n" +
"                   <div class=\"col-lg-3 col-md-6 footer-list-29 footer-3 pe-lg-5\">\n" +
"                        <h6 class=\"footer-title-29\">Useful Links</h6>\n" +
"                        <div class=\"footer-listw3-grids\">\n" +
"                            <ul class=\"footer-listw3\">\n" +
"                                <li><a href=\"index.html\">Home</a></li>\n" +
"                                <li><a href=\"about.html\">About</a></li>\n" +
"                                <li><a href=\"blog.html\">Desserts</a></li>\n" +
"                                <li><a href=\"contact.html\">Cold Items</a></li>\n" +
"                                <li><a href=\"#support\">Snacks & Lunch</a></li>\n" +
"\n" +
"                            </ul>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                    <div class=\"col-lg-3 col-md-6 footer-list-29 footer-1 ps-lg-5 mt-lg-0 mt-md-5 mt-4\">\n" +
"                        <h6 class=\"footer-title-29\">Information</h6>\n" +
"                        <div class=\"footer-listw3-grids\">\n" +
"                            <ul class=\"footer-listw3\">\n" +
"                                <li><a href=\"#order\">Order Tracking</a></li>\n" +
"								<li><a href=\"#news\">Contact</a></li>\n" +
"                                <li><a href=\"#faq\">FAQ</a></li>\n" +
"                            </ul>\n" +
"\n" +
"                        </div>\n" +
"\n" +
"                    </div>\n" +
"                    <div class=\"col-lg-3 col-md-6 footer-list-29 footer-3 mt-lg-0 mt-md-5 mt-4 pe-lg-5\">\n" +
"                        <h6 class=\"footer-title-29\">Address</h6>\n" +
"                        <div class=\"footer-listw3-grids\">\n" +
"                            <ul class=\"footer-listw3\">\n" +
"                                <li>Leicester, UK</li>\n" +
"                                <li>Desserts Street</li>\n" +
"                                <li>Postcode LE1 2DT</li>\n" +
"                                <li><a href=\"tel:+(21) 255 999 8888\">+44 7469 272 661</a></li>\n" +
"                                <li><a href=\"mailto:ShoppyKart@mail.com\" class=\"mail\">dessertsontime@mail.com</a></li>\n" +
"\n" +
"                            </ul>\n" +
"\n" +
"                        </div>\n" +
"                    </div>\n" +
"					<div class=\"col-lg-3 col-md-6 footer-list-29 footer-4 mt-lg-0 mt-md-5 mt-4  ps-lg-5\">\n" +
"                        <h6 class=\"footer-title-29\">Payment Method</h6>\n" +
"                        <ul class=\"pay-method-grids\">\n" +
"                            <li><a class=\"pay-method\" href=\"#\"><span class=\"fab fa-cc-visa\" aria-hidden=\"true\"></span></a>\n" +
"                            </li>\n" +
"                            <li><a class=\"pay-method\" href=\"#\"><span class=\"fab fa-cc-discover\" aria-hidden=\"true\"></span></a>\n" +
"                            </li>\n" +
"                            <li><a class=\"pay-method\" href=\"#\"><span class=\"fab fa-cc-paypal\" aria-hidden=\"true\"></span></a>\n" +
"                            </li>\n" +
"                            <li><a class=\"pay-method\" href=\"#\"><span class=\"fab fa-cc-mastercard\" aria-hidden=\"true\"></span></a>\n" +
"                            <li><a class=\"pay-method\" href=\"#\"><span class=\"fab fa-cc-stripe\" aria-hidden=\"true\"></span></a>\n" +
"                            <li><a class=\"pay-method\" href=\"#\"><span class=\"fab fa-cc-amex\" aria-hidden=\"true\"></span></a>\n" +
"                            </li>\n" +
"                            <li><a class=\"pay-method\" href=\"#\"><span class=\"fab fa-cc-jcb\" aria-hidden=\"true\"></span></a>\n" +
"                            </li>\n" +
"                            <li><a class=\"pay-method\" href=\"#\"><span class=\"cc-diners-club\" aria-hidden=\"true\"></span></a>\n" +
"                            </li>\n" +
"\n" +
"                        </ul>\n" +
"                    </div>\n" +
"                </div>\n" +
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
"    </footer></body>");
        out.println("</html>");
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
            Logger.getLogger(AddressServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddressServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AddressServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddressServlet.class.getName()).log(Level.SEVERE, null, ex);
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
