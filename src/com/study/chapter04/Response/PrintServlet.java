package com.study.chapter04.Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @description: 使用response对象发送消息
 * @Author: Mutong
 * @Date: 2019/11/27 16:34
 */
@WebServlet(name = "PrintServlet")
public class PrintServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String data  = "中国";
        PrintWriter print = response.getWriter();
        print.write(data);
//        OutputStream out = response.getOutputStream();
//        out.write(data.getBytes());
    }
}
