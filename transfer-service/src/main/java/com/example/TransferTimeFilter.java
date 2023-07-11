package com.example;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.time.LocalTime;

@Component
@Order(2)
public class TransferTimeFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        if (request.getRequestURI().equals("/api/transfer")) {
            System.out.println("TransferTimeFilter-" + request.getRequestURI());
            LocalTime localTime = LocalTime.now();
            if (localTime.isAfter(LocalTime.of(12, 00))) {
                response.sendRedirect("/timeout.html");
            }
        }
        filterChain.doFilter(request, response);

    }
}
