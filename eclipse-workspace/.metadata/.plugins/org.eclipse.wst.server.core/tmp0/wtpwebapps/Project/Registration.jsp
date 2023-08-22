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
	<form action="userRegister" method ="post">
		<table align="center" cellpadding="10px" style=" border-collapse:collapse">
			<tr>
				<td>FULLNAME</td>
				<td><input type ="text" name="fullname"></td>
			</tr>
			<tr>
				<td>MOBILE</td>
				<td><input type ="text" name="mobile"></td>
			</tr>
			<tr>
				<td>USERNAME</td>
				<td><input type ="text" name="username"></td>
			</tr>
			<tr>
				<td>PASSWORD</td>
				<td><input type ="text" name="password"></td>
			</tr>
			<tr>
				<td><input type ="submit" value="register"></td>
				<td><a href="index.jsp "><input type ="button" value="Go to User page" ></a></td>
			</tr>
		</table>
	</form>
</body>
</html>