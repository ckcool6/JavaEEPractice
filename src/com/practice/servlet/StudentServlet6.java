package com.practice.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentServlet6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //define a price
        int money = 1000;
        //get recourse path
        String path = req.getRequestURI();
        path = path.substring(path.lastIndexOf("/"));
        if ("/vip".equals(path)) {
            System.out.println("原价为：" + money + "，优惠后为：" + (money * 0.9));
        } else if ("/vvip".equals(path)) {
            System.out.println("原价为：" + money + "，优惠后为：" + (money * 0.5));
        } else {
            System.out.println("不打折" + money);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
