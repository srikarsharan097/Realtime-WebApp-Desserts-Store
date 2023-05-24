package src;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class SuccessfulLogin extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SuccessfulLogin</title>");  
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
"                    <ul class=\"navbar-nav me-lg-auto my-2 my-lg-0 navbar-nav-scroll\">\n" +
"                        <li class=\"nav-item\">\n" +
"                            <a class=\"nav-link active\" aria-current=\"page\" href=\"index.html\">Home</a>\n" +
"                        </li>\n" +
"                        <li class=\"nav-item dropdown\">\n" +
"                            <a class=\"nav-link dropdown-toggle\" href=\"#Pages\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n" +
"                                Desserts <span class=\"fa fa-angle-down ms-1\"></span>\n" +
"                            </a>\n" +
"                            <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n" +
"                                <li><a class=\"dropdown-item pt-2\" href=\"desserts.html\">Cookie Dough</a></li>\n" +
"                                <li><a class=\"dropdown-item\" href=\"desserts.html\">Waffle</a></li>\n" +
"                                <li><a class=\"dropdown-item\" href=\"desserts.html\">American Pancake</a></li>\n" +
"				<li><a class=\"dropdown-item\" href=\"desserts.html\">Brownie Blast</a></li>\n" +
"				<li><a class=\"dropdown-item\" href=\"desserts.html\">Choco Kebab</a></li>\n" +
"                            </ul>\n" +
"                        </li>\n" +
"                        <li class=\"nav-item dropdown\">\n" +
"                            <a class=\"nav-link dropdown-toggle\" href=\"#Pages\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n" +
"                                 Cold Items<span class=\"fa fa-angle-down ms-1\"></span>\n" +
"                            </a>\n" +
"                            <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n" +
"                                <li><a class=\"dropdown-item pt-2\" href=\"cold_items.html\">Milk Shakes</a></li>\n" +
"                                <li><a class=\"dropdown-item\" href=\"cold_items.html\">Sundaes</a></li>\n" +
"                                <li><a class=\"dropdown-item\" href=\"cold_items.html\">Smoothies</a></li>\n" +
"                                <li><a class=\"dropdown-item\" href=\"cold_items.html\">Ice Blast</a></li>\n" +
"				<li><a class=\"dropdown-item\" href=\"error.html\">Mojitos</a></li>\n" +
"                            </ul>\n" +
"                        </li>\n" +
"			<li class=\"nav-item\">\n" +
"                            <a class=\"nav-link\" href=\"snacks_lunch.html\">Snacks & Lunch</a>\n" +
"                        </li>\n" +
"                    </ul>\n" +
"                    <!--/search-right-->\n" +
"\n" +
"                </div>\n" +
"                <ul class=\"header-search me-lg-4 d-flex\">\n" +
"                    <li class=\"get-btn me-2\">\n" +
"                        <a href=\"login.html\" class=\"btn btn-style btn-primary\" title=\"search\"><i class=\"fas fa-user me-lg-2\"></i> <span class=\"btn-texe-inf\">Login</span></a>\n" +
"                    </li>\n" +
"                    <li class=\"shopvcart galssescart2 cart cart box_1 get-btn\">\n" +
"                        <form action=\"#\" method=\"post\" class=\"last\">\n" +
"                            <input type=\"hidden\" name=\"cmd\" value=\"_cart\">\n" +
"                            <input type=\"hidden\" name=\"display\" value=\"1\">\n" +
"                            <button class=\"top_shopv_cart\" type=\"submit\" name=\"submit\" value=\"\">\n" +
"                                <span class=\"fas fa-shopping-bag me-lg-2\"></span> <span class=\"btn-texe-inf\">Basket</span>\n" +
"\n" +
"                            </button>\n" +
"                        </form>\n" +
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
"    </header><br><br><br>");
            out.println("<center>");
            out.println("<br><br><h1>You have been logged in successfully</h1>");
            out.println("<br><br><a href=\"desserts.html\" class=\"btn btn-style btn-primary\"> View Items</a>");
            //out.println("<h1>Servlet SuccessfulLogin at " + request.getContextPath() + "</h1>");
            out.println("</center>");
            out.println("<br><br><br><footer class=\"w3l-footer-29-main\">\n" +
"        <div class=\"footer-29 py-5\">\n" +
"            <div class=\"container py-lg-4\">\n" +
"                <h2>Special Offer For All Students <br>Flat 50% Discount (Walkin - Store)</h2>\n" +
"                <div class=\"row footer-top-29 mt-md-5\">\n" +
"					<div class=\"col-lg-3 col-md-6 footer-list-29 footer-3 pe-lg-5\">\n" +
"                        <h6 class=\"footer-title-29\">Useful Links</h6>\n" +
"                        <div class=\"footer-listw3-grids\">\n" +
"                            <ul class=\"footer-listw3\">\n" +
"                                <li><a href=\"index.html\">Home</a></li>\n" +
"                                <li><a href=\"login.html\">Login</a></li>\n" +
"                                <li><a href=\"desserts.html\">Desserts</a></li>\n" +
"                                <li><a href=\"cold_items.html\">Cold Items</a></li>\n" +
"                                <li><a href=\"snacks_lunch.html\">Snacks & Lunch</a></li>\n" +
"\n" +
"                            </ul>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                    <div class=\"col-lg-3 col-md-6 footer-list-29 footer-1 ps-lg-5 mt-lg-0 mt-md-5 mt-4\">\n" +
"                        <h6 class=\"footer-title-29\">Information</h6>\n" +
"                        <div class=\"footer-listw3-grids\">\n" +
"                            <ul class=\"footer-listw3\">\n" +
"                                <li><a href=\"#order\">Order Tracking</a></li>\n" +
"								<li><a href=\"#contact\">Contact</a></li>\n" +
"                                <li><a href=\"#faq\">FAQ</a></li>\n" +
"                            </ul>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                    <div class=\"col-lg-3 col-md-6 footer-list-29 footer-3 mt-lg-0 mt-md-5 mt-4 pe-lg-5\">\n" +
"                        <h6 class=\"footer-title-29\">Address</h6>\n" +
"                        <div class=\"footer-listw3-grids\">\n" +
"                            <ul class=\"footer-listw3\">\n" +
"                                <li>Leicester, UK</li>\n" +
"                                <li>Desserts Street</li>\n" +
"                                <li>Postcode LE1 2DT</li>\n" +
"                                <li><a href=\"tel:+(44) 7469 272 661\">+44 7469 272 661</a></li>\n" +
"                                <li><a href=\"mailto:dessertsontime@mail.com\" class=\"mail\">dessertsontime@mail.com</a></li>\n" +
"                            </ul>\n" +
"                        </div>\n" +
"                    </div>\n" +
"\n" +
"                    <div class=\"col-lg-3 col-md-6 footer-list-29 footer-4 mt-lg-0 mt-md-5 mt-4  ps-lg-5\">\n" +
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
"    </footer>\n" +
"    <!-- Template JavaScript -->\n" +
"    <script src=\"assets/js/jquery-3.3.1.min.js\"></script>\n" +
"    <script src=\"assets/js/theme-change.js\"></script></body>");
            out.println("</html>");
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
