<%@ taglib prefix="for" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="controllers.model.Customer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table>
    <caption>Customers List</caption>

    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
        <tr>
            <td>${name}</td>
            <td>${email}</td>
            <td>${address}</td>
        </tr>

</table>
</body>
</html>