package be.ucll.nieuwjaarsfeest;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        servletContextEvent.getServletContext().setAttribute("daysCalculator", new DaysCalculator());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        // TODO Cleanup code
    }
}
