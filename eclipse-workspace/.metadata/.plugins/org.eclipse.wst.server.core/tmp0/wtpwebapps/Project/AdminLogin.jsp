<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">ADMIN LOGIN </h2>
<form action="Adminlogin" method="post">
	<table  align="center" cellpadding="10px" cellspacing="10px" style="border-collapse: collapse">
	<tr>
	<td>ADMIN USER NAME :</td>
	
	<td> <input type= "text" name="AdminUserName"></td>
	</tr>
	<tr>
	<td>ADMIN PASSWORD :</td>
	<td> <input type= "text" name="AdminPassword" ></td>
	</tr>
	<tr>
	<td></td>
	<td><input type="submit" value="login"></td>
	<td><a href="AdminLogin.jsp "> <input type= "button" value="cancel"></a></td>
	</tr>
	<tr>
	<td></td>
	<td>  NOT AT REGISTER  </td>
	</tr>
	<tr>
	<td></td>
	<td><a href="AdminRegistration.jsp"><input type="button" value="Register"></a></td>
	</tr>
	<tr>
	<td><a href="index.jsp"><input type="button" value="USER"></a></td>
	<td><a href="SellerLogin.jsp"> <input type= "button" value="SELLER"></a></td>
	</tr>
	</table>
</form>

</body>
</html>