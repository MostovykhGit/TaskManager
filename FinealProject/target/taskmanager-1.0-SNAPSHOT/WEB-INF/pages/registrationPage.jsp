<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>RegistrationPage</title>
</head>
<body>
<c:url value="/registration" var="var"/>
<form action="${var}" method="POST">
    <label for="name">Name</label>
    <input type="text" name="name" id="name">
    <label for="surname">Surname</label>
    <input type="text" name="surname" id="surname">
    <label for="login">Login</label>
    <input type="text" name="login" id="login">
    <label for="password">Password</label>
    <input type="text" name="password" id="password">
    <input type="submit" value="Registrate">

</form>

</body>
</html>