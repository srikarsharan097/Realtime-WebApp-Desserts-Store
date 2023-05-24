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
public class PasswordServlet extends HttpServlet {

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
            String key=request.getParameter("key");
            String email=request.getParameter("email");
            String pw=request.getParameter("pw");
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DessertsOnTime_Database","srikar","sharan");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM CUSTOMER_DETAILS");
            while(rs.next())
            {
                if(key.equalsIgnoreCase(rs.getString(5)) && email.equalsIgnoreCase(rs.getString(2)))
                {
                    st.execute("UPDATE CUSTOMER_DETAILS SET PASSWORD='"+pw+"' WHERE EMAIL='"+email+"'");
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title></title>");
                    out.println("<link rel=\"stylesheet\" href=\"assets/css/style-liberty.css\">");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<center>");
                    out.println("<br><br><h1>Your password has been changed successfully</h1>");
                    out.println("<br><br><a href='login.html' class=\"btn btn-style btn-primary\">Login</a>");
                    out.println("</center>");
                    out.println("</body>");
                    out.println("</html>");
                }
                else
                {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title></title>");
                    out.println("<link rel=\"stylesheet\" href=\"assets/css/style-liberty.css\">");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<center>");
                    out.println("<br><br><h1>Incorrect Details!</h1>");
                    out.println("<br><br><a href='changepassword.html' class=\"btn btn-style btn-primary\">Try again</a>");
                    out.println("</center>");
                    out.println("</body>");
                    out.println("</html>");
                }
            }
            
            
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
            Logger.getLogger(PasswordServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PasswordServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(PasswordServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PasswordServlet.class.getName()).log(Level.SEVERE, null, ex);
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
