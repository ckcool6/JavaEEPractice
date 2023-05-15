package com.practice.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.stream.Stream;

public class ServletDemo9 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        ServletContext context = getServletContext();
        String value = context.getInitParameter("globalEncoding");
        System.out.println(value);
        String contextPath = context.getContextPath();
        System.out.println(contextPath);
        context.setAttribute("user","jk001");
        String string = context.getAttributeNames().toString();
        System.out.println(string);
        //System.out.println(attributeNames);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
