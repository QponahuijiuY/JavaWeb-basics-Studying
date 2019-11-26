package com.study.example;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @description: 获取web应用程序的初始化参数,<context-param></context-param>里面的配置信息
 * @Author: Mutong
 * @Date: 2019/11/26 23:08
 */
@WebServlet(name = "HelloWorldServlet02")
public class HelloWorldServlet02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        // 得到ServletContext对象
        ServletContext context = this.getServletContext();
        // 得到包含所有初始化参数名的Enumeration对象
        Enumeration<String> paramNames = context.getInitParameterNames();
        // 遍历所有的初始化参数名，得到相应的参数值，打印到控制台
        out.println("all the paramName and paramValue are following:");
        // 遍历所有的初始化参数名，得到相应的参数值并打印
        while (paramNames.hasMoreElements()) {
            String name = paramNames.nextElement();
            String value = context.getInitParameter(name);
            out.println(name + ": " + value);
            out.println("<br>");
        }
    }
}
