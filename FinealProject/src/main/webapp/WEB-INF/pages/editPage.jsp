<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty task.description}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty task.description}">
        <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty task.description}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty task.description}">
    <c:url value="/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty task.description}">
        <input type="hidden" name="id" value="${task.id}">
    </c:if>
    <label for="priority">Priority</label>
    <input type="text" name="priority" id="priority">
    <label for="description">Description</label>
    <input type="text" name="description" id="description">
    <label for="isDone">Is done</label>
    <input type="text" name="isDone" id="isDone">

    <c:if test="${empty task.description}">
        <input type="submit" value="Add new film">
    </c:if>
    <c:if test="${!empty task.description}">
        <input type="submit" value="Edit film">
    </c:if>
</form>
</body>
</html>