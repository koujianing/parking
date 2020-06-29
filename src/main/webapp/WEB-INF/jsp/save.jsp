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
<%--这个页面是显示insert结果的--%>
<div>保存成功， <span id="second">5</span>秒后跳转</div>

<script>
  var sec = 4;
  // 获取#second DOM对象
  var oTime = document.getElementById('second');
  // 设置定时器
  var timer = setInterval(function () {
    // 修改#second对象中内容
    oTime.innerHTML = sec;
    sec--;
    // 如果剩余时间清空
    if (sec === 0) {
      // 清除定时器
      clearInterval(timer);
      // 跳转页面
      window.location.href = '/showTest'
    }
  }, 1000);

  // setTimeout(function () {
  //   window.location.href = './show'
  // }, 5000)
</script>
</body>
</html>