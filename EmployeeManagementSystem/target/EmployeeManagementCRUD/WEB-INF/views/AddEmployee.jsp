<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee Page</title>
<style type="text/css">
body {
	background-color: pink;
}
</style>
</head>
<body>
	<div align="center">
		<h2>Lets add employee</h2>

		<form action="jspToController" method="post" commandName="employee">
			<table border="2" cellpadding="3">
				<tr>
					<td width="120"><b>Employee Name</b></td>
					<td><input type="text" name="empName" size="45" /></td>
				</tr>

				<tr>
					<td width="130"><b>Employee Address</b></td>
					<td><input type="text" name="empAddress" size="45" /></td>
				</tr>

				<tr>
					<td width="120"><b>Employee Phone</b></td>
					<td><input type="text" name="empPhone" size="45" /></td>
				</tr>

				<tr>
					<td width="120"><b>Employee Salary</b></td>
					<td><input type="text" name="empSalary" size="45" /></td>
				</tr>

				<tr>
					<td align="center"><input type="submit" value="Submit" /></td>

					<td align="center"><input type="reset" value="Reset" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>