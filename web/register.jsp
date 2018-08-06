<%--
  Created by IntelliJ IDEA.
  User: TengSir
  Date: 2018/8/4
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<form action="/user/register" method="post">
    username:<input type="text" name="username"><br>
    password:<input type="password" name="password" ><br>
    sex:<input type="radio" name="sex" value="m" checked>male <input type="radio" name="sex" value="f" >female<br>
    age:<select name="age">
        <C:forEach var="a" begin="1" end="100">
            <option value="${a}">${a}岁</option>
        </C:forEach>
    </select><br/>
    <input type="submit" value="register"/>
</form>
</body>
</html>
