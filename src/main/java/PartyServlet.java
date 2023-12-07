import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PartyServlet", value = "/PartyServlet")
public class PartyServlet extends HttpServlet {

    private String name;

    public void init() {
        name = "Geen naam";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Schrijf u in voor het nieuwjaarsfeestje</h2>");
        out.println("<br>");
        out.println("<form action=" + request.getContextPath() + request.getServletPath() + " method='post'>");
        out.println("<label for=\"studentName\" style=\"display: inline-block; margin-bottom: 5px;\">Student naam:</label>");
        out.println("<input type=\"text\" id=\"studentName\" name=\"studentName\" placeholder=\"" + this.name + "\">");
        out.println("<br>");
        out.println("<input type='submit' value='Inschrijven'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userName = request.getParameter("studentName");

        if (userName != null && !userName.isBlank()) {
            this.name = userName;
        }

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Bedankt " + this.name + ". U bent ingeschreven</h2>");
        out.println("<br>");
        out.println("<p><a href=PartyServlet>Keer terug naar inschrijving</a></p>");
        out.println("</body></html>");
    }

    public void destroy() {

    }
}
