package io.github.mat3e.lang;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet language", urlPatterns = {"/api/langs"})

public class LangServlet extends HttpServlet {

    private LangRepository repository;
    private ObjectMapper mapper;

    private final Logger logger = LoggerFactory.getLogger(LangServlet.class);

    @SuppressWarnings("unused")
    public LangServlet() {
        this(new LangRepository(),new ObjectMapper());
    }

    public LangServlet(LangRepository repository,ObjectMapper mapper) {

        this.repository = repository;
        this.mapper=mapper;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Request goes from LangServlet" + getServletName());
       resp.setContentType("application/json;charset=UTF-8");
mapper.writeValue(resp.getOutputStream(),repository.findAll());
    }
}
