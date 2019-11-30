package com.study.chapter05.example2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2019/11/29 11:23
 */
@WebServlet("LoginServlet2")
public class LoginServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkCode = request.getParameter("check_code");
        String savedCode = (String) request.getSession().getAttribute(
                "check_code");
        PrintWriter pw = response.getWriter();
        if (("tyut").equals(username) && ("123").equals(password)
                && checkCode.equals(savedCode)) {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/webprojects/IndexServlet");
        } else if (checkCode.equals(savedCode)) {
            pw.write("用户名或密码错误，登录失败");
        } else {
            pw.write("验证码错误");
        }
    }
}
