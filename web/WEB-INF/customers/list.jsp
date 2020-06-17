<%@ taglib prefix="for" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="controllers.model.Customer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Transfer</title>
</head>
<body>
<table>
    <caption>Customers List</caption>

    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    <for:forEach items="${customers}" var="customer">
        <tr>
            <td><a href="./customers?action=info&id=${customer.getId()}">${customer.getId()}</a></td>
            <td>${customer.getName()}</td>
            <td>${customer.getEmail()}</td>
            <td>${customer.getAddress()}</td>
        </tr>
    </for:forEach>
</table>
</body>
</html>