package com.study.example;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description: 一个Web应用中的所有Servlet共享同一个ServletContext对象,所以ServletContext对象的域属性可以被该Web应用 中的所有Servlet访问.
 * @Author: Mutong
 * @Date: 2019/11/27 0:10
 */
@WebServlet(name = "HelloWorldServlet04")
public class HelloWorldServlet03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        // 通过setAttribute()方法设置属性值
        context.setAttribute("data", "this servlet save data");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
