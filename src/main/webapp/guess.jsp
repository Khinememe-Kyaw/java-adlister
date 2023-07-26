<%--
  Created by IntelliJ IDEA.
  User: khinememekyaw
  Date: 7/26/23
  Time: 7:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
<form action="/guess" method="POST">
    <h1>Pick between 1 to 3</h1>
    <select>
        <option type="int" name="number">1</option>
        <option type="int" name="number">2</option>
        <option type="int" name="number">3</option>
    </select>
</form>
</body>
</html>
