<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Login Form</h2>
    
    <!-- Displays error message if login fails -->
    <p style="color:red;">${errorMessage}</p>

    <form action="${pageContext.request.contextPath}/login" method="POST">
        <label>Username:</label>
        <input type="text" name="username" required /><br/><br/>
        
        <label>Password:</label>
        <input type="password" name="password" required /><br/><br/>
        
        <input type="submit" value="Login" />
    </form>
</body>
</html>
