<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result</title>
</head>
<body>
<h2>Search Result</h2>
<table>
<tr>
<th>Id</th>
<th>Codes</th>
<th>Name</th>
<th>Type</th>
<th>delete</th>
<th>update</th>
</tr>
<c:forEach items="${locations}" var="Location">
<td>${location.id}</td>
<td>${location.codes}</td>
<td>${location.name}</td>
<td>${location.type}</td>
</c:forEach>

</table>
</body>
</html>