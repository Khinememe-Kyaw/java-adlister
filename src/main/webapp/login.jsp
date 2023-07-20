<%--
  Created by IntelliJ IDEA.
  User: khinememekyaw
  Date: 7/20/23
  Time: 5:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<c:if test='${pageContext.request.method.equalsIgnoreCase("POST")}'>
    <c:if test="${param.username == 'admin' && param.password == 'password'}">
      <% response.sendRedirect("/profile.jsp"); %>
        c:else <p >Invalid username or password. Please try again.</p>
    </c:if>
</c:if>
<form action="login.jsp" method="POST">
    <label for="username">Username:</label>
    <input type="text" name="username" id="username">
    <br/>
    <label for="password">Password:</label>
    <input type="password" name="password" id="password">
    <input type="submit">
</form>
</body>
</html>