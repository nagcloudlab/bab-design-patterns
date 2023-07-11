package com.example.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter(
        filterName = "TransferRequestLogFilter",
        urlPatterns = {"/"})
public class TransferRequestLogFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        System.out.println("TransferRequestLogFilter-" + httpServletRequest.getRequestURI());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
