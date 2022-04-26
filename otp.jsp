<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Security</title>
</head>
<style>
body{
	  background-image: url('https://images.pexels.com/photos/129731/pexels-photo-129731.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1');
      background-repeat: no-repeat;
      background-size: cover;
}
form{
   		padding-left:20px;
}
h1{
		margin:30px;
}
.txt{
		width: 500px;
        padding: 5px;
        border: 1px solid black;
        
}
.link{
        text-decoration: none;
}
</style>
<body>
<%=request.getParameter("phone") %>
<div align="center">
<form action="process.jsp" method="post">
<h1>OTP Validation</h1>
Enter OTP:<input type="number" name="otpvalue"/><br><br>
<input type="submit" value="submit" />
</form>
</div>
</body>
</html>