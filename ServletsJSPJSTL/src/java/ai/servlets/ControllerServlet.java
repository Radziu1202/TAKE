package ai.servlets;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import ai.beans.ColorBean;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@WebServlet(name = "ControllerServlet", urlPatterns = {"/ControllerServlet"})
public class ControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        ArrayList members = new ArrayList();
        members.add("John Lennon");
        members.add("Paul McCartney");
        members.add("Ringo Starr");
        members.add("George Harrison");
        request.setAttribute("members", members);
        
        
        
        Calendar calDate = new GregorianCalendar();
        calDate.set(1965, Calendar.SEPTEMBER, 13);
        Date releaseDate = calDate.getTime();
        request.setAttribute("releaseDate", releaseDate);
        
        ColorBean myBean = new ColorBean();
        myBean.setForegroundColor(request.getParameter("foreColor"));
        myBean.setBackgroundColor(request.getParameter("backColor"));
        String frame = request.getParameter("frameAppearance");
        if ( frame.equals("enable")){
            myBean.setFrameAppearance(1);
        }else{
            myBean.setFrameAppearance(0);
        }
        
        request.setAttribute("bean", myBean);
        ServletContext ctx = this.getServletContext();
        RequestDispatcher dispatcher
                = ctx.getRequestDispatcher("/yesterday.jsp");
        dispatcher.forward(request, response);
    }
}
