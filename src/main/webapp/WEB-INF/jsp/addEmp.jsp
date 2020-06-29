<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
  <%--<link rel="stylesheet" href="<%=request.getContextPath() %>/css/bootstrap.min.css">--%>
  <title>add</title>
</head>
<%--<%--%>
<%--pageContext.getRequest().getContextPath()--%>
<%--%>--%>
<body>
<%-- form中的submit点击后    会发起一个请求  但是也会跳转页面   你这里是跳转到save.do  而且是post--%>
<%-- 你之前写的是save.do 跳转到save.do   不是不行    但是还是正常点写吧--%>
<form action="${pageContext.request.contextPath}/${router}" method="post">
  <input type="text" name="empno" value="${data.empno > 0 ? data.empno : -1}" style="display: none;">
  <p>
    <span>姓名：</span>
    <input type="text" name="ename" value="${data.ename}">
  </p>
  <p>
    <span>性别：</span>
    <input type="text" name="sex" value="${data.sex}">
  </p>
  <p>
    <span>deptno：</span>
    <input type="text" name="deptno" value="${data.deptno}">
  </p>
  <p>
    <input type="submit" value="保存">
  </p>
</form>
</body>
</html>