package com.study.chapter05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2019/11/27 14:42
 */
@WebServlet("/LastAccessServlet")
public class LastAccessServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 指定服务器输出内容的编码方式UTF-8，防止发生乱码
        response.setContentType("text/html;charset=utf-8");
        String lastAccessTime = null;
        // 获取所有的cookie，并将这些cookie存放在数组中
        Cookie[] cookies = request.getCookies();
        // 遍历cookies数组
        for (int i = 0; cookies != null && i < cookies.length; i++) {
            if ("lastAccess".equals(cookies[i].getName())) {
                // 如果cookie的名称为lastAccess,则获取该cookie的值
                lastAccessTime = cookies[i].getValue();
                break;
            }
        }
        // 判断是否存在名称为lastAccess的cookie
        if (lastAccessTime == null) {
            response.getWriter().print("您是首次访问本站！！！");
        } else {
            response.getWriter().print("您上次的访问时间是： "
                    + lastAccessTime);
        }
        // 创建cookie,将当前时间作为cookie的值发送给客户端
        String currentTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
                .format(new Date());
        Cookie cookie = new Cookie("lastAccess",currentTime);
        //cookie.setMaxAge(60*60); //设置cookie最大存在时间
        // 发送 cookie
        response.addCookie(cookie);
    }
}
