<%--
  Created by IntelliJ IDEA.
  User: TengSir
  Date: 2018/8/4
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>index</title>
</head>
<body>
nav
<hr>
<a href="/login.jsp">login</a>&nbsp;<a href="/register.jsp">register</a>&nbsp;
<hr style="color:red">
<c:if test="${not empty user}">
welcome ${user.username}!
</c:if>
</body>
</html>
