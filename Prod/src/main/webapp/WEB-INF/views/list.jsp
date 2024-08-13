<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>hello hi list</h1>
 <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Number</th>
                <th>Product</th>
                <th>Action</th>
                <th>Action</th>
                           
        </thead>
        <tbody>
            <c:forEach var="emp" items="${employees}">
                <tr>
                    <td>${emp.id}</td>
                    <td>${emp.name}</td>
                    <td>${emp.email}</td>
                    <td>${emp.number}</td>
                    <td>${emp.product}</td>
                    <td><a href="edit/${emp.id}">Edit</a></td>
                    <td><a href="delete/${emp.id}">Delete</a></td>
                    
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>