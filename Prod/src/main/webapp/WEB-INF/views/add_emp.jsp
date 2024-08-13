<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
<script type="text/javascript">
    function validateForm() {
        var id = document.getElementById("id").value;
        var name = document.getElementById("name").value;
        var email = document.getElementById("email").value;
        var number = document.getElementById("number").value;
        var product = document.getElementById("product").value;
        
        if (id === "" || isNaN(id) || id <= 0) {
            alert("Please enter a valid ID.");
            return false;
        }
        if (name === "") {
            alert("Please enter a name.");
            return false;
        }
        var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!emailPattern.test(email)) {
            alert("Please enter a valid email address.");
            return false;
        }
        var numberPattern = /^\d+$/;
        if (!numberPattern.test(number)) {
            alert("Please enter a valid number.");
            return false;
        }
        if (product === "") {
            alert("Please enter a product.");
            return false;
        }
        return true;
    }
</script>
</head>
<body>
<h1>employee</h1>
 <form action="createe" method="post" onsubmit="return validateForm()">
        <div>
            <label for="id">ID:</label>
            <input type="number" id="id" name="id" >
        </div>
        <div>
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" >
        </div>
        <div>
            <label for="email">Email:</label>
            <input type="text" id="email" name="email" >
        </div>
        <div>
            <label for="number">Number:</label>
            <input type="text" id="number" name="number" >
        </div>
        <div>
            <label for="product">Product:</label>
            <input type="text" id="product" name="product" >
        </div>
        <div>
            <button type="submit">Submit</button>
        </div>
    </form>
    
    <a href="Lists">List</a>
</body>
</html>