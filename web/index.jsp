<%--
  Created by IntelliJ IDEA.
  User: Mutong
  Date: 2019/11/18
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<p>用户登陆</p>
<form action="/RefreshServlet">
  账号:<input type="text" name="name"><br>
  密码:<input type="password" name="pwd"><br>
  爱好:<input type="checkbox" name="hobby" value="sing">唱歌
       <input type="checkbox" name="hobby" value="dance">跳舞
       <input type="checkbox" name="hobby" value="football">足球
<br>
  <input type="submit" value="提交"><br>
  <input type="reset" value="重置">
</form>
  </body>
</html>
