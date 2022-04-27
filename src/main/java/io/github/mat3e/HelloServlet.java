package io.github.mat3e;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "nazwaSerwletu", urlPatterns = {"/api/*"})

public class HelloServlet extends HttpServlet {

    private final Service service;

    @SuppressWarnings("unused")
    public HelloServlet() {
        this(new Service());
    }

    public HelloServlet(Service service) {
        this.service = service;
    }

    private final Logger logger = LoggerFactory.getLogger(HelloServlet.class);
    protected final String QUERY = "name";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Request poszedł");
        resp.getWriter().println(service.ustalPowitanie(req.getParameter(QUERY)));
    }
}
