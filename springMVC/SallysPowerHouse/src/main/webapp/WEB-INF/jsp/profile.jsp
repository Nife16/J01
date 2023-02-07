<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Document</title>
                <link rel="stylesheet" href="/css/home.css">
                <script src="https://kit.fontawesome.com/d8359c02fc.js" crossorigin="anonymous"></script>
            </head>

            <body class="flex-col">
                <div class="header flex-row">

                    <div class="hamburger flex-col">
                        <i class="fa-solid fa-bars fa-xl"></i>
                        <c:choose>
                            <c:when test="${account != null}">
                                <div class="dropdown flex-col">
                                    <a href="/" class="header-links">Home</a>
                                    <a href="/signOut" class="header-links">Sign Out</a>
                                    <a href="/profile" class="header-links">Profile</a>
                                </div>
                            </c:when>
                            <c:otherwise>
                                <div class="dropdown flex-col">
                                    <a href="/signUp" class="header-links">Sign Up</a>
                                    <a href="/" class="header-links">Home</a>
                                    <a href="/signIn" class="header-links">Sign In</a>
                                </div>
                            </c:otherwise>
                        </c:choose>
                    </div>

                </div>
                <div class="main-content">
                    <form:form modelAttribute="account" action="/profile/${account.id}/${account.address.id}" method="post">
                        <div class="sign-up-box flex-col">
                            <h1>Account Info!!!!</h1>
                            <label>Name</label>
                            <form:input type="text" class="" path="name" />
                            <label>Phone Number</label>
                            <form:input type="text" class="" path="phoneNumber" />
                            <label>Email</label>
                            <form:input type="text" class="" path="email" />
                            <label>Password</label>
                            <form:input type="password" class="" path="password" />
                            <h1>Address!!!!</h1>
                            <label>Street</label>
                            <form:input type="text" class="" path="address.street" />
                            <label>City</label>
                            <form:input type="text" class="" path="address.city" />
                            <label>State</label>
                            <form:input type="text" class="" path="address.state" />
                            <label>Zip Code</label>
                            <form:input type="text" class="" path="address.zipCode" />
                            <form:button type="submit">SUBMIT</form:button>
                        </div>
                    </form:form>
                </div>
            </body>

            </html>