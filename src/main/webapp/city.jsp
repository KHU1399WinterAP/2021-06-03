<jsp:useBean id="city" scope="request" type="java.lang.String"/>
<jsp:useBean id="date" scope="request" type="java.lang.String"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<title>City</title>
		
		<link rel="stylesheet" href="./main.css">
	</head>
	<body>
		<h2>${city}</h2>
		<h3>${date}</h3>
	</body>
</html>
