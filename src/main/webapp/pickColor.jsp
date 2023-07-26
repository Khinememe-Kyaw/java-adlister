<%--
  Created by IntelliJ IDEA.
  User: khinememekyaw
  Date: 7/26/23
  Time: 6:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
    <form action="/pickcolor" method="POST">
        <select name ="color">
            <<option name ="color" value="aqua">aqua</option>
            <option name ="color" value="darksalmon">darksalmon</option>
            <option name ="color" value="cornflowerblue">cornflowerblue</option>
        </select>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
