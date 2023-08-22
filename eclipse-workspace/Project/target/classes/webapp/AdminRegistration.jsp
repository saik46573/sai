<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center"> REGISTRATION </h1>
	<form action="Admin_Register" method ="post">
		<table align="center" cellpadding="10px" style=" border-collapse:collapse">
			<tr>
				<td>AdminNAME</td>
				<td><input type ="text" name="Adminname"></td>
			</tr>
			<tr>
				<td>MOBILE</td>
				<td><input type ="text" name="Adminmobile"></td>
			</tr>
			<tr>
				<td>ADMIN USERNAME</td>
				<td><input type ="text" name="AdminUserName"></td>
			</tr>
			<tr>
				<td>ADMIN PASSWORD</td>
				<td><input type ="text" name="AdminPassword"></td>
			</tr>
			<tr>
				<td><input type ="submit" value="register"></td>
				<td><a href="AdminLogin.jsp "><input type ="button" value="Admin Loginpage" ></a></td>
			</tr>
		</table>
	</form>

</body>
</html>