<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<title>Title</title>
		
		<link rel="stylesheet" href="./main.css">
		<link rel="stylesheet" href="./calculator.css">
	</head>
	<body>
		<form action="calculator">
			<div class="row">
				<label for="first-number-input">First Number</label>
				<input id="first-number-input" type="number" name="first-number">
			</div>
			<div class="row">
				<label for="second-number-input">Second Number</label>
				<input id="second-number-input" type="number" name="second-number">
			</div>
			<div class="row">
				<button type="submit">Add</button>
			</div>
		</form>
		
		<h2>Result: ${result}</h2>
	</body>
</html>
