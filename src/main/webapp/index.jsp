<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title> Hello World</title>
</head>
<body>
<h1><%= "User Login" %>
</h1>
<form action="login" method="Post">

    <label>Enter Your E-Mail:</label>
    <input type="email" name="email" />
    <br/>
    <br/>

    <label>Enter Your Password:</label>
    <input type="password" name="password" />
    <br/>
    <br/>


    <input type="submit" value="Submit" />
</form>
</body>
</html>