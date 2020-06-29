<%@ page import="com.example.parkingManagement.model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.github.pagehelper.PageInfo" %>
<%@ page import="com.example.parkingManagement.service.UserService" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8"/>
  <title>登录</title>
  <link rel="stylesheet" href="<%=request.getContextPath() %>/css/signin.css">
  <link rel="stylesheet" href="<%=request.getContextPath() %>/css/bootstrap.min.css">
  <style type="text/css">
    body {
      padding-top: 50px;
    }

    .starter-template {
      padding: 40px 15px;
      text-align: center;
    }
  </style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Spring Boot+JSP</a>
    </div>
    <div id="navbar" class="collapse navbar-collapse">
      <ul class="nav navbar-nav">
      </ul>
    </div>
  </div>
</nav>
<div class="container">
  <div class="starter-template">
    <h2>登录</h2>
    <form class="form-signin" role="form" name="form" action="/login" method="post">
      <div class="form-group">
        <label for="username">用户名</label>
        <input type="text" class="form-control" name="username" value="" placeholder="用户名"/>
      </div>
      <div class="form-group">
        <label for="password">密码</label>
        <input type="password" class="form-control" name="password" placeholder="密码"/>
      </div>
      <input type="submit" id="login" value="Login" class="btn btn-primary"/>
    </form>
  </div>
  <div>
    <%
      List<User> result = userService.listUser(1, 20);
      //PageInfo包装结果，返回更多的分页相关信息
      PageInfo<User> pi = new PageInfo<User>(result);
      out.write(pi.toString());
//      out.write("<table border='1'><tr><td>用户id</td><td>用户昵称</td><td>用户姓名</td></tr><tr><td>1</td><td>asd</td><td>阿斯顿</td></tr><table>");
    %>
  </div>
  <table border='1'>
    <tr>
      <td>用户id</td>
      <td>用户昵称</td>
      <td>用户姓名</td>
    </tr>
    <tr>
      <td>1</td>
      <td>asd</td>
      <td>阿斯顿</td>
    </tr>
  </table>

</div>
</body>
</html>