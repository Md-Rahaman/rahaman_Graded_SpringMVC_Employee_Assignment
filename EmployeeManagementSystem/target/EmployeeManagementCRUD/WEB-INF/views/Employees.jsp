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
<title>Employee Page</title>
<style type="text/css">
body {
	background-color: aqua;
}
</style>
</head>
<body>

	<h4 align="center">
		<a href="addEmployee">Add Record</a>
	</h4>


	<div align="center">
		<h3 align="center">Employee List</h3>
		<table class="tg" table border="1" cellpadding="5">

			<tr>
				<th width="120">Employee Name</th>
				<th width="120">Employee Address</th>
				<th width="120">Employee Phone</th>
				<th width="120">Employee Salary</th>
				<th width="60">Action1</th>
				<th width="60">Action2</th>
			</tr>
			<c:forEach items="${listEmployee}" var="employee">
				<tr>
					<td>${employee.empName}</td>
					<td>${employee.empAddress}</td>
					<td>${employee.empPhone}</td>
					<td>${employee.empSalary}</td>
					<td><a href="<c:url value='/edit/${employee.empId}'/>">Update</a></td>
					<td><a href="<c:url value='/remove/${employee.empId}' />">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>