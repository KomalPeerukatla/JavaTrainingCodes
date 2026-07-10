<%@ page language="java" contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<title>Login Form</title>

<link rel="stylesheet"
      href="${pageContext.request.contextPath}/css/style.css">

</head>

<body>

<div class="container">

    <h1>Welcome to Your First Spring MVC Application</h1>

    <form>

        <input type="text"
               placeholder="Enter Username">

        <input type="password"
               placeholder="Enter Password">

        <button type="submit">
            Login
        </button>

    </form>

</div>

</body>
</html>