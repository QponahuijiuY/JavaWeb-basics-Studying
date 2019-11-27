package com.study.example;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2019/11/27 0:20
 */
@WebServlet(name = "HelloWorldServlet06")
public class HelloWorldServlet06 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        ServletContext context = this.getServletContext();
        //获取文件绝对路径
        String path = context
                .getRealPath("/WEB-INF/classes/itcast.properties");
        FileInputStream in = new FileInputStream(path);
        Properties pros = new Properties();
        pros.load(in);
        out.println("Company=" + pros.getProperty("Company") + "<br>");
        out.println("Address=" + pros.getProperty("Address") + "<br>");
    }
}
