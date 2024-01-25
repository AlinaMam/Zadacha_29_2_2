package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

public class TestFilter implements Filter {
    private static final Logger logToFile = LoggerFactory.getLogger(TestFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String ipAddress = servletRequest.getRemoteAddr();
        logToFile.info("IP address: " + ipAddress);
        logToFile.info("Date: " + new Date());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}