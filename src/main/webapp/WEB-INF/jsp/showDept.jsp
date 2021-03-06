<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
        integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
          integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
          crossorigin="anonymous"></script>
  <title>show</title>
<body>
<div class="container">
  <h1>Dept Page</h1>
  <table class="table table-striped table-bordered table-hover">
    <tr>
      <th>deptno</th>
      <th>dname</th>
      <th>operator</th>
    </tr>
    <c:forEach items="${list}" var="item">
      <tr>
        <td>${item.deptno}</td>
        <td>${item.dname}</td>
          <%--<td><img src="/Images/bg1.jpg" alt="error"></td>--%>
        <td>
          <span><button class="btn btn-primary btn-sm" onclick="handleUpdateEmp(${item.deptno})">编辑</button></span>
          <span><button class="btn btn-danger btn-sm" onclick="handleDeleteEmp(${item.deptno})">删除</button></span>
        </td>
      </tr>
    </c:forEach>
  </table>
  <a href="/dept/add">
    <button>添加</button>
  </a>
</div>
<script>
  function handleDeleteEmp(id) {
    // alert(id)
    if (confirm("确定删除吗？")) {
      window.location.href = '/dept/remove/' + id
    }
  }

  function handleUpdateEmp(id) {
    window.location.href = '/dept/update/' + id
  }
</script>
</body>
</html>