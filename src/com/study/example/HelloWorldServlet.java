package com.study.example;

import javax.servlet.ServletConfig;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2019/11/18 10:08
 */


public class HelloWorldServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
//
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();

        //设置编码格式
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UFT-8");
        //由name属性来获取到值value
        String name = request.getParameter("name");
        String password = request.getParameter("pwd");
        out.println("账号1:"+name);
        out.println("密码2:"+password);
        //多重选项由name属性获取到value
        String hobby[] = request.getParameterValues("hobby");
        for (int i = 0;i < hobby.length;i++){
            out.println("爱好:"+hobby[i]);
        }





        //获得ServletConfig对象
        ServletConfig config = this.getServletConfig();
        //由ServletConfig对象根据name获取到value
        String param = config.getInitParameter("encoding");
        out.println("encoding="+param);


        //得到ServletContext对象
//        ServletContext context = this.getServletContext();
//        //得到包含所有初始化参数名的Enumeration对象
//        Enumeration<String> paramNames = context.getInitParameterNames();
//
//        while (paramNames.hasMoreElements()){
//            String name = paramNames.nextElement();
//            String value = context.getInitParameter(name);
//            out.println(name+":"+value);
        }
    }
//    public void init(ServletConfig config)throws ServletException{
//        System.out.println("init method is called");
//    }
//    public void service(ServletRequest request, ServletResponse response) throws ServletException{
//        System.out.println("hello world");
//    }
//    public void destroy(){
//        System.out.println("destory method is called");
//    }
//}

