package com.study.example;

import javax.servlet.ServletConfig;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @description:  在servlet运行期间,需要一些辅助的信息,比如文件使用的编码,使用servlet出现的共享等.这些信息可以在web.xml文件中使用一个或多个<init-param>元素进行配置.
 * 当初始化一个Servlet时,会将Servlet的配置信息封装到一个ServletConfig对象中,通过调用init(ServletConfig config)方法将这些ServletConfig对象传递给Servlet.
 * @Author: Mutong
 * @Date: 2019/11/18 10:08
 */


public class HelloWorldServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();
        //获得ServletConfig对象
        ServletConfig config = this.getServletConfig();
        //由ServletConfig对象根据name获取到value
        String param = config.getInitParameter("encoding");
        out.println("encoding="+param);



        }
    }


