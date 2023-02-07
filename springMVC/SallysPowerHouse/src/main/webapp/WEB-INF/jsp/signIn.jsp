<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/css/home.css">
    <link rel="stylesheet" href="/css/signUp.css">
    <script src="https://kit.fontawesome.com/d8359c02fc.js" crossorigin="anonymous"></script>
</head>

<body class="flex-col">
    <div class="header flex-row">
        <div class="hamburger flex-col">
            <i class="fa-solid fa-bars fa-xl"></i>
            <div class="dropdown flex-col">
                <a href="/signUp" class="header-links">Sign Up</a>
                <a href="/" class="header-links">Home</a>
                <a href="/signIn" class="header-links">Sign In</a>
            </div>
        </div>

    </div>
    <div class="main-content">
        <form:form modelAttribute="account" action="signIn" method="post">
            <div class="sign-up-box flex-col">
                    <h1>Sign In!!!!</h1>
                    <label>Email</label>
                    <form:input type="text" class="" path="email" />
                    <label>Password</label>
                    <form:input type="password" class="" path="password" />
                    <form:button type="submit">SUBMIT</form:button>
            </div>
        </form:form>
    </div>
</body>

</html>