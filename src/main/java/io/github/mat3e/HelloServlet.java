package io.github.mat3e;

import org.slf4j.*;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="nazwaSerwletu",urlPatterns = {"/api/*"})

public class HelloServlet extends HttpServlet {

    private final Logger logger = LoggerFactory.getLogger(HelloServlet.class);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Request poszedł");
        ;
        if(req.getParameterMap().containsKey("name"))
            resp.getWriter().println("Hello "+ req.getParameter("name"));

        else
            resp.getWriter().println("Hello world");

    }


}
