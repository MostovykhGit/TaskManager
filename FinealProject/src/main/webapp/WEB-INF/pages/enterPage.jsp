<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>EnterPage</title>
</head>
<body>
<c:url value="/" var="var"/>
<form action="${var}" method="POST">
    <label for="login1">Login</label>
    <input type="text" name="login1" id="login1">
    <label for="password1">Password</label>
    <input type="text" name="password1" id="password1">
    <input type="submit" value="Enter manager">

</form>


<label>${usersList.get(root).password}</label>




<table>
    <tr>
        <th>name</th>
        <th>surname</th>
        <th>login</th>
        <th>password</th>
    </tr>

    <c:forEach var="user" items="${usersList}">
        <tr>
            <td>${user.getValue().name}</td>
            <td>${user.getValue().surname}</td>
            <td>${user.getValue().login}</td>
            <td>${user.getValue().password}</td>
        </tr>
    </c:forEach>
</table>



<a href="/registration">Registration</a>
</body>
</html>