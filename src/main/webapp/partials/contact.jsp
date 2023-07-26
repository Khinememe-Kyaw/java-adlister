<%--
  Created by IntelliJ IDEA.
  User: khinememekyaw
  Date: 7/20/23
  Time: 9:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1>Anything I can help you with? </h1>
<form action="contact.jsp" method="POST">
    <label for="name">Name:</label>
    <input type="text" name="name" id="name">
    <br/><br/>
    <label for="phone">Phone Number:</label>
    <input type="number" name="phone" id="phone">
    <br/><br/>
    <label for="email">Email:</label>
    <input type="text" name="email" id="email">
    <br/><br/>
    <input type="submit">
</form>

