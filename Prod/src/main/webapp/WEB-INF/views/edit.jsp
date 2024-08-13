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

<h1>update</h1>
 <form action="${pageContext.request.contextPath}/updateEmp" method="post">
      <!--  <!--  <div>
            <label for="id">ID:</label>
            <input type="number" id="id" name="id" value="" required>
        </div> --> 
        <input type="hidden" name="id" value="${emp.id}">
        <div>
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" value="${emp.name}" required>
        </div>
        <div>
            <label for="email">Email:</label>
            <input type="text" id="email" name="email" value="${emp.email}" required>
        </div>
        <div>
            <label for="number">Number:</label>
            <input type="text" id="number" name="number" value="${emp.number}" required>
        </div>
        <div>
            <label for="product">Product:</label>
            <input type="text" id="product" name="product" value="${emp.product}" required>
        </div>
        <div>
            <button type="submit">Submit</button>
        </div>
    </form>
    
    <a href="Lists">List</a>

</body>
</html>