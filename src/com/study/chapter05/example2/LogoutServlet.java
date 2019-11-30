package com.study.chapter05.example2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2019/11/29 10:54
 */
@WebServlet("LogoutServlet")
public class LogoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 将Session对象中的User对象移除
        request.getSession().removeAttribute("user");
        response.sendRedirect("/webprojects/IndexServlet");
    }
}
