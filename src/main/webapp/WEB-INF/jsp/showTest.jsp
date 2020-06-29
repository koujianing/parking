<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ include file="headerTemplate.jsp" %>
<div class="container">
  <h1>Test Page</h1>
  <table class="table table-striped table-bordered table-hover">
    <tr>
      <th>id</th>
      <th>name</th>
      <th>operator</th>
    </tr>
    <c:forEach items="${list}" var="item">
      <tr>
        <td>${item.id}</td>
        <td>${item.name}</td>
          <%--<td>${item.ename}</td>--%>
          <%--<td><img src="/Images/bg1.jpg" alt="error"></td>--%>
        <td>
          <span><button class="btn btn-primary btn-sm" onclick="handleUpdateEmp(${item.id})">编辑</button></span>
          <span><button class="btn btn-danger btn-sm" onclick="handleDeleteEmp(${item.id})">删除</button></span>
        </td>
      </tr>
    </c:forEach>
  </table>
  <a href="/test/add">
    <button>添加</button>
  </a>
</div>
<script>
  function handleDeleteEmp(id) {
    // alert(id)
    if (confirm("确定删除吗？")) {
      window.location.href = '/test/remove/' + id
    }
  }

  function handleUpdateEmp(id) {
    window.location.href = '/test/update/' + id
  }
</script>
</body>
</html>