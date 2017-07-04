<%-- 
    Document   : login
    Created on : Jul 4, 2017, 8:32:12 AM
    Author     : sengx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
    </head>
    <body>

        <h1>Login page!</h1>
        <form action="LoginServlet" method="POST">
            <table border="1">
                <tr>
                    <td>Username : </td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Password : </td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Login!"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
