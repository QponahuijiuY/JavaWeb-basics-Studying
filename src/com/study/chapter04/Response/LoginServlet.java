package com.study.chapter04.Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description: response请求重定向
 * @Author: Mutong
 * @Date: 2019/11/29 9:40
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式
        response.setContentType("text/html;charset=utf-8");
        // 用HttpServletRequest对象的getParameter()方法获取用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // 假设用户名和密码分别为：tyut和123
        if (("tyut").equals(username) &&("123").equals(password)) {
            // 如果用户名和密码正确，重定向到 welcome.html
            response.sendRedirect("/webprojects/welcome.html");
        } else {
            // 如果用户名和密码错误，重定向到login.html
            response.sendRedirect("/webprojects/login.html");
        }
    }
}
