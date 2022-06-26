<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>TASKS</title>
</head>
<body>

<h2>Tasks</h2>
<table>
    <tr>
        <th>id</th>
        <th>priority</th>
        <th>description</th>
        <th>isDone</th>
        <th>action</th>
    </tr>

    <c:forEach var="task" items="${tasksList}">
        <tr>
            <td>${task.id}</td>
            <td>${task.priority}</td>
            <td>${task.description}</td>
            <td>${task.isDone}</td>
            <td>
                <a href="/edit/${task.id}">edit</a>
                <a href="/delete/${task.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new film</a>
</body>
</html>