<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<style>
		body {
				  background-image: url('https://www.keybps.com/wp-content/uploads/2019/09/SmartCities.jpg');
				  background-repeat: no-repeat;
				  background-attachment: fixed;
				  background-size: cover;
			}
			.button
			{
			   font-size:20px;
			    padding: 15px 32px;
			}
	</style>
</head>
<body>
<h1 align="center" style="color:yellow" > WELCOME TO SMART CITY </h1>
<form action="PlilgrimLogin" method="post">
	<table  align="center" cellpadding="20px" cellspacing="20px" style="border-collapse: collapse">
	<tr>
	<td style="color:coral">PILGRIM NAME:</td>
	
	<td> <input type= "text" name="pilgrimname"></td>
	</tr>
	<tr>
	<td>PASSWORD:</td>
	<td> <input type= "text" name="password" ></td>
	</tr>
	<tr>
	<td></td>
	<td><input type="submit" value="login"></td>
	<td><a href="index.jsp"> <input type= "button" value="cancel" ></a></td>
	</tr>
	<tr>
	<td></td>
	<td>  NOT AT REGISTER  </td>
	</tr>
	<tr>
	<td></td>
	<td><a href="Registration.jsp"><input type="button" value="Register"></a></td>
	</tr>
	<tr>
	<td><a href="AdminLogin.jsp"><input type="button" value="Admin"></a></td>
	<td><a href="SellerLogin.jsp"><input type= "button" value="seller"></a></td>
	</tr>
	</table>
</form>
</body>
</html>