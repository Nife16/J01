<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>Sign Up</title>
                <link rel="stylesheet" type="text/css" href="/css/signUp.css" />
            </head>
            <body class="flex-col">
                <div class="header full-width flex-row">
                    <form:form modelAttribute="personSigningUp" action="signUp" method="post">
                        <div class="form-group col-md-6">
                            <label for="inputName">Name</label>
                            <form:input path="name" type="text" />
                        </div>
                        <div class="form-group col-md-6">
                            <label for="inputName">Email</label>
                            <form:input path="email" type="text" />
                        </div>
                        <div class="form-group col-md-6">
                            <label for="inputName">Password</label>
                            <form:input path="password" type="password"  />
                        </div>
                        <form:button type="submit">Submit</form:button>
                    </form:form>
                </div>
            </body>

            </html>