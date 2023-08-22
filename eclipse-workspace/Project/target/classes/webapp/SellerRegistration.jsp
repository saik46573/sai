<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center"> SELLER REGISTRATION </h1>
	<form action="SellerRegister" method ="post">
		<table align="center" cellpadding="10px" style=" border-collapse:collapse">
			<tr>
				<td>FULLNAME</td>
				<td><input type ="text" name="Sellerfullname"></td>
			</tr>
			<tr>
				<td>MOBILE</td>
				<td><input type ="text" name="SellerMobile"></td>
			</tr>
			<tr>
				<td>SELLER USERNAME</td>
				<td><input type ="text" name="SellerUserName"></td>
			</tr>
			<tr>
				<td>SELLER PASSWORD</td>
				<td><input type ="text" name="SellerPassword"></td>
			</tr>
			<tr>
				<td><input type ="submit" value="register"></td>
				<td><a href="AdminLogin.jsp "><input type ="button" value="Admin Loginpage" ></a></td>
			</tr>
		</table>
	</form>

</body>
</html>